package Test_Cases;

import org.testng.annotations.Test;

import Page_Object.HomePage;
import Utilities.Read_Config;

public class TC_002_Multiple_Products extends BaseClass_Login {

	@Test
	public void multiple_product() throws InterruptedException {

		Read_Config rc = new Read_Config();

		String firstname = rc.first_name();
		String lastname = rc.last_name();
		String Zip = rc.zip_code();

		HomePage hp = new HomePage(driver);

		hp.bag_add();
		Thread.sleep(1500);
		hp.light_add();
		Thread.sleep(1500);
		hp.tshirt_add();
		Thread.sleep(1500);
		hp.jacket_add();
		Thread.sleep(1500);
		hp.onesie_add();
		Thread.sleep(1500);
		hp.red_add();
		Thread.sleep(1500);
		hp.Cart();
		Thread.sleep(1500);
		hp.Chck_Out();
		Thread.sleep(1500);
		hp.First_name(firstname);
		Thread.sleep(1500);
		hp.Last_Name(lastname);
		Thread.sleep(1500);
		hp.Zip_Code(Zip);
		Thread.sleep(1500);
		hp.Continue();
		Thread.sleep(1500);
		hp.Finish();

	}

}
