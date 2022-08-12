package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.BuggyCarsWrappers;

public class TC004_RatingByMake extends BuggyCarsWrappers {

	@BeforeClass
	public void startTestCase() {
		browserName = "chrome";
		dataSheetName 	= "TC003_RatingByMake_Data";
		testCaseName 	= "TC002 - Rate the BuggyCars By Popular Make";
		testDescription = "Rating the Popular Make BuggyCars using POM Framework";
	}

	@Test(dataProvider="fetchData")
	public void buggyRating(String username, String password, String comment) {

		System.out.println("Inside TC002_ClickBuggyRatingLink class .........");
		new LoginPage()
				.enterUserName(username)
				.enterPassword(password)
				.clickLogin()
				.clickRatingLink()
				.clickPopularMakeLink()
				.clickPopularMake()
				.voteByMake(comment)
				.clickLogout();

		//.clickLoginForFailure()
		//.getErrorMessage();
	}
}
