package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// esta classe vai armazenar todos os locator e metodos da pagina de cadastro do google

public class SeleniumComPageObject {

	WebDriver driver;
	
	By primeiroNome  = By.id("FirstName");
	By ultimoNome	 = By.id("LastName");
	By email 		 = By.id("GmailAddress");
	By senha		 = By.id("Passwd");
	By senhaIgual	 = By.id("PasswdAgain");
	By celular 		 = By.name("RecoveryPhoneNumber");
	By emailAtual 	 = By.id("RecoveryEmailAddress");
	
	
	
	
	public SeleniumComPageObject(WebDriver driver) {
		this.driver = driver;
	}

	//criei um metodo onde passo por paramentros os valores quando chamar o metodo, eu podia criar metodos separados para cada campo tambem

	public void preencherCampos(String campo1,String campo2,String campo3,String campo4,String campo5,String campo6,String campo7) {

		driver.findElement(primeiroNome).sendKeys(campo1);
		driver.findElement(ultimoNome).sendKeys(campo2);
		driver.findElement(email).sendKeys(campo3);
		driver.findElement(senha).sendKeys(campo4);
		driver.findElement(senhaIgual).sendKeys(campo5);
		driver.findElement(celular).sendKeys(campo5);
		driver.findElement(emailAtual).sendKeys(campo7);
	}
	
	
}
