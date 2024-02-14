package org.PageObject;

import java.io.IOException;

import org.libgobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
public LoginPage()
{
	
	PageFactory.initElements(driver, this);
}
	
	@FindBy(css="#email")
	private WebElement txtUserName;
	
	@FindBy(css="#pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement btnlogin;

	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void LoginBtn() throws IOException
	{
		sendKeys(txtUserName,getCellData("hello",1,0));
		sendKeys(txtPassword,getCellData("hello",1,1));
		javaScriptclick(btnlogin);
	}
}
