import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class MainMenu {
		public static void MainMenuFuncation() {
			List<String> Menu = Arrays.asList("***Welcome to the Main Menu ***\n"  
					+ " 1-  Shop Settings \n" 
					+ " 2-  Manage Shop Items  \n"
					+ " 3-  Create New Invoice \n"
					+ " 4-  Report: Statistics (No Of Items, No of Invoices, Total Sales)\n"
					+ " 5-  Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)\n"
					+ " 6-  Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)\n"
					+ " 7-  Program Statistics (Print each Main Menu Item with how many number selected)\n" + " 8-  Exit");

			for (String MasterMenue : Menu) {
				System.out.println(MasterMenue);
				
			}
		}

		public static void main(String[] args) throws Throwable {

			Scanner sc = new Scanner(System.in);

			do {
				MainMenuFuncation();

				int Menu = sc.nextInt();
				switch (Menu) {
				
				

			
				case 1:
					ShopSettings.ShopSettingSubMenue();
					
					break;

				
				case 2:
					ManageShopItems.ManageShopItemsSubMenu();
					break;

				case 3:

					break;

				case 4:

					break;

				case 5:

					break;

				case 6:

					break;

				case 7:

					break;

				case 8:

					break;
				
			
				

				}

			} while (true);

		}
	}