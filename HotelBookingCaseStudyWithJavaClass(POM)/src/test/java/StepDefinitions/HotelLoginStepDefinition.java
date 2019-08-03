package StepDefinitions;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactories.LoginPageFactory;

public class HotelLoginStepDefinition {
	WebDriver driver;
	LoginPageFactory loginPage;
	@Before
	public void init() {
		System.out.println("in before method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GAGHOGAR\\Desktop\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	   driver.get("C:\\Users\\GAGHOGAR\\Desktop\\BDDCASESTUDY\\login.html");
	   loginPage=new LoginPageFactory(driver);
	}

	@When("^username field is blank and user clicks on login button$")
	public void username_field_is_blank_and_user_clicks_on_login_button() throws Throwable {
		loginPage.clickLoginBtn();

	}

	@Then("^display error message 'please enter username'$")
	public void display_error_message_please_enter_username() throws Throwable {
	  String expeError="* Please enter userName.";
	  String actualError=loginPage.getUserError();
	  assertEquals(actualError, expeError);
	  driver.close();
	}

	@When("^password field is blank and user clicks on login button$")
	public void password_field_is_blank_and_user_clicks_on_login_button() throws Throwable {
		loginPage.setUserName("Aftab");
		loginPage.clickLoginBtn();
	}

	@Then("^display error message 'please enter password'$")
	public void display_error_message_please_enter_password() throws Throwable {
	    
		  String expeError="* Please enter password.";
		  String actualError=loginPage.gettPwdError();
		  assertEquals(actualError, expeError);
		  driver.close();
	    
	}

	@When("^invalid username and password is entered$")
	public void invalid_username_and_password_is_entered() throws Throwable {
//		WebElement userTxt=driver.findElement(By.name("userName"));
//		userTxt.sendKeys("capgemini");
//		WebElement userPwd=driver.findElement(By.name("userPwd"));
//		userPwd.sendKeys("capg123");
//		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input"));
//		loginBtn.click();
		loginPage.setUserName("aftab");
		loginPage.setPassword("aftab");
		loginPage.clickLoginBtn();
		
	}

	@Then("^display error message 'Invalid credentials'$")
	public void display_error_message_Invalid_credentials() throws Throwable {
//	   String expError="Invalid login! Please try again!";
//	   String actualError=driver.switchTo().alert().getText();
//	   assertEquals(expError, actualError);
//	   driver.switchTo().alert().accept();
//	   driver.close();
		String expError="Invalid login! Please try again!";
		String actualError=loginPage.getAlertMessage();
		assertEquals(expError, actualError);
		
		
	}

	@When("^user enter capgemini and capg(\\d+)$")
	public void user_enter_capgemini_and_capg(int arg1) throws Throwable {
//		WebElement userTxt=driver.findElement(By.name("userName"));
//		userTxt.sendKeys("capgemini");
//		WebElement userPwd=driver.findElement(By.name("userPwd"));
//		userPwd.sendKeys("capg1234");
//		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input"));
//		loginBtn.click();
		loginPage.setUserName("capgemini");
		loginPage.setPassword("capg1234");
		
		loginPage.clickLoginBtn();
		
		
	}

	@Then("^display Hotel Booking Page$")
	public void display_Hotel_Booking_Page() throws Throwable {
	   String expUrl=driver.getCurrentUrl();
	   String actualurl="file:///C:/Users/GAGHOGAR/Desktop/BDDCASESTUDY/hotelbooking.html";
	   assertEquals(expUrl, actualurl);
	   driver.close();
	}

}
