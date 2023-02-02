import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
//		public static void MainMenuFuncation() {
//			List<String> Menu = Arrays.asList("***Welcome to the Main Menu ***\n"  
//					+ " 1-  CreatingTables \n" 
//					+ " 2-  Shop Settings \n"
//					+ " 3-  Manage Shop Items  \n"
//					+ " 4-  Create New Invoice \n"
//					+ " 5-  Report: Statistics (No Of Items, No of Invoices, Total Sales)\n"
//					+ " 6-  Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)\n"
//					+ " 7-  Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)\n"
//					+ " 8-  Program Statistics (Print each Main Menu Item with how many number selected)\n" + " "
//					+ " 9-  Exit");
//
//			for (String MasterMenue : Menu) {
//				System.out.println(MasterMenue);
//				
//			}
//		}

	public static void main(String[] args) throws Throwable {
		Scanner sa = new Scanner(System.in);
		Constraint cons = new Constraint();
		System.out.println("Enter Url");
		cons.setUrl(sa.next());

		System.out.println("Enter user");
		cons.setUser(sa.next());
		System.out.println("Enter password");
		cons.setPass(sa.next());

		boolean ExitMainMenue = true;
		do {
			Menue.displayAlTypeMenus(1);
			System.out.println("Enter number you want:");
			int Menu = sa.nextInt();
			switch (Menu) {

			case 1:
				CreatingTables.CreateCustomerTable(cons.getUrl(), cons.getUser(), cons.getPass());
				CreatingTables.CreateItemsTable(cons.getUrl(), cons.getUser(), cons.getPass());
				CreatingTables.CreateShopeTable(cons.getUrl(), cons.getUser(), cons.getPass());
				CreatingTables.CreatingInvoiceTable(cons.getUrl(), cons.getUser(), cons.getPass());
				CreatingTables.CreateShopTwo(cons.getUrl(), cons.getUser(), cons.getPass());
				CreatingTables.InvoiceHeader(cons.getUrl(), cons.getUser(), cons.getPass());

				break;

			case 2:
				ShopSettings.ShopSettingSubMenue(cons.getUrl(), cons.getUser(), cons.getPass());

				break;

			case 3:
				ManageShopItems.ManageShopItemsSubMenu(cons.getUrl(), cons.getUser(), cons.getPass());
				break;

			case 4:
				CreateNewInvoice.CreateNewInvoiceTable(cons.getUrl(), cons.getUser(), cons.getPass());
				break;

			case 5:
				ReportStatistics.Statistics(cons.getUrl(), cons.getUser(), cons.getPass());
				break;

			case 6:
				ReportInvoice.ReportAllItemsTable(cons.getUrl(), cons.getUser(), cons.getPass());
				break;

			case 7:
				SearchInvoice.SearchInvoiceTable(cons.getUrl(), cons.getUser(), cons.getPass());
				break;

			case 8:

				break;

			case 9:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 1 if you want to exit , if you dont want to exit press 2 ");

				int number = sc.nextInt();
				if (number == 1) {
					ExitMainMenue = false;// it will be stop
				}
				if (number == 2) {
					System.out.println("Your are logged out of the system");
					ExitMainMenue = true; // It will continue
				}

				// break;

			}

		} while (ExitMainMenue);

	}
}