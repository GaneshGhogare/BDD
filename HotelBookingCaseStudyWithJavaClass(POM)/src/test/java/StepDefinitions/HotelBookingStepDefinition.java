package StepDefinitions;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingStepDefinition {
	WebDriver driver;
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GAGHOGAR\\Desktop\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\GAGHOGAR\\Desktop\\BDDCASESTUDY\\hotelbooking.html");
		}

	@When("^enters all valid details$")
	public void enters_all_valid_details() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		dropdownCity.selectByVisibleText("Pune");
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("Maharashtra");
		WebElement cardHolderNameTxt=driver.findElement(By.id("txtCardholderName"));
		cardHolderNameTxt.sendKeys("Aftab Shaikh");
		WebElement debitCardTxt=driver.findElement(By.name("debit"));
		debitCardTxt.sendKeys("1234567890");
		WebElement cvvTxt=driver.findElement(By.name("cvv"));
		cvvTxt.sendKeys("123");
		WebElement monthTxt=driver.findElement(By.name("month"));
		monthTxt.sendKeys("12");
		WebElement yearTxt=driver.findElement(By.name("year"));
		yearTxt.sendKeys("12");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	   
	}

	@Then("^display succes page$")
	public void display_succes_page() throws Throwable {
		   String expUrl=driver.getCurrentUrl();
		   String actualurl="file:///C:/Users/GAGHOGAR/Desktop/BDDCASESTUDY/success.html";
		   assertEquals(expUrl, actualurl);
		   driver.close();
	   
	}

	@When("^firstname is blank and clicks on booking button$")
	public void firstname_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement loginBtn=driver.findElement(By.className("btn"));
		
		loginBtn.click();
	   
	}

	@Then("^display error message for firstname field$")
	public void display_error_message_for_firstname_field() throws Throwable {
		  String expeError="Please fill the First Name";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	   
	}

	@When("^lastName is blank and clicks on booking button$")
	public void lastname_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	   
	}

	@Then("^display error messages for lastName field$")
	public void display_error_messages_for_lastName_field() throws Throwable {
		 
		String expeError="Please fill the Last Name";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	   
	}

	@When("^Email is blank and clicks on booking button$")
	public void email_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	   
	}

	@Then("^display error messages for email field$")
	public void display_error_messages_for_email_field() throws Throwable {
		String expeError="Please fill the Email";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
		
	   
	}

	@When("^user enter invalid ajhjh\\.com and clicks on booking button$")
	public void user_enter_invalid_ajhjh_com_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	}

	@Then("^display error message 'please enter valid email'$")
	public void display_error_message_please_enter_valid_email() throws Throwable {
		String expeError="Please enter valid Email Id.";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	   
	}

	@When("^Mobile is blank and clicks on booking button$")
	public void mobile_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	   
	}

	@Then("^display error messages for mobile field$")
	public void display_error_messages_for_mobile_field() throws Throwable {
		String expeError="Please fill the Mobile No.";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	   
	}

	@When("^user enters (\\d+) and clicks on booking button$")
	public void user_enters_and_clicks_on_booking_button(int arg1) throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("aftas45");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
		
	   
	}

	@Then("^Display Error message for mobile field$")
	public void display_Error_message_for_mobile_field() throws Throwable {
		String expeError="Please enter valid Contact no.";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		 driver.switchTo().alert().accept();
		driver.close();
	   
	}
//
//	@When("^user enters (\\d+)-(\\d+) and clicks on booking button$")
//	public void user_enters_and_clicks_on_booking_button(int arg1, int arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@When("^user enters (\\d+)-(\\d+)-(\\d+) and clicks on booking button$")
//	public void user_enters_and_clicks_on_booking_button(int arg1, int arg2, int arg3) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@When("^no of people staying field is blank and clicks on booking button$")
//	public void no_of_people_staying_field_is_blank_and_clicks_on_booking_button() throws Throwable {
//	    
//	   
//	}
//
//	@Then("^display error messages for people staying field$")
//	public void display_error_messages_for_people_staying_field() throws Throwable {
//	    
//	   
//	}

