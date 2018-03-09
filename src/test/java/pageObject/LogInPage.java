package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver driver;
	public LogInPage (WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(name="name")
WebElement edit_name;
public WebElement name()
{
	return edit_name;
}
@FindBy(name="email")
WebElement edit_email;
public WebElement email()
{
	return edit_email;
}
@FindBy(name="mobile")
WebElement edit_mobile;
public WebElement mobile()
{
	return edit_mobile;
}
@FindBy(name="office")
WebElement edit_office;
public WebElement office()
{
	return edit_office;
}
@FindBy (xpath="//*[@id=\"subject\"]")
WebElement click_subject;
public WebElement subject()
{
	return click_subject;
}
@FindBy (name="message")
WebElement edit_message;
public WebElement message()
{
	return edit_message;
}
@FindBy (xpath="//*[@id=\"submit\"]")
WebElement click_submit;
public WebElement submit()
{
	return click_submit;
}
}
