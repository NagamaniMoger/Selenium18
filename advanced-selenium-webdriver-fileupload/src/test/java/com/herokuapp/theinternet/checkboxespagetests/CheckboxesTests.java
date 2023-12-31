package com.herokuapp.theinternet.checkboxespagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class CheckboxesTests extends TestUtilities{

	@Test
	public void selectingTwoCheckboxesTest() {
		log.info("Starting selecting TwoCheckboxes Test");
		
		//open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();
		
		//Click on Checkboxes link
		CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
		
		//Select All Checkboxes
		checkboxesPage.selectAllCheckboxes();
		
		//Verify all Checkboxes are checked
		Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes are checked");
	}

}
