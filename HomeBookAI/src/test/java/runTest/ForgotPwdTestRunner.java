package runTest;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ForgotPwd;

public class ForgotPwdTestRunner extends BaseClass {

	@Test
	void login() throws InterruptedException{
		
		ForgotPwd f = new ForgotPwd(driver);
		f.forgotPwd();
		f.enterEmail("Monikasarwaiya023@gmail.com");
	}
}
