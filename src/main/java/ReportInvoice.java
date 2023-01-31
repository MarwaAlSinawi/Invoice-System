import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReportInvoice {
	public static void ReportAllItemsTable(String url,String user,String pass) {
		
		Scanner sa = new Scanner(System.in);
		int count = 0;
		String sql = "SELECT Invoice.Invoice_id,Invoice.Invoice_date,customer.Customer_name, Customer.Number_of_items,Customer.Total_amount, Customer.Balance FROM Invoice\r\n"
				+ "Join Customer ON Customer.Customer_id=Invoice.Customer_id"; 

		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
	
		    System.out.println("Invoice_id : "+result.getInt("Invoice_id"));
			System.out.println("Customer name : "+result.getString("Customer_name"));
			System.out.println("Invoice_date : "+ result.getDate("Invoice_date"));
			System.out.println("Number_of_items: "+result.getInt("Number_of_items"));
			System.out.println("Total_amount: "+result.getFloat("Total_amount"));
			System.out.println("Balance: "+result.getFloat("Balance"));
			}
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}



	}
	}



