package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPOF;
import utilities.ConfigReader;
import utilities.LoggerLoad;


public class LoginSteps {
	
	//public WebDriver driver = new ChromeDriver();
	public LoginPOF loginpagefactory = new LoginPOF();
	//String homepageurl = ConfigReader.getApplicationUrl("url");
	

	
	@Given("The user is on the DS Algo Login Page")
	public void the_user_is_on_the_ds_algo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(homepageurl);
		//driver.get(homepageurl);
		LoggerLoad.info("Opening the Login Page");
		loginpagefactory.loginpage();
	}
	
	    

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		loginpagefactory.clickOnSignin();
		 System.out.println("The user succesfully clicked on signin button");
		loginpagefactory.enter_login_credentails(username,password);
		 System.out.println("The user succesfully entered  the username and password");
	    
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		loginpagefactory.clickonLogin();
		 System.out.println("The user succesfully clicked on signin button");
		
	}
	
	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
	    loginpagefactory.clickonLogout();
	    System.out.println("The user succesfully clicked on logout button");
	}

	@When("The user clicks on signout button")
	public void the_user_clicks_on_signout_button() {
	    
	    loginpagefactory.clickOnSignin();
	    System.out.println("The user succesfully clicked on signout button");
	}

	    
	    
	@Then("The user should be redirected to the DS Algo home page to enter email as {string} and password as {string}")
	public void the_user_should_be_redirected_to_the_ds_algo_home_page_to_enter_email_as_and_password_as(String username, String password) {
		loginpagefactory.clickOnSignin();
		loginpagefactory.enter_login_credentails(username,password);
		loginpagefactory.clickonLogin();
	    loginpagefactory.clickonLogout();
	    }
	




}
