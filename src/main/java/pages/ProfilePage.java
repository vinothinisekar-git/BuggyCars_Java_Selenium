package pages;



import utils.Reporter;
import wrappers.BuggyCarsWrappers;

public class ProfilePage extends BuggyCarsWrappers {


	public ProfilePage() {

		if (!verifyTitle("Buggy Cars Rating")) {
			Reporter.reportStep("This is NOT login page", "FAIL");
		}
	}

	// Enter current password
	public ProfilePage enterCurrentPassword(String pass) {
		enterByXpath(prop.getProperty("Profile.CurrentPassword.XPath"), pass);
		return this;
	}

	// Enter new password
	public ProfilePage enterNewPassword(String pass) {
		enterByXpath(prop.getProperty("Profile.NewPassword.XPath"), pass);
		return this;
	}

	// Enter confirm password
	public ProfilePage enterConfirmPassword(String pass) {
		enterByXpath(prop.getProperty("Profile.ConfirmPassword.XPath"), pass);
		return this;
	}

	// Enter the Hobby
	public ProfilePage enterHobby(String hobby) {
		selectById(prop.getProperty("Profile.Hobby.Id"), hobby);
		return this;
	}

	// Click Save
	public HomePage clickSave() {
		System.out.println("Login Page: Login Button:: XPath value::: "+prop.getProperty("Profile.SaveButton.XPath"));
		clickByXpath(prop.getProperty("Profile.SaveButton.XPath"));
		return new HomePage();
	}


}

