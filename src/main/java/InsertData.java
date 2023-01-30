import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
	public static void InsertIntoShop() throws Throwable {
		 // Creating the connection using Oracle DB
       // Note: url syntax is standard, so do grasp
       String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";

       // Username and password to access DB
      
       // Custom initialization
       String user = "sa";
       String pass = "root";

       // Entering the data
       Scanner scanner = new Scanner(System.in);

       System.out.println(" Enter Shop_name :");
       String Shop_name = scanner.next();

       System.out.println("enter Shop_tel_number");
       String Shop_tel_number = scanner.next();

       System.out.println("enter Shop_email");
       String Shop_email = scanner.next();
       
       System.out.println("enter Shop_website");
       String Shop_website = scanner.next();

       // Inserting data using SQL query
       String sql = "insert into Shop values('" + Shop_name+ "','" + Shop_tel_number + "','" + Shop_email + "','"+ Shop_website +"')";

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



