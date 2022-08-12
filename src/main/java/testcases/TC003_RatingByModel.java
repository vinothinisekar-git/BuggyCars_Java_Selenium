package testcases;

import org.testng.annotations.*;
//import pages.LoginPage;
//import pages.RegisterPage;
import pages.LoginPage;
import wrappers.BuggyCarsWrappers;

public class TC003_RatingByModel extends BuggyCarsWrappers {

	@BeforeClass
	public void startTestCase() {
		browserName = "chrome";
		dataSheetName 	= "TC003_RatingByModel_Data";
		testCaseName 	= "TC002 - Rate the BuggyCars By Popular Model";
		testDescription = "Rating the Popular Model BuggyCars using POM Framework";
	}

	@Test(dataProvider="fetchData")
	public void buggyRating(String username, String password, String comment) {

		System.out.println("Inside TC002_ClickBuggyRatingLink class .........");
		new LoginPage()
				.enterUserName(username)
				.enterPassword(password)
				.clickLogin()
				.clickRatingLink()
				.clickByModel()
				.voteByModel(comment)
				.clickLogout();

		//.clickLoginForFailure()
		//.getErrorMessage();
	}
}
