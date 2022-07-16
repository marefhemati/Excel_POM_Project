package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	public void validUserShouldBeAbleToLogin() {
		BrowserFactory.init();
		LoginPage liginPage = PageFactory .initElements(driver, LoginPage.class);
	}
}
