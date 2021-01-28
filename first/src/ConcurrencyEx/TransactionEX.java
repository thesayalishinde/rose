package ConcurrencyEx;

class TransactionDeposit implements Runnable{
	int amount;
	TransactionEX accountX;
	TransactionDeposit(TransactionEX x, int amount){
		accountX = x;
		this.amount = amount;
		
		new Thread(this).start();
	}
	
	public void run(){
		accountX.deposit(amount);
	}
}

class TransactionWithdraw implements Runnable{
	int amount;
	TransactionEX accountY;
	
	TransactionWithdraw(TransactionEX y, int amount) {
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		accountY.withdraw(amount);
	}
}

public class TransactionEX {
	static int balance = 1000, deposit, withdraw;
	public int accountNo;

	synchronized void withdraw(int amount) {
		balance = balance - amount;
printBal();
	}

	synchronized void deposit(int amount) {
		balance = balance + amount;
		printBal();
	}

	void printBal() {
		System.out.println("Balance is : " + balance);
	}

	public static void main(String[] args) {
		TransactionEX ABC = new TransactionEX();
		//ABC.accountNo = 111;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(ABC, 200);
		t2 = new TransactionWithdraw(ABC,800);
	}

}
