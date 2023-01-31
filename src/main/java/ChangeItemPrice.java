import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ChangeItemPrice {
	public static void ChangePrice() {
		
    	
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
        	System.out.println("Enter id that you want to change the price : ");
            int idinput =sa.nextInt();
            System.out.println("Enter  price : ");
            int priceInput =sa.nextInt();
            int count=0;
            String sql = "UPDATE Items SET Items_unit_price ="+priceInput+" WHERE Items_id = "+idinput;
            System.out.println("the price has been updated!!");
            ResultSet rs=st.executeQuery(sql);
            }
        catch (Exception ex) {
            System.err.println(ex);
        }

}
}
