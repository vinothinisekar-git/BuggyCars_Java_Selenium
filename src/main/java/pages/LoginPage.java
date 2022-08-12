package pages;



import utils.Reporter;
import wrappers.BuggyCarsWrappers;

public class LoginPage extends BuggyCarsWrappers {


	public LoginPage() {

		if (!verifyTitle("Buggy Cars Rating")) {
			Reporter.reportStep("This is NOT login page", "FAIL");
		}
	}

	// Enter the user name
	public LoginPage enterUserName(String userdata) {
		enterByXpath(prop.getProperty("Login.UserName.XPath"), userdata);
		return this;
	}

	// Enter the password
	public LoginPage enterPassword(String pass) {
		enterByXpath(prop.getProperty("Login.Password.XPath"), pass);
		return this;
	}

	// Click Login
	public HomePage clickLogin() {
		System.out.println("Login Page: Login Button:: XPath value::: "+prop.getProperty("Login.Button.XPath"));
		clickByXpath(prop.getProperty("Login.LoginButton.XPath"));
		return new HomePage();
	}

	// Click Login
	/*public LoginPage clickLoginForFailure(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
	}

	public LoginPage getErrorMessage(){
		System.out.println(getTextByXpath("//*[@id='errorDiv']"));
		return this;
	}*/

}

