import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManageShopItems {
	
		public static void ManageShopItemsSubMenu(String url,String user,String pass) throws Throwable {
			List<String> menuItemsList = Arrays.asList(
					"***Welcome to the Item Services Menue *** \n"
			+ " 1-  Add Items \n" 
			+ " 2-  Delete Items  \n"
			+ " 3-  Change Item Price\n"
			+ " 4-  Report All Items \n" 
			+ " 5)  Go Back");
			for (String ManageShopItemsSubMenuTwo : menuItemsList) {
				System.out.println(ManageShopItemsSubMenuTwo);
				
			}

			Scanner sc = new Scanner(System.in);
			boolean ExitShopItem = true;

			do {

				int subMenu = sc.nextInt();
				switch (subMenu) {

				case 1:
					AddItemsTable.AddItems(url,user, pass);
					ManageShopItemsSubMenu(url,user, pass);

					break;

				case 2:
					DeleteItems.deleteItemsTable(url,user, pass);
					ManageShopItemsSubMenu(url,user, pass);
					break;

				case 3:
					ChangeItemPrice.ChangePrice(url,user, pass);
					ManageShopItemsSubMenu(url,user, pass);
					break;

				
				case 4:
					ReportAllItems.ReportAllItemsTable();
					ManageShopItemsSubMenu(url,user, pass);
					break;
				case 5:
					ExitShopItem = false;

					break;
					


				}

			} while (ExitShopItem);

		}
	}

