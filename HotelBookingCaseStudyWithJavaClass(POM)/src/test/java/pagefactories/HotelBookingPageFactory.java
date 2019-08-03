package pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HotelBookingPageFactory {
	private WebDriver driver;
	@FindBy(name="txtFN")
	@CacheLookup
	private WebElement firstNameTxt;
	@FindBy(name="txtLN")
	@CacheLookup
	private WebElement lastNameTxt;
	@FindBy(name="Email")
	@CacheLookup
	private WebElement emailTxt;
	@FindBy(name="Phone")
	@CacheLookup
	private WebElement phoneTxt;
	@FindBy(id="txtCardholderName")
	@CacheLookup
	private WebElement cardHolderNameTxt;
	@FindBy(name="debit")
	@CacheLookup
	private WebElement debitCardTxt;
	@FindBy(name="cvv")
	@CacheLookup
	private WebElement cvvTxt;
	@FindBy(name="month")
	@CacheLookup
	private WebElement monthTxt;
	@FindBy(name="year")
	@CacheLookup
	private WebElement yearTxt;
	@FindBy(className="btn")
	@CacheLookup
	private WebElement loginBtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getFirstNameTxt() {
		return firstNameTxt;
	}
	public void setFirstNameTxt(WebElement firstNameTxt) {
		this.firstNameTxt = firstNameTxt;
	}
	public WebElement getLastNameTxt() {
		return lastNameTxt;
	}
	public void setLastNameTxt(WebElement lastNameTxt) {
		this.lastNameTxt = lastNameTxt;
	}
	public WebElement getEmailTxt() {
		return emailTxt;
	}
	public void setEmailTxt(WebElement emailTxt) {
		this.emailTxt = emailTxt;
	}
	public WebElement getPhoneTxt() {
		return phoneTxt;
	}
	public void setPhoneTxt(WebElement phoneTxt) {
		this.phoneTxt = phoneTxt;
	}
	public WebElement getCardHolderNameTxt() {
		return cardHolderNameTxt;
	}
	public void setCardHolderNameTxt(WebElement cardHolderNameTxt) {
		this.cardHolderNameTxt = cardHolderNameTxt;
	}
	public WebElement getDebitCardTxt() {
		return debitCardTxt;
	}
	public void setDebitCardTxt(WebElement debitCardTxt) {
		this.debitCardTxt = debitCardTxt;
	}
	public WebElement getCvvTxt() {
		return cvvTxt;
	}
	public void setCvvTxt(WebElement cvvTxt) {
		this.cvvTxt = cvvTxt;
	}
	public WebElement getMonthTxt() {
		return monthTxt;
	}
	public void setMonthTxt(WebElement monthTxt) {
		this.monthTxt = monthTxt;
	}
	public WebElement getYearTxt() {
		return yearTxt;
	}
	public void setYearTxt(WebElement yearTxt) {
		this.yearTxt = yearTxt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	
	
}
