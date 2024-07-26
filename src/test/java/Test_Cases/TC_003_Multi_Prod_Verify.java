package Test_Cases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Page_Object.HomePage;
import Utilities.Read_Config;
import junit.framework.Assert;

public class TC_003_Multi_Prod_Verify extends BaseClass_Login {

	HomePage hp;

	@Test
	public void Add_Verify() throws InterruptedException, IOException {

		Read_Config rc = new Read_Config();

		String firstname = rc.first_name();
		String lastname = rc.last_name();
		String Zip = rc.zip_code();

		hp = new HomePage(driver);

		hp.bag_add();
		Thread.sleep(1500);
		WebElement remove_bag = driver.findElement(By.id("remove-sauce-labs-backpack"));
		if (remove_bag.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		hp.light_add();
		Thread.sleep(1500);
		WebElement remove_light = driver.findElement(By.id("remove-sauce-labs-bike-light"));
		if (remove_light.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		hp.tshirt_add();
		Thread.sleep(1500);
		WebElement remove_tshirt = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
		if (remove_tshirt.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		hp.jacket_add();
		Thread.sleep(1500);
		WebElement remove_jacket = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
		if (remove_jacket.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		hp.onesie_add();
		Thread.sleep(1500);
		WebElement remove_onesie = driver.findElement(By.id("remove-sauce-labs-onesie"));
		if (remove_onesie.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		hp.red_add();
		Thread.sleep(1500);
		WebElement remove_red = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
		if (remove_red.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

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
		Thread.sleep(1500);

		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("./Screenshots\\SauceDemo1.png");
		FileUtils.copyFile(src, f2);
		Thread.sleep(1500);

		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(1500);

	}
}
