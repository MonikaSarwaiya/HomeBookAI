package runTest;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ContinueWithGoogle;
import pages.ForgotPwd;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpTestRunner extends BaseClass{

	//-----------------SignUp-----------------
//	@Test
//	void signup() throws InterruptedException{
//		SignUpPage s = new SignUpPage(driver);
//		s.gotoSignUp();
//		s.firstName("Monika");
//		s.lastName("sharma");
//		s.type_email("m@gmail.com");
//		s.enterPassword("Monika@123456");
//		s.confirmPassword("Monika@123456");
//		s.clickCheckBox();
//		Thread.sleep(2000);
//		s.clickToVerify();
//		s.signUp();
//	}
//	
	//------------Login-----------------
	
	@Test
	void login() throws InterruptedException{
		LoginPage s = new LoginPage(driver);
		s.emailId("monikasarwaiya023@gmail.com");
		s.enterPassword("Mon@12345");
		s.signUp();
		Thread.sleep(2000);
	}
	
	//----------Forgot Password -----------------
	@Test
	void forgotpwd() throws InterruptedException{
		
		ForgotPwd f = new ForgotPwd(driver);
		f.forgotPwd();
		f.enterEmail("Monikasarwaiya023@gmail.com");
		Thread.sleep(2000);
	}
	@Test
	void continueWithGoogle()throws InterruptedException {
		
		ContinueWithGoogle c = new ContinueWithGoogle(driver);
		c.ContinueWithGoogleBtn();
}
}
