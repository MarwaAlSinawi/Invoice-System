import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertItems{
	public static void InsertIntoItems() throws Throwable {
		 // Creating the connection using Oracle DB
      // Note: url syntax is standard, so do grasp
      String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";

      // Username and password to access DB
     
      // Custom initialization
      String user = "sa";
      String pass = "root";

      // Entering the data
      Scanner scanner = new Scanner(System.in);

      System.out.println(" Enter Items_name :");
      String Items_name = scanner.next();

      System.out.println("enter Items_unit_price");
      Float Items_unit_price = scanner.nextFloat();

      System.out.println("enter Items_quantity");
      Integer Items_quantity = scanner.nextInt();
      
      System.out.println("enter Items_quantity_price");
      Integer Items_quantity_price = scanner.nextInt();

      // Inserting data using SQL query
      String sql = "insert into Items  values('" + Items_name+ "','" + Items_unit_price + "','" + Items_quantity +"','"+Items_quantity_price+"')";

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


