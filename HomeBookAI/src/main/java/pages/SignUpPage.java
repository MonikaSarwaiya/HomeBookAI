package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//button[normalize-space()='Sign up']")
	WebElement signUpLink;
	
	public void gotoSignUp(){
		signUpLink.click();
	}
	
	@FindBy(xpath="//input[@id='input_first_name']")
	WebElement fname;
	
	public void firstName(String fn)  {
		fname.sendKeys(fn);
	}
	
	@FindBy(xpath="//input[@id='input_last_name']")
	WebElement lname;
	
	public void lastName(String ln)  {
		lname.sendKeys(ln);
	}
	
	@FindBy(xpath="//input[@id='input_your_working_email']")
	WebElement email;
	
	public void type_email(String mail)  {
		email.sendKeys(mail);
	}
	@FindBy(xpath="//input[@id='input_password']")
	WebElement password;
	
	public void enterPassword(String pwd)  {
		password.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@id='input_confirm_password']")
	WebElement confirmPwd;
	
	public void confirmPassword(String cpwd)  {
		confirmPwd.sendKeys(cpwd);
	}
	
	@FindBy(id="terms")
	WebElement checkBox;
	
	public void clickCheckBox()  {
		checkBox.click();
	}
	@FindBy(xpath="/html/body/div/div[3]/div[2]/div[1]/form/div[5]/div/div//iframe")
	WebElement frame;
	@FindBy(xpath="//div[@class='flex items-start gap-2 text-sm text-gray-700 ']//div")
	WebElement capcha;
	
	public void clickToVerify()  {
		driver.switchTo().frame(frame);
		capcha.click();
	}
	
	@FindBy(xpath="//div[@class='text-nowrap']")
	WebElement signUpButton;
	
	public void signUp() {
		signUpButton.click();
	}
}
