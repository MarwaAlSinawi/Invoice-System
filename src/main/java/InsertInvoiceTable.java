import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInvoiceTable {
	public static void InsertIntoInvoiceTable() throws Throwable {
		 // Creating the connection using Oracle DB
    // Note: url syntax is standard, so do grasp
    String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";

    // Username and password to access DB
   
    // Custom initialization
    String user = "sa";
    String pass = "root";

    // Entering the data
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Enter Shop_id :");
    Integer Shop_id = scanner.nextInt();

    System.out.println("enter Customer_id");
    Integer Customer_id = scanner.nextInt();

    System.out.println("enter Invoice_date");
    String Invoice_date = scanner.next();
    
 
    

    // Inserting data using SQL query
    String sql = "insert into  Invoice   values('" + Shop_id+ "','" + Customer_id + "','" + Invoice_date +"')";

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

