import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteItems {
public static void deleteItemsTable() {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "root";
        Connection con = null;
        try {
            Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            Scanner sa=new Scanner(System.in);
        	System.out.println("Enter id that you want to delete: ");
            int idinput =sa.nextInt();
            int count=0;
            String sql ="DELETE FROM Items WHERE Items_id= '"+idinput+"'";
            st.executeUpdate(sql);
            System.out.println("Item deleted!!");
   
            }
        catch (Exception ex) {
            System.err.println(ex);
        }

}
}
