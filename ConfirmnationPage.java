package org.PageObject;

import org.libgobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmnationPage extends BaseClass{
	
	public ConfirmnationPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(css=".fa-bell")
	 WebElement btnConfirm;
	 
	 @FindBy(xpath="//p[@class='font18 color36 mb-0']")
	 WebElement txtOrder;

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTxtOrder() {
		return txtOrder;
	}
	 
	 

}
