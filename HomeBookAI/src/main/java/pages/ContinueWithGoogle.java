package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueWithGoogle {

	private WebDriver driver;
	
	public ContinueWithGoogle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='py-2']//button[1]")
    WebElement ContinueWithGoogleBtn;
    public void ContinueWithGoogleBtn() {
    	
    	ContinueWithGoogleBtn.click();
    }
}
