package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.SeleniumComPageObject;

public class SeleniumPageObjectTest {

	static WebDriver driver;
	static SeleniumComPageObject pageObject;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		
		//System.setProperty("webdriver.chrome.driver","C:/Users/Inmetrics/Downloads/ambienteEclipseSelenium/chromedriver.exe" );
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/Inmetrics/Downloads/ambienteEclipseSelenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccountwww.msn.com/pt-br/?pc=SK216&ocid=SK216DHP&osmkt=pt-br");		
		pageObject = new SeleniumComPageObject(driver);
	}


	@Test
	public void test() {
		pageObject.preencherCampos("mike", "tyson", "teste", "com", "8888", "object", "selenium");
	}

}
