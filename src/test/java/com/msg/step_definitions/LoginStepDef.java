package com.msg.step_definitions;

import org.junit.Assert;

import com.msg.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	@When("the user logs in using {string} and {string}")
	public void the_user_logs_in_using_and(String string, String string2) {
		HomePage hp = new HomePage();
		hp.login(string, string2);
	}

	@Then("the user should see the username {string} as the logged in user")
	public void the_user_should_see_the_username_as_the_logged_in_user(String expectedName) {
		HomePage hp = new HomePage();

		String actualName=hp.verifyLoggedInUserName();
		System.out.println("Actual Name : "+actualName);
		System.out.println("Expected Name : "+expectedName);
		Assert.assertEquals(expectedName,actualName);
		
		
	}

}
