import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTables {
	public static void CreatingInvoiceTable(String url,String user,String pass) {


		String CreateInvoiceTabel = "CREATE TABLE Invoice " + "(Invoice_id INTEGER PRIMARY KEY IDENTITY(1,1), "
				+ "Shop_id INTEGER, " + "Customer_id INTEGER,"
				+ " FOREIGN KEY (Shop_id) REFERENCES Shop(shop_id), " + " Invoice_date Date , "
				   + " FOREIGN KEY (Customer_id) REFERENCES Customer(Customer_id),"
				   + "item_id Integer , FOREIGN KEY (item_id) REFERENCES Items(Items_id)) ";

		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(CreateInvoiceTabel);
			if (m >= 0) {
				System.out.println("Created  Invoice table in given database...");
				
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

		
	

}public static void CreateCustomerTable (String url,String user,String pass) {


	String createCustomerTable = "CREATE TABLE Customer " + "(Customer_id INTEGER PRIMARY KEY IDENTITY(1,1), "
			+ " Customer_name VARCHAR(1000) , " + " Customer_phone_number VARCHAR (12) , "
			+ " invoice_date Date , " + " Number_of_items INTEGER , "
			+ " Total_amount FLOAT, " + "Paid_amount FLOAT, " + " Balance FLOAT)";
	Connection conn = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		int m = st.executeUpdate(createCustomerTable);
		if (m >= 0) {
			System.out.println("Created Customer table in given database...");
			
		} else {
			System.out.println(" table already Created in given database...");
		}
		conn.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}

}public static void CreateItemsTable (String url,String user,String pass) {

	
	String createItemsTabel = "CREATE TABLE Items " + "(Items_id INTEGER PRIMARY KEY IDENTITY(1,1), "
			+ " Items_name VARCHAR(100) , " + " Items_unit_price FLOAT , "
			+ " Items_quantity INTEGER , " + " Items_quantity_price INTEGER)";

	Connection conn = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		int m = st.executeUpdate(createItemsTabel );
		if (m >= 0) {
			System.out.println("Created  Items table in given database...");
			
		} else {
			System.out.println(" table already Created in given database...");
		}
		conn.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}
}public static void CreateShopeTable (String url,String user,String pass) {

	
	String CreateShopTabel = "CREATE TABLE Shop " + "(shop_id INTEGER PRIMARY KEY IDENTITY(1,1), "
			+ " Shop_name VARCHAR(100) , " + " Shop_tel_number VARCHAR (10) , "
			+ " Shop_email TEXT , " + " Shop_website TEXT "+"Tel VARCHAR(100) "+"Fax VARCHAR(100) "+" Email VARCHAR(100)  ) ";
	Connection conn = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		int m = st.executeUpdate( CreateShopTabel);
		if (m >= 0) {
			System.out.println("Created Shop table in given database...");
			
		} else {
			System.out.println(" table already Created in given database...");
		}
		conn.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}
	
}public static void CreateShopTwo (String url,String user,String pass) {


	String CreateShopTabel = "CREATE TABLE ShopTwo " + "(shop_id INTEGER PRIMARY KEY IDENTITY(1,1), "
			+ " Shop_name VARCHAR(100) )";
	Connection conn = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		int m = st.executeUpdate( CreateShopTabel);
		if (m >= 0) {
			System.out.println("Created Shop table in given database...");
			
		} else {
			System.out.println(" table already Created in given database...");
		}
		conn.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}
}public static void  InvoiceHeader(String url,String user,String pass) {

	String InvoiceHeader = "CREATE TABLE InvoiceHeader " + "( shop_id INTEGER," +"FOREIGN KEY (shop_id) REFERENCES ShopTwo (shop_id), "+ " Tel VARCHAR(100),"+"Fax VARCHAR(100), "+"Email VARCHAR(100), "+"Website VARCHAR(100))  ";
	Connection conn = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url, user, pass);
		Statement st = conn.createStatement();
		int m = st.executeUpdate( InvoiceHeader);
		if (m >= 0) {
			System.out.println("Created Shop table in given database...");
			
		} else {
			System.out.println(" table already Created in given database...");
		}
		conn.close();
	} catch (Exception ex) {
		System.err.println(ex);
	}
}
}

