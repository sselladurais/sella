package org.PageObject;

import java.io.IOException;

import org.libgobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass{
	
	public ProductPage()
	{
    
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css=".mr-2")
	private WebElement product;
	
	@FindBy(css="#search")
	private WebElement productSearch;
	
	@FindBy(css=".fa-search")
	private WebElement productbtn;
	
	@FindBy(id="productResult")
	private WebElement totalproduct;
	
	@FindBy(xpath="(//a[text()='Add'])[6]")
	private WebElement btnAdd;
	
	@FindBy(id="cart-31")
	private WebElement cartno;

	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement btncart;

    
	
	public WebElement getProduct() {
		return product;
	}



	public WebElement getProductSearch() {
		return productSearch;
	}



	public WebElement getProductbtn() {
		return productbtn;
	}



	public WebElement getTotalproduct() {
		return totalproduct;
	}



	public WebElement getBtnAdd() {
		return btnAdd;
	}



	public WebElement getCartno() {
		return cartno;
	}



	public WebElement getBtncart() {
		return btncart;
	}



	public void ProductDetails() throws InterruptedException, IOException
	{
		clickButton(product);
		sendKeys(productSearch,getCellData("hello", 1, 2));
		clickButton(productbtn);
		visibilityOfElement(totalproduct);
		clickButton(btnAdd);
	    clickButton(cartno);
	    sleep();
		clickButton(btncart);
		
	}
}
