import java.util.Arrays;
import java.util.List;

public class Menue {
	public static void displayAlTypeMenus(Integer option) {
		List<String> Menu = Arrays.asList("***Welcome to the Main Menu ***\n" + " 1-  CreatingTables \n"
				+ " 2-  Shop Settings \n" + " 3-  Manage Shop Items  \n" + " 4-  Create New Invoice \n"
				+ " 5-  Report: Statistics (No Of Items, No of Invoices, Total Sales)\n"
				+ " 6-  Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)\n"
				+ " 7-  Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)\n"
				+ " 8-  Program Statistics (Print each Main Menu Item with how many number selected)\n" + " "
				+ " 9-  Exit");

		List<String> ShopSettingSubMenue = Arrays.asList("*** Welcome to the Shop Services Menu ***\n "
				+ "1- Load Data Shop\n" + "2- Load Data Items \n" + "3- Load Data Customer\n" + "4- Load Data Invoice\n"
				+ "5- Set Shop Name\n" + "6- Set Invoice Header (Tel / Fax / Email / Website \n" + "7- Go Back");

		List<String> menuItemsList = Arrays.asList("***Welcome to the Item Services Menue *** \n" + " 1-  Add Items \n"
				+ " 2-  Delete Items  \n" + " 3-  Change Item Price\n" + " 4-  Report All Items \n" + " 5)  Go Back");

		switch (option) {
		case 1:
			printMenue(Menu);
			break;
		case 2:
			printMenue(ShopSettingSubMenue);
			break;
		case 3:
			printMenue(menuItemsList);
			break;
		}
	}

	public static void printMenue(List<String> printAllMenue) {
		for (String allMenue : printAllMenue) {
			System.out.println(allMenue);

		}

	}

}
