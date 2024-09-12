package stepDifinitionss;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountCreationPage;
import pageObjects.SignInPage;

public class AccountCreationSteps{
	WebDriver driver;
	AccountCreationPage hp;
	SignInPage SI;
	String br;
	
	@Before
		public void setup()
		{
		
			br="chrome";
			
		}
	
	@After
		public void tearDown(Scenario scenario)
		{
			System.out.println("Scenario status =====>"+ scenario.getStatus());
			if(scenario.isFailed())
			{
				TakesScreenshot ts=(TakesScreenshot) driver;
				byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
			driver.quit();
		}
	
	@Given("User Launch browser")
	public void user_launch_browser(){

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp = new AccountCreationPage(driver);
	}

	@Given("opens URL {string}")
	public void opens_url(String string) {
	    driver.get(string);
	}

	@When("User navigate to Home Page")
	public void user_navigate_to_home_page() {
	    String tille=driver.getTitle();
	    Assert.assertEquals(tille, "Home Page");;
	}

	@When("click on Account Creation link")
	public void click_on_account_creation_link() {
	    hp.ClickAccount();
	    
	}

	@When("User enters FirstName as {string} Last Name as {string} Email id as {string} Password as {string} and Confirm Password as {string}")
	public void user_enters_first_name_as_last_name_as_email_id_as_password_as_and_confirm_password_as(String string, String string2, String string3, String string4, String string5) {
	    hp.EnterFirstName(string);
	    hp.EnterLastName(string2);
	    hp.EnterEmail(string3);
	    hp.EnterPwd(string4);
	    hp.EnterConfirmPwd(string5);
	}

	@When("Click on Create Account button")
	public void click_on_create_account_button() {
	    hp.ClickCreateAcc();
	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
	    hp.ValidateAccountCreation();
	    hp.logout();
	}
	
	@Then("Error message is showing already created with the same email")
	public void error_message_is_showing_already_created_with_the_same_email() {
	  hp.ValidateAccountCreation();
	}
	
	//=============================================
	
	@Given("click on Sign In link")
    public void click_on_sign_in_link() {
    	hp.SignInLink();
    	
    }

    @Then("Sign In page is opened")
    public void sign_in_page_is_opened() {
    	SI=new SignInPage(driver);
    	SI.CustomerLoginText();
    }

    @When("The user enters Email as {string} and password as {string}")
    public void the_user_enters_valid_email_as_and_password_as(String string, String string2) {
       SI.EnterEmailID(string);
       SI.Enterpwd(string2);
    }

    @When("Click on the sign In button")
    public void click_on_the_sign_in_button() {
       SI.clickSignInButton();
    }

    @Then("The user should be successfully Sign In")
    public void the_user_should_be_successfully_sign_in() {
        SI.verifySuccessfulSignup();
    }
    
    @Then("The user is getting Error message.")
    public void the_user_is_getting_error_message() {
        SI.verifyErrorMessage();
    }
    
    @Then("The user is getting validation message as This is a required field.")
    public void the_user_is_getting_validation_message_as_this_is_a_required_field() {
        // Write code here that turns the phrase above into concrete actions
        SI.validatePasswordFieldRequired();
    }

    @Then("The user is getting validation message as email and password is a required field.")
    public void the_user_is_getting_validation_message_as_email_and_password_is_a_required_field() {
        // Write code here that turns the phrase above into concrete actions
        SI.validateEmailFieldRequired();
        SI.validatePasswordFieldRequired();
    }



}
