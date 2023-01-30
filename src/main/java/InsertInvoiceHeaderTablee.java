import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInvoiceHeaderTablee {
	public static void InsertInvoiceHeaderTablee() throws Throwable {
		 // Creating the connection using Oracle DB
     // Note: url syntax is standard, so do grasp
     String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";

     // Username and password to access DB
    
     // Custom initialization
     String user = "sa";
     String pass = "root";

     // Entering the data
     Scanner scanner = new Scanner(System.in);

     System.out.println(" Enter Tel :");
     String Tel = scanner.next();

     System.out.println("enter Fax");
     String Fax = scanner.next();

     System.out.println("enter Email");
     String Email = scanner.next();
     
     System.out.println("enter Website");
     String Website = scanner.next();

     // Inserting data using SQL query
     String sql = "insert into InvoiceHeader  values('" + Tel+ "','" + Fax + "','" + Email +"','"+Website+"')";

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




