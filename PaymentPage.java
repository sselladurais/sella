package org.PageObject;

import java.io.IOException;

import org.libgobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {
	
	public PaymentPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@id='payment_type']")
	private WebElement paymentType;
	
	@FindBy(xpath="//label[@for='visa_card']")
	private WebElement cardType;
	
	@FindBy(xpath="//input[@name='card_no']")
	private WebElement cardNo;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(css="#year")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='cvv']")
	private WebElement cvvNo;
	
	@FindBy(xpath="//button[@id='placeOrder']")
	private WebElement btnOrder;

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBtnOrder() {
		return btnOrder;
	}
	
	public void PaymentDetails() throws IOException, InterruptedException
	{
		sleep();
		clickButton(paymentType);
		selectByText(paymentType, getCellData("hello", 1, 12));
		clickButton(cardType);
		sendKeys(cardNo, getCellData("hello", 1, 13));
		clickButton(month);
		selectByText(month, getCellData("hello", 1, 14));
		clickButton(year);
		visibilityOfElement(year);
		selectByValue(year, getCellData("hello", 1, 15));
		sendKeys(cvvNo, getCellData("hello", 1, 16));
		clickButton(btnOrder);
	
	}

}
