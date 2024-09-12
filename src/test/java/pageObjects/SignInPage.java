package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SignInPage {
	    WebDriver driver;

	    public SignInPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(xpath = "//span[@class='base']")
	    WebElement CustomerLogin;
	    
	    @FindBy(id = "email")
	    WebElement EmailField;

	    @FindBy(id = "pass")
	    WebElement PasswordField;

	    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	    WebElement SignInButton;

	    @FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in'][contains(text(),\"Welcome, Ranjeet Kumar\")]")
	    WebElement welcomeText;
	    
	    @FindBy(xpath = "//div[contains(text(),'The account sign-in was incorrect')]")
	    WebElement Errormsg;
	    
	    @FindBy(xpath = "//div[@id='pass-error']")
	    WebElement PassValidationMsg;
	    
	    @FindBy(xpath = "//div[@id='email-error']")
	    WebElement EmailValidationMsg;
	    
	    
	    public void CustomerLoginText() {
	    	
	    	CustomerLogin.isDisplayed();
	    } 

	    public void EnterEmailID(String email) {
	    	EmailField.sendKeys(email);
		 
	    } 
	    
	    public void Enterpwd(String pwd) {
	    	PasswordField.sendKeys(pwd);
		 
	    } 
	    public void clickSignInButton() {
	    	SignInButton.click();
	    }

	    public void verifySuccessfulSignup() {
	    	welcomeText.isDisplayed();
	    }

	    public void verifyErrorMessage() {
	    	Errormsg.isDisplayed();
	    }
	    
	    public void validatePasswordFieldRequired() {
	    	PassValidationMsg.isDisplayed();
	    }
	    
	    public void validateEmailFieldRequired() {
	    	EmailValidationMsg.isDisplayed();
	    }


}
