package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPwd {

	private WebDriver driver;
	
    public ForgotPwd(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//span[@class='text-sm text-blue-600 hover:text-blue-900 cursor-pointer pr-2']")
    WebElement forgotPwd;
    public void forgotPwd() {
    	forgotPwd.click();
    }
    
    @FindBy(xpath="//input[@id='input_your_working_email']")
    WebElement email;  
    @FindBy(xpath="//button[@type='button']")
    WebElement resetLink;
    
    public void enterEmail(String mail) {
    	email.sendKeys(mail);
    	resetLink.click();
    	System.out.println("A password reset link has been sent to your email");
    }
}
