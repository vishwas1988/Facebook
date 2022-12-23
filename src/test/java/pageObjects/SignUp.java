package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends BasePage {

	public SignUp(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtSurname;

	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement txtMobileNo;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	WebElement txtNewpass;

	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
	}

	public void setSurname(String sname) {
		txtSurname.sendKeys(sname);
	}

	public void setMobileNo(String MoNo) {
		txtMobileNo.sendKeys(MoNo);
	}

	public void setNewPass(String NewPass) {
		txtNewpass.sendKeys(NewPass);
	}

}