//	@When("^Address field is blank and clicks on booking button$")
//	public void address_field_is_blank_and_clicks_on_booking_button() throws Throwable {
//		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
//		firstNameTxt.sendKeys("Aftab");
//		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
//		lastNameTxt.sendKeys("Shaikh");
//		WebElement emailTxt=driver.findElement(By.name("Email"));
//		emailTxt.sendKeys("aftabshaikh96@gmail.com");
//		WebElement phoneTxt=driver.findElement(By.name("Phone"));
//		phoneTxt.sendKeys("9768592991");
//		WebElement loginBtn=driver.findElement(By.className("btn"));
//		loginBtn.click();
//	}
//
//	@Then("^display error messages for Address field$")
//	public void display_error_messages_for_Address_field() throws Throwable {
//		String expeError="";
//		String actualError=driver.switchTo().alert().getText();
//		assertEquals(expeError, actualError);
//		 driver.switchTo().alert().accept();
//		driver.close();
//	   
//	}

	@When("^City is not selected and clicks on booking button$")
	public void city_is_not_selected_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
		
	   
	}

	@Then("^display error messages for city field$")
	public void display_error_messages_for_city_field() throws Throwable {
		String expeError="Please select city";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		 driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^State is not selected and clicks on booking button$")
	public void state_is_not_selected_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdown = new Select(driver.findElement(By.name("city")));
		dropdown.selectByVisibleText("Pune");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click(); 
	   
	}

	@Then("^display error messages for state field$")
	public void display_error_messages_for_state_field() throws Throwable {
		String expeError="Please select state";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^user enters all previous details$")
	public void user_enters_all_previous_details() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		dropdownCity.selectByVisibleText("Pune");
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("Maharashtra");
		
	   
	}

	@When("^cardholder name is blank and clicks on booking button$")
	public void cardholder_name_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click(); 
	   
	}

	@Then("^display error messages for Cardholder field$")
	public void display_error_messages_for_Cardholder_field() throws Throwable {
		String expeError="Please fill the Card holder name";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^Debitcard field is blank and clicks on booking button$")
	public void debitcard_field_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		dropdownCity.selectByVisibleText("Pune");
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("Maharashtra");
		WebElement cardHolderNameTxt=driver.findElement(By.id("txtCardholderName"));
		cardHolderNameTxt.sendKeys("Aftab Shaikh");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click(); 
	   
	}

	@Then("^display error messages for Debitcard field$")
	public void display_error_messages_for_Debitcard_field() throws Throwable {
		String expeError="Please fill the Debit card Number";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^Expiration month field is blank and clicks on booking button$")
	public void expiration_month_field_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		dropdownCity.selectByVisibleText("Pune");
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("Maharashtra");
		WebElement cardHolderNameTxt=driver.findElement(By.id("txtCardholderName"));
		cardHolderNameTxt.sendKeys("Aftab Shaikh");
		WebElement debitCardTxt=driver.findElement(By.name("debit"));
		debitCardTxt.sendKeys("1234567890");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click(); 
	   
	}

	@Then("^display error messages for month field$")
	public void display_error_messages_for_month_field() throws Throwable {
		String expeError="Please fill the CVV";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^Expiration year field is blank and clicks on booking button$")
	public void expiration_year_field_is_blank_and_clicks_on_booking_button() throws Throwable {
		WebElement firstNameTxt=driver.findElement(By.name("txtFN"));
		firstNameTxt.sendKeys("Aftab");
		WebElement lastNameTxt=driver.findElement(By.name("txtLN"));
		lastNameTxt.sendKeys("Shaikh");
		WebElement emailTxt=driver.findElement(By.name("Email"));
		emailTxt.sendKeys("aftabshaikh96@gmail.com");
		WebElement phoneTxt=driver.findElement(By.name("Phone"));
		phoneTxt.sendKeys("9768592991");
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		dropdownCity.selectByVisibleText("Pune");
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("Maharashtra");
		WebElement cardHolderNameTxt=driver.findElement(By.id("txtCardholderName"));
		cardHolderNameTxt.sendKeys("Aftab Shaikh");
		WebElement debitCardTxt=driver.findElement(By.name("debit"));
		debitCardTxt.sendKeys("1234567890");
		WebElement cvvTxt=driver.findElement(By.name("cvv"));
		cvvTxt.sendKeys("123");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	   
	}

	@Then("^display error messages for year field$")
	public void display_error_messages_for_year_field() throws Throwable {
		
		String expeError="Please fill expiration month";
		String actualError=driver.switchTo().alert().getText();
		assertEquals(expeError, actualError);
		driver.switchTo().alert().accept();
		driver.close();
	}

}
