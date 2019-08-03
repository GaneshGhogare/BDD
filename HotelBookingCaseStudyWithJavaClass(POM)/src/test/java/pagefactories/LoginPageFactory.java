package pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
private WebDriver driver;
	
	@FindBy(className="btn")
	@CacheLookup
	private WebElement loginBtn;
	
	@FindBy(name="userName")
	@CacheLookup
	private WebElement userTxt;
	
	@FindBy(name="userPwd")
	@CacheLookup
	private WebElement pwdTxt;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	private WebElement userError;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	private WebElement pwdError;
	
	public LoginPageFactory() {	
	}
	public LoginPageFactory(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void setUserName(String username) {
		userTxt.sendKeys(username);
	}
	
	public void setPassword(String pwd) {
		pwdTxt.sendKeys(pwd);
	}
	
	public String getUserError() {
		return userError.getText();
	}
	
	public String gettPwdError() {
		return pwdError.getText();
	}
	
	public String getAlertMessage() {
		String errorMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMessage;
	}
	
}
