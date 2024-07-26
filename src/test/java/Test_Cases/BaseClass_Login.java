package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Page_Object.LoginPage;
import Utilities.Read_Config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Login {

	Read_Config rc = new Read_Config();

	public String URL = rc.URL();
	public String User_Name = rc.Username();
	public String Pass = rc.Password();
	public static WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(URL);

		LoginPage lp = new LoginPage(driver);

		lp.Set_Username(User_Name);
		Thread.sleep(1500);

		lp.Set_Password(Pass);
		Thread.sleep(1500);

		lp.Click_Login();
		Thread.sleep(1500);

		if (driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@AfterClass
	public void Teardown() {
		driver.quit();
	}

}
