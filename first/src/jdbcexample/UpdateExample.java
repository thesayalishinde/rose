package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateExample {

	public static void main(String[] args) {

		Book b = new Book();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Id : ");
		int x = s.nextInt();
		System.out.print("Enter the name to be changed : ");
		String y = s.next();
		b.setAuthor(y);

		s.close();
		String strSelect = "UPDATE book SET title = ? WHERE id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "rose@789");
		// Statement stmt = conn.createStatement();
		) {
			PreparedStatement pstmt = conn.prepareStatement(strSelect);
			pstmt.setString(1, y);
			pstmt.setInt(2, x);
			pstmt.executeUpdate();

			System.out.println("Database updated successfully ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
