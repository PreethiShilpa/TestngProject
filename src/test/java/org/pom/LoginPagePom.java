package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPagePom extends BaseClass{

	public LoginPagePom() {

		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(how = How.NAME, using="username")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(how = How.NAME, using="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(how = How.XPATH, using="//input[@class='button']")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(how = How.XPATH, using="//a[text()='home']")
	private WebElement homePage;
	public WebElement getHomePage() {
		return homePage;
	}
	@FindBy(how = How.XPATH, using="//a[text()='Log Out']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Open New')]")
	private WebElement openNewAccount;
	public WebElement getOpenNewAccount() {
		return openNewAccount;
	}
	@FindBy(how=How.ID,using="type")
	private WebElement type;
	public WebElement getType() {
		return type;
	}
	@FindBy(how = How.XPATH, using ="//input[@type='submit']")
	private WebElement finishNewAccount;
	public WebElement getFinishNewAccount() {
		return finishNewAccount;
	}
	@FindBy(how =How.XPATH, using="//a[text()='Transfer Funds']")
	private WebElement transferFunds;
	public WebElement getTransferFunds() {
		return transferFunds;
	}
	@FindBy(how=How.NAME, using="input")
	private WebElement amount;
	public WebElement getAmount() {
		return amount;
	}
	@FindBy(how = How.ID, using="fromAccountId")
	private WebElement fromAccount;
	public WebElement getFromAccount() {
		return fromAccount;
	}
	@FindBy(how = How.ID, using="toAccountId")
	private WebElement toAccount;
	public WebElement getToAccount() {
		return fromAccount;
	}
	@FindBy(how=How.XPATH, using = "//input[@value='Transfer']")
	private WebElement transfer;
	public WebElement getTransfer() {
		return transfer;
	}
	@FindBy(how = How.XPATH, using="//a[text()='Bill Pay']")
	private WebElement billPay;
	public WebElement getBillPay() {
		return billPay;
	}
	@FindBy(how=How.NAME, using="payee.name")
	private WebElement payeeName;
	public WebElement getPayeeName() {
		return payeeName;
	}
	@FindBy(how= How.NAME, using="payee.address.street")
	private WebElement adress;
	public WebElement getAdress() {
		return adress;
	}
	@FindBy(how=How.NAME, using="payee.address.city")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	@FindBy(how=How.NAME, using="payee.address.state")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	@FindBy(how=How.NAME, using="payee.address.zipCode")
	private WebElement zipCode;
	public WebElement getZipCode() {
		return zipCode;
	}
	@FindBy(how=How.NAME, using="payee.phoneNumber")
	private WebElement phone;
	public WebElement getPhone() {
		return phone;
	}
	@FindBy(how=How.NAME, using="payee.accountNumber")
	private WebElement accNo;
	public WebElement getaccNo() {
		return accNo;
	}
	@FindBy(how=How.NAME, using="verifyAccount")
	private WebElement verifyAccount;
	public WebElement getVerifyAccount() {
		return verifyAccount;
	}
	@FindBy(how=How.NAME, using="amount")
	private WebElement amountRs;
	public WebElement getAmountRs() {
		return amountRs;
	}
	@FindBy(how=How.NAME, using="fromAccountId")
	private WebElement fromAccountId;
	public WebElement getFromAccountId() {
		return fromAccountId;
	}
	@FindBy(how = How.XPATH, using="//input[@value='Send Payment']")
	private WebElement sendPayment;
	public WebElement getSendPayment() {
		return sendPayment;
	}
	@FindBy(how = How.ID, using="customer.address.street")
	private WebElement updateAddress;
	public WebElement getUpdateAddress() {
		return updateAddress;
	}
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement updateProfile;
	public WebElement getUpdateProfile() {
		return updateProfile;
	}
	@FindBy(how = How.XPATH, using = "//a[text()='Update Contact Info']")
	private WebElement updateContact;
	public WebElement getUpdateContact() {
		return updateContact;
	}
	@FindBy(how = How.XPATH, using = "//a[text()='Find Transactions']")
	private WebElement findTransaction;
	public WebElement getFindTransaction() {
		return findTransaction;
	}
	@FindBy(how = How.ID, using = "criteria.amount")
	private WebElement findByAmount;
	public WebElement getFindByAmount() {
		return findByAmount;
	}
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[4]")
	private WebElement searchTransaction;
	public WebElement getSearchTransaction() {
		return searchTransaction;
	}
	@FindBy(how = How.XPATH, using = "//a[text()='Accounts Overview']")
	private WebElement accountOverview;
	public WebElement getAccountOverview() {
		return accountOverview;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Balance')]")
	private WebElement balance;
	public WebElement getBalance() {
		return balance;
	}
	@FindBy(how = How.XPATH, using = "//a[text()='contact']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(how = How.ID, using = "message")
	private WebElement message;
	public WebElement getMessage() {
		return message;
	}
	@FindBy(how = How.ID, using = "name")
	private WebElement emailName;
	public WebElement getEmailName() {
		return emailName;
	}
	@FindBy(how = How.ID, using = "email")
	private WebElement emailadd;
	public WebElement getEmailadd() {
		return emailadd;
	}
	@FindBy(how = How.ID, using = "phone")
	private WebElement emailPhone;
	public WebElement getEmailPhone() {
		return emailPhone;
	}
  @FindBy(how = How.ID, using = "email")
	private WebElement abc;
	public WebElement getabc() {
		return abc;
  }
    private void sysout() {
		System.out.println("QA Work");
	}
}

	
}



