package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver l_driver;

	public LoginPage(WebDriver r_driver) {
		l_driver = r_driver;
		PageFactory.initElements(r_driver, this);
	}

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "login-button")
	WebElement button;

	public void Set_Username(String U_name) {
		username.sendKeys(U_name);
	}

	public void Set_Password(String Pass) {
		pass.sendKeys(Pass);
	}

	public void Click_Login() {
		button.click();
	}

}
