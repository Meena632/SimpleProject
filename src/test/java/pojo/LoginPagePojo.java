package pojo;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPagePojo extends BaseClass
{

public LoginPagePojo()
{
	PageFactory.initElements(driver,this);
	
}
@FindBy(id="username")
private WebElement txtUserName;
@FindBy(id="password")
private WebElement txtPassword;
@FindBy(id="login")
private WebElement btnClick;
@FindBy(id="location")
private WebElement selectOption;
@FindBy(id="continue")
private WebElement continueClick;
@FindBy(id="Submit")
private WebElement searchClick;
@FindBy (id="radiobutton_0")
private WebElement radioButton;

public WebElement getRadioButton() {
	return radioButton;
}
public WebElement getSearchClick() {
	return searchClick;
}
public WebElement getContinueClick() {
	return continueClick;
}
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnClick() {
	return btnClick;
}
public WebElement getSelectOption() {
	return selectOption;
}






}