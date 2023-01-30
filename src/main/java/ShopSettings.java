import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShopSettings {

	public static void ShopSettingSubMenue() {

		List<String> ShopSettingSubMenue = Arrays.asList(
				"*** Welcome to the Shop Services Menu ***\n "
						+ "1-  Load Data \n" 
						+ " 2-  Set Shop Name\n"
						+ " 3-  Set Invoice Header (Tel / Fax / Email / Website \n" 
						+ " 4-  Go Back");

		for (String shopSetting : ShopSettingSubMenue) {
			System.out.println(shopSetting);

		}

		Scanner sc = new Scanner(System.in);
		boolean Exit = true;

		do {

			int ShopSettingSubMenueOne  = sc.nextInt();
			switch (ShopSettingSubMenueOne) {

			case 1:
				

				break;

			case 2:

				break;

			case 3:

				break;

			
			case 4:
				Exit = false;

				break;

			}

		} while (Exit);

	}
}
