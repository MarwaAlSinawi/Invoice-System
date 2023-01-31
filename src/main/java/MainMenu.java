import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class MainMenu {
		public static void MainMenuFuncation() {
			List<String> Menu = Arrays.asList("***Welcome to the Main Menu ***\n"  
					+ " 1-  CreatingTables \n" 
					+ " 2-  Shop Settings \n"
					+ " 3-  Manage Shop Items  \n"
					+ " 4-  Create New Invoice \n"
					+ " 5-  Report: Statistics (No Of Items, No of Invoices, Total Sales)\n"
					+ " 6-  Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)\n"
					+ " 7-  Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)\n"
					+ " 8-  Program Statistics (Print each Main Menu Item with how many number selected)\n" + " "
					+ "9-  Exit");

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
					//CreatingTables.CreateCustomerTable();
					//CreatingTables.CreateItemsTable();
					//CreatingTables.CreateShopeTable();
					//CreatingTables.CreatingInvoiceTable();
					//CreatingTables.CreateShopTwo();
					CreatingTables.InvoiceHeader();
					
					break;

				
				case 2:
					ShopSettings.ShopSettingSubMenue();
				
					break;

				case 3:
					ManageShopItems.ManageShopItemsSubMenu();
					break;

				case 4:
					CreateNewInvoice.CreateNewInvoiceTable();
					break;

				case 5:
					ReportStatistics.Statistics();
					break;

				case 6:

					break;

				case 7:

					break;

				case 8:

					break;

				case 9:

					break;
			
				

				}

			} while (true);

		}
	}