package org.PageObject;

import java.io.IOException;

import org.libgobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass{
	
	public CartPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h5[text()='My Cart']")
	private WebElement Mycart;
	
	@FindBy(xpath="//div[@data-toggle='modal']")
	private WebElement btnToggle;
	
	@FindBy(css="#address_type")
	private WebElement address;
	
	@FindBy(xpath="(//input[@name='first_name'])[1]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@name='last_name'])[1]")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement moibleNo;
	
	@FindBy(xpath="//input[@name='apartment']")
	private WebElement apartmentNo;
	
	@FindBy(xpath="//input[@name='address']")
	private WebElement addressDetails;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement countryName;
	
	@FindBy(xpath="//select[@name='state']")
	private WebElement stateName;
	
	@FindBy(xpath="//select[@name='city']")
	private WebElement cityName;
	
	@FindBy(xpath="//input[@name='zipcode']")
	private WebElement pinCode;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement btnSubmit;

	public WebElement getMycart() {
		return Mycart;
	}

	public WebElement getBtnToggle() {
		return btnToggle;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMoibleNo() {
		return moibleNo;
	}

	public WebElement getApartmentNo() {
		return apartmentNo;
	}

	public WebElement getAddressDetails() {
		return addressDetails;
	}

	public WebElement getCountryName() {
		return countryName;
	}

	public WebElement getStateName() {
		return stateName;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void CartDetails() throws IOException, InterruptedException 
	{
		elementGetText(Mycart);
		System.out.println(Mycart);
		clickButton(btnToggle);
		selectByIndex(address, 3);
		sendKeys(firstName, getCellData("hello", 1, 3));
		sendKeys(lastName, getCellData("hello", 1, 4));
		sendKeys(moibleNo, getCellData("hello", 1, 5));
		sendKeys(apartmentNo, getCellData("hello", 1, 6));
		sendKeys(addressDetails, getCellData("hello", 1, 7));
		clickButton(countryName);
		selectByIndex(countryName, 1);
		clickButton(stateName);
		selectByText(stateName,getCellData("hello", 1, 9));
		clickButton(cityName);
		selectByText(cityName,getCellData("hello", 1, 10));
		sendKeys(pinCode,getCellData("hello", 1, 11));
		sleep();
		clickButton(btnSubmit);
		
	}
    
	
}
