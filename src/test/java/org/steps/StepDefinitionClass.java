package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.LoginPagePom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass {
	public static BaseClass b = new BaseClass();
	public static LoginPagePom pom = new LoginPagePom();

	@Given("User Lauch the Browser")
	public void user_lauch_the_browser() {
		b.getDriver("Chrome");
		b.getUrl("https://para.testar.org/");
		System.out.println("URL launched Successfully");
	}

	@When("User Enters Login Crendtials {string} and {string}")
	public void user_enters_login_crendtials_and(String user, String pass) {
		try {
			WebElement username = pom.getUsername();
			b.keysSend(username, user);
			WebElement password = pom.getPassword();	
			password.sendKeys(pass);
			WebElement loginButton = pom.getLoginButton();
			loginButton.click();
			System.out.println("Logged In Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("User opens New Account")
	public void user_opens_new_account() {
		WebElement openNewAccount = pom.getOpenNewAccount();
		openNewAccount.click();
		WebElement type = pom.getType();
		b.getSelect("SelectByText", type, "SAVINGS", 0);
		WebElement finishNewAccount = pom.getFinishNewAccount();
		finishNewAccount.click();
		System.out.println("New Account Opened Successfully");
	}

	@Then("User Updates Contact Info")
	public void user_updates_contact_info() {
		pom = new LoginPagePom();
		WebElement updateContact = pom.getUpdateContact();
		updateContact.click();
		WebElement updateAddress = pom.getUpdateAddress();
		updateAddress.clear();
		updateAddress.sendKeys("13, Ram Nagar");
		WebElement updateProfile = pom.getUpdateProfile();
		updateProfile.click();
		System.out.println("Contact Information Successfully Updated");

	}
}
