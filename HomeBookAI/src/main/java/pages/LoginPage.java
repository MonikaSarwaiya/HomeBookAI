package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//input[@id='input_your_working_email']")
	WebElement email;
	
	public void emailId(String mail)  {
		email.sendKeys(mail);
	}
	
	@FindBy(xpath="//input[@id='input_password']")
	WebElement password;
	
	public void enterPassword(String pwd)  {
		password.sendKeys(pwd);
	}
	
	@FindBy(xpath="//div[@class='text-nowrap']")
	WebElement signUpButton;
	
	public void signUp() {
		signUpButton.click();
	}
	
}
