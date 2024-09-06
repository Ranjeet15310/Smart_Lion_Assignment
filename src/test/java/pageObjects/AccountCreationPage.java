package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends BasePage{
	public AccountCreationPage(WebDriver driver)
	{
		super(driver);
	}

	    @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	    private WebElement CreateAccountLink;

	    @FindBy(xpath = "//input[@id='firstname']")
	    private WebElement FirstName;

	    @FindBy(xpath = "//input[@id='lastname']")
	    private WebElement lastName;
	    
	    @FindBy(xpath = "//input[@id='email_address']")
	    private WebElement Email;
	    @FindBy(xpath = "//input[@id='password']")
	    private WebElement Password;
	    @FindBy(xpath = "//input[@id='password-confirmation']")
	    private WebElement ConfirmPwd;
	    
	    @FindBy(xpath = "//button[@title='Create an Account']")
	    private WebElement CreateAccount;
	    
	    public void ClickAccount() {
	    	CreateAccountLink.click();
	    }
	    public void EnterFirstName(String name) {
	    	FirstName.sendKeys(name);
	    }
	    
	    public void EnterLastName(String Lname) {
	    	lastName.sendKeys(Lname);
	    }
	    public void EnterEmail(String email) {
	    	Email.sendKeys(email);
	    }
	    public void EnterPwd(String pwd) {
	    	Password.sendKeys(pwd);
	    }
	    public void EnterConfirmPwd(String Cpwd) {
	    	ConfirmPwd.sendKeys(Cpwd);
	    }
	    
	    public void ClickCreateAcc() {
	    	CreateAccount.click();
	    }
	    
	    @FindBy(xpath = "//span[@class='base']")
	    private WebElement AccountCreationValidate;
	    public void ValidateAccountCreation() {
	    	AccountCreationValidate.isDisplayed();
	    }
	    
	    public void logout() {
	    	driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
	    	driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
	    }
	    
	    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	    private WebElement SignInLnk;
	    public void SignInLink() {
	    	SignInLnk.click();
	    }
	}
