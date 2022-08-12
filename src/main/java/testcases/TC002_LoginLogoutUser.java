package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.BuggyCarsWrappers;

public class TC002_LoginLogoutUser extends BuggyCarsWrappers {
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC002_LoginUser_Data";
		testCaseName 	= "TC002 - User Login and Logout";
		testDescription = "User Login and Logout using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginUserForBuggyCars(String username, String password) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();

		//.clickLoginForFailure()
		//.getErrorMessage();
	}

}
