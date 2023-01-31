import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReportAllItems {
public static void ReportAllItemsTable() {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=InvoiceSystem;encrypt=true;trustServerCertificate=true";
	String user = "sa";
	String pass = "root";
	Scanner sa = new Scanner(System.in);
	int count = 0;
	String sql = "SELECT * FROM Items";

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
			int Items_id = result.getInt("Items_id");
			String Items_name = result.getString("Items_name");
			Float Items_unit_price = result.getFloat("Items_unit_price");
			Integer Items_quantity= result.getInt("Items_quantity");
			Integer Items_quantity_price = result.getInt("Items_quantity_price");
			

			System.out.println(Items_id + " " + Items_name + " " + Items_unit_price + " " + Items_quantity + " " + Items_quantity_price + " ");
			count++;

		}
		con.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}



}
}

