import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShopSettings {

	public static void ShopSettingSubMenue(String url,String user,String pass) throws Throwable {
		boolean Exit = true;
		do {

		List<String> ShopSettingSubMenue = Arrays.asList(
				"*** Welcome to the Shop Services Menu ***\n "
						+ "1- Load Data Shop\n" 
						+ "2- Load Data Items \n" 
						+ "3- Load Data Customer\n" 
						+ "4- Load Data Invoice\n" 
						+ "5- Set Shop Name\n"
						+ "6- Set Invoice Header (Tel / Fax / Email / Website \n" 
						+ "7- Go Back");

		for (String shopSetting : ShopSettingSubMenue) {
			System.out.println(shopSetting);

		}

		Scanner sc = new Scanner(System.in);

		

			int ShopSettingSubMenueOne  = sc.nextInt();
			switch (ShopSettingSubMenueOne) {

			case 1:
				InsertData.InsertIntoShop();
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;

			case 2:
				InsertItems.InsertIntoItems();
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;

			case 3:
				InsertCustomer.InsertIntoCustomer(url,user,pass);
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;
			case 4:
				InsertInvoiceTable.InsertIntoInvoiceTable();
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;
			
			case 5:
				SetShop.SetShopTwo();
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;
			case 6:
				InsertInvoiceHeaderTablee.InsertInvoiceHeaderTablee();
				ShopSettings.ShopSettingSubMenue(url,user,pass);
				
				break;
			case 7:
				Exit = false;

				break;

			}

		} while (Exit);

	}
}
