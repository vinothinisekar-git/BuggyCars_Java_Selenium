package pages;


import utils.Reporter;
import wrappers.BuggyCarsWrappers;

public class HomePage extends BuggyCarsWrappers {

	public HomePage verifyTitle() {

		if(!verifyTitle("Buggy Cars Rating")){
			Reporter.reportStep("This is NOT Home page", "FAIL");
		}
		return this;
	}
	// Verify the username
	/*public HomePage verifyLoggedinUserName(String userName){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
		return this;
	}*/
	
	public HomePage clickRatingLink(){
		System.out.println("Before clicking Rating link");
		System.out.println("BuggyRating Link ::: XPath value = "+prop.getProperty("Home.Rating.Link"));
		clickByLink(prop.getProperty("Home.Rating.Link"));
		return this;
	}
	
	public HomePage clickByModel() {
		System.out.println("Before clicking Model link");
		System.out.println("BuggyRating Link ::: Model value = "+prop.getProperty("Home.RatingModel.Link"));
		clickByXpath(prop.getProperty("Home.RatingModel.Link"));
		return this;
	}

	public HomePage voteByModel(String comment) {
		System.out.println("Before clicking Model Comment");
		System.out.println("BuggyRating Link ::: Model Comment = "+prop.getProperty("Home.RatingModel.Comment"));
		enterByXpath(prop.getProperty("Home.RatingModel.Comment"), comment);
		clickByXpath(prop.getProperty("Home.RatingModel.Vote"));
		return this;
	}

	public HomePage clickPopularMakeLink() {
		System.out.println("Before clicking Poular Make link");
		System.out.println("BuggyRating Link ::: Make value = "+prop.getProperty("Home.PopularMake.Link"));
		clickByXpath(prop.getProperty("Home.PopularMake.Link"));
		return this;
	}

	public HomePage clickPopularMake() {
		System.out.println("Before clicking Poular Make link");
		System.out.println("BuggyRating Link ::: Make value = "+prop.getProperty("Home.RatingMake.Link"));
		clickByXpath(prop.getProperty("Home.RatingMake.Link"));
		return this;
	}

	public HomePage voteByMake(String comment) {
		System.out.println("Before clicking Make Comment");
		System.out.println("BuggyRating Link ::: Make Comment = "+prop.getProperty("Home.RatingMake.Comment"));
		enterByXpath(prop.getProperty("Home.RatingMake.Comment"), comment);
		clickByXpath(prop.getProperty("Home.RatingMake.Vote"));
		return this;
	}

	public ProfilePage clickProfile(){
		clickByLink(prop.getProperty("Home.Profile.Link"));
		return new ProfilePage();
	}

	public HomePage clickLogout(){
		clickByXpath(prop.getProperty("Home.LogoutButton.Xpath"));
		return new HomePage();
	}

}
