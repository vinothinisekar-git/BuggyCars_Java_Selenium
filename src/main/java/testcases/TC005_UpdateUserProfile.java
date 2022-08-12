package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.BuggyCarsWrappers;

public class TC005_UpdateUserProfile extends BuggyCarsWrappers {
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC005_UpdateUserProfile_Data";
		testCaseName 	= "TC005 - Update User Profile";
		testDescription = "Update User with Additional Info such as new password and Hobby using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void updateUserProfile(String username, String password, String newPassword, String confirmPassword, String hobby) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickProfile()
		.enterCurrentPassword(password)
		.enterNewPassword(newPassword)
		.enterConfirmPassword(confirmPassword)
		.enterHobby(hobby)
		.clickSave()
		.clickLogout();


		//.clickLoginForFailure()
		//.getErrorMessage();
	}

}
