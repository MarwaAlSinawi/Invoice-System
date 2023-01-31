import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReportStatistics{
	public static void Statistics(String url,String user, String pass) throws Throwable {
		
	      
	      String sql = "Select count (*) AS NumberOFItems ,(Select COUNT (*) from Invoice) AS NumberOfInvice , SUM (Items_quantity_Price) AS totalprice  From Items ;";
	      Connection con = null;

	      // Try block to check for exceptions
	      try {

	          Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	          // Registering drivers
	          DriverManager.registerDriver(driver);

	          // Reference to connection interface
	          con = DriverManager.getConnection(url, user,
	                  pass);

	          PreparedStatement pstmt=con.prepareStatement(sql);
	        
	          ResultSet rs=pstmt.executeQuery();
 while(rs.next()) {
	 System.out.println("Number of Items : "+rs.getString("NumberOFItems"));
	 System.out.println("Number Invoices : "+rs.getString("NumberOfInvice"));
	 System.out.println("Total  : "+rs.getString("totalprice"));
 }
 

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

