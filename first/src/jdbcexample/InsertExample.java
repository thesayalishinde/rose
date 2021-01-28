package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "rose@789");
				Statement stmt = conn.createStatement();) {
			stmt.executeUpdate("insert into book " + "values('3', 'Chitra', 'Palace illusions', '300', '3')");
			stmt.executeUpdate("insert into book " + "values('4', 'Amish', 'The meluha', '150', '5')");
			stmt.executeUpdate("insert into book " + "values('5', 'SA', 'Gold Empire', '600', '8')");
			
			String strSelect = "select title, price, Quantity from book";
			System.out.println("The SQL statement is: " + strSelect + "\n");
			ResultSet rset = stmt.executeQuery(strSelect);
			int rowCount = 0;
			while (rset.next()) { // Move the cursor to the next row, return false if no more row
				String title = rset.getString("title");
				double price = rset.getDouble("price");
				int qty = rset.getInt("Quantity");
				System.out.println(title + ", " + price + ", " + qty);
				++rowCount;
			}
			System.out.println("Total number of records = " + rowCount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
