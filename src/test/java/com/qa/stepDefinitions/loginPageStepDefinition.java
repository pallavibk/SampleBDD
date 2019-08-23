package com.qa.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginPageStepDefinition extends TestBase{

	 
	 
	 LoginPage loginPage;
		HomePage homePage;
		
		public loginPageStepDefinition()
		{
			super();
			
		}
		
		@When("^user is already Logged in$")
	 	 public void user_already_on_login_page(){
	 		initialization();
	 		loginPage = new LoginPage();
	 	 }
	 	
	 	
	 	 @When("^title of login page is Free CRM$")
	 	 public void title_of_login_page_is_free_CRM(){
	 		String title =loginPage.validateLoginPageTitle();
	 		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

	 	 }
	 	 	
	 	 @Then("^user is on home page$")
	 	 public void user_is_on_hopme_page(){
	 		WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top skrollable skrollable-between']/div/div[@class='col-sm-4 col-md-4 pull-right']/form[@class='navbar-form']/div/div[@class='input-group-btn']/input")));
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	 	 }

}
