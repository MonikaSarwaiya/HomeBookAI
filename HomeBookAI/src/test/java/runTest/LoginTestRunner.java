package runTest;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTestRunner extends BaseClass {

	@Test
	void login() throws InterruptedException{
		LoginPage s = new LoginPage(driver);
		s.emailId("monikasarwaiya023@gmail.com");
		s.enterPassword("Mon@12345");
		s.signUp();
	}
}
