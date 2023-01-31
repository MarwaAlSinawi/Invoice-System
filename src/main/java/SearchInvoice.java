import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchInvoice {
	public static void SearchInvoiceTable() {

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
    	System.out.println("Enter Invoice_id  that you to look for it ? ");
        int idinput =sa.nextInt();
        int count=0;
        String sql="select * from Invoice inner join Items ON Invoice.item_id= Items.Items_id where Invoice_id='"+idinput+"'";
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()&&count<=idinput) {
        	 int Invoice_id=rs.getInt("Invoice_id");
        	 int Shop_id=rs.getInt("Shop_id");
             Date Invoice_date= rs.getDate("Invoice_date");
             int Customer_id= rs.getInt("Customer_id");
             int item_id= rs.getInt("item_id");
             int Items_id= rs.getInt("Items_id");
             String Items_name= rs.getString("Items_name");
             Float Items_unit_price= rs.getFloat("Items_unit_price");
             String Items_quantity= rs.getString("Items_quantity");
             int Items_quantity_price= rs.getInt("Items_quantity_price");
            
             System.out.println(Invoice_id +"	"+Shop_id+"	"+Invoice_date+"	"+Customer_id+"	"+item_id+"	"+Items_id+"	"+Items_name+"	"+Items_unit_price+"	"+Items_quantity+"	"+Items_quantity_price);
             count++;
        }}
    catch (Exception ex) {
        System.err.println(ex);
    }	


}
}
