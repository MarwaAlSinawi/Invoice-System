import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCustomer {
	public static void InsertIntoCustomer(String url, String user, String pass) throws Throwable {
		 // Creating the connection using Oracle DB
     // Note: url syntax is standard, so do grasp
   

     // Entering the data
     Scanner scanner = new Scanner(System.in);

     System.out.println(" Enter Customer_name :");
     String Customer_name = scanner.next();

     System.out.println("enter Customer_phone_number");
     String Customer_phone_number = scanner.next();

     System.out.println("enter invoice_date");
     String invoice_date = scanner.next();
     
     System.out.println("enter Number_of_items ");
     Integer Number_of_items  = scanner.nextInt();
     
     System.out.println("enter Total_amount");
     Float Total_amount  = scanner.nextFloat();
     
     System.out.println("enter Paid_amount");
     Float Paid_amount  = scanner.nextFloat();
     
     System.out.println("enter Balance");
     Float Balance  = scanner.nextFloat();
     

     // Inserting data using SQL query
     String sql = "insert into  Customer  values('" + Customer_name+ "','" + Customer_phone_number + "','" + invoice_date +"','"+Number_of_items+"','"+Total_amount+"','"+Paid_amount+"','"+Balance +"')";

     // Connection class object
     Connection con = null;

     // Try block to check for exceptions
     try {

         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
         // Registering drivers
         DriverManager.registerDriver(driver);

         // Reference to connection interface
         con = DriverManager.getConnection(url, user,
                 pass);

         // Creating a statement
         Statement st = con.createStatement();

         // Executing query
         int m = st.executeUpdate(sql);
         if (m >=  1)
             System.out.println(
                     "inserted successfully : " + sql);
         else
             System.out.println("insertion failed");

         // Closing the connections
         con.close();
     }

     // Catch block to handle exceptions
     catch (Exception ex) {
         // Display message when exceptions occurs
         System.err.println(ex);
     }
	}

}


