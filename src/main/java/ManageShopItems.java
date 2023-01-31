import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManageShopItems {
	
		public static void ManageShopItemsSubMenu() throws Throwable {
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
					AddItemsTable.AddItems();
					ManageShopItemsSubMenu();

					break;

				case 2:
					DeleteItems.deleteItemsTable();
					ManageShopItemsSubMenu();
					break;

				case 3:
					ChangeItemPrice.ChangePrice();
					ManageShopItemsSubMenu();
					break;

				
				case 4:
					ReportAllItems.ReportAllItemsTable();
					ManageShopItemsSubMenu();
					break;
				case 5:
					ExitShopItem = false;

					break;
					


				}

			} while (ExitShopItem);

		}
	}

