import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShopSettings {

	public static void ShopSettingSubMenue() throws Throwable {

		List<String> ShopSettingSubMenue = Arrays.asList(
				"*** Welcome to the Shop Services Menu ***\n "
						+ "1-  Load Data Shop\n" 
						+ "2-  Load Data Items \n" 
						+ "3-  Load Data Customer\n" 
						+ "4-  Load Data Invoice\n" 
						+ "5-  Set Shop Name\n"
						+ "6-  Set Invoice Header (Tel / Fax / Email / Website \n" 
						+ "7-  Go Back");

		for (String shopSetting : ShopSettingSubMenue) {
			System.out.println(shopSetting);

		}

		Scanner sc = new Scanner(System.in);
		boolean Exit = true;

		do {

			int ShopSettingSubMenueOne  = sc.nextInt();
			switch (ShopSettingSubMenueOne) {

			case 1:
				InsertData.InsertIntoShop();
				ShopSettings.ShopSettingSubMenue();
				
				break;

			case 2:
				InsertInvoice.InsertIntoInvoice();
				break;

			case 3:
				InsertCustomer.InsertIntoCustomer();
				break;
			case 4:
				InsertInvoiceTable.InsertIntoInvoiceTable();
				break;
			
			case 5:
				Exit = false;

				break;

			}

		} while (Exit);

	}
}
