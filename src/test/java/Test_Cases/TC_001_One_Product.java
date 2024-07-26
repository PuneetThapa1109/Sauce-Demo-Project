package Test_Cases;

import org.testng.annotations.Test;
import Page_Object.HomePage;
import Utilities.Read_Config;

public class TC_001_One_Product extends BaseClass_Login {

	@Test
	public void One_Product() throws InterruptedException {

		Read_Config rc = new Read_Config();

		String F_NAME = rc.first_name();
		String L_NAME = rc.last_name();
		String Z_Code = rc.zip_code();

		HomePage lp = new HomePage(driver);

		lp.BackPack();
		Thread.sleep(1500);
		lp.Add();
		Thread.sleep(1500);
		lp.Cart();
		Thread.sleep(1500);
		lp.Chck_Out();
		Thread.sleep(1500);
		lp.First_name(F_NAME);
		Thread.sleep(1500);
		lp.Last_Name(L_NAME);
		Thread.sleep(1500);
		lp.Zip_Code(Z_Code);
		Thread.sleep(1500);
		lp.Continue();
		Thread.sleep(1500);
		lp.Finish();
		Thread.sleep(1500);

	}

}
