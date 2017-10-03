package test;


import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.CadastroPages;

public class CadastroTest {
	
	static WebDriver driver;	
	static CadastroPages cadastroPages;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:/Users/Inmetrics/Downloads/ambienteEclipseSelenium/chromedriver.exe" );
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/Inmetrics/Downloads/ambienteEclipseSelenium/geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccountwww.msn.com/pt-br/?pc=SK216&ocid=SK216DHP&osmkt=pt-br");
		cadastroPages.capturaTela(driver);
		cadastroPages = new CadastroPages(driver);
		cadastroPages.lendoArqExcel();
		
		//cadastroPages.capturaTela();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() throws IOException {
		cadastroPages.preencherCampos();
		cadastroPages.capturaTela(driver);
		//cadastroPages.capturaTela();
		Assert.assertEquals(cadastroPages.validarMensagem(), "Você não pode deixar este campo em branco.");
		//cadastroPages.capturaTela();
		cadastroPages.capturaTela(driver);
	}

}
