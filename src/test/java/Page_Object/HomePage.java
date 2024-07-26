package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver l_driver;

	public HomePage(WebDriver r_driver) {

		l_driver = r_driver;
		PageFactory.initElements(r_driver, this);

	}

	@FindBy(id = "item_4_title_link")
	WebElement Bagpack;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement bag_add;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement light_add;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement tshirt_add;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement jacket_add;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement onesie_add;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement tshirt_red_add;

	@FindBy(id = "add-to-cart")
	WebElement add;

	@FindBy(id = "shopping_cart_container")
	WebElement Cart;

	@FindBy(id = "checkout")
	WebElement checkout;

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement zipcode;

	@FindBy(id = "continue")
	WebElement cont;

	@FindBy(id = "finish")
	WebElement fin;

	public void BackPack() {
		Bagpack.click();
	}

	public void bag_add() {
		bag_add.click();
	}

	public void light_add() {
		light_add.click();
	}

	public void tshirt_add() {
		tshirt_add.click();
	}

	public void jacket_add() {
		jacket_add.click();
	}

	public void onesie_add() {
		onesie_add.click();
	}

	public void red_add() {
		tshirt_red_add.click();
	}

	public void Add() {
		add.click();
	}

	public void Cart() {
		Cart.click();
	}

	public void Chck_Out() {
		checkout.click();
	}

	public void First_name(String F_name) {
		firstname.sendKeys(F_name);
	}

	public void Last_Name(String L_name) {
		lastname.sendKeys(L_name);
	}

	public void Zip_Code(String Z_Code) {
		zipcode.sendKeys(Z_Code);
	}

	public void Continue() {
		cont.click();
	}

	public void Finish() {
		fin.click();
	}

}
