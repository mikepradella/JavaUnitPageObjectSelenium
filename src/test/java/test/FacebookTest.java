package test;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookPages;

public class FacebookTest {
	
	static WebDriver driver;
	static FacebookPages facebook;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/Inmetrics/Downloads/ambienteEclipseSelenium/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://pt-br.facebook.com/");
		facebook = new FacebookPages(driver);
	}

	@Test
	public void test() {	
		//funciona corretamente
		//facebook.preencherComboBox();
		
		// preenchendo campos atraves do Xpath
		facebook.preencherCamposPorXpath();
		
	}

}
