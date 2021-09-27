package com.msg.step_definitions;

import java.util.List;

import org.junit.Assert;

import com.msg.pages.HomePage;
import com.msg.utilities.BrowserUtils;

import io.cucumber.java.en.Then;

public class MenuOptionsStepDef {
	@Then("the user should see following options")
	public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(20);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new HomePage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
	}
}
