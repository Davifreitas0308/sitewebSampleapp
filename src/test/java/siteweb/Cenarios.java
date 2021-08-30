package siteweb;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import siteweb.Cenarios;


public class Cenarios {
	
//Objetos paginas definidos abaixo
	WebDriver driver;
	String url;
	EnterVehicleData datavehicle;
	EnterInsurantData insurantdata;
	EnterProductData  productdata;
	SelectPriceOption priceselect;
	SendQuote sendquote;
	
	@Before
	public void before () throws InterruptedException {

		url = "http://sampleapp.tricentis.com/101/app.php";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}
	
	@After
	public void after () {
		driver.quit();	
	}
// metodo abaixo acessa a pagina inicial 	
	
	
	@Given("I acess the site sample app")
	public void i_acess_the_site_sample_app() throws InterruptedException {
	    
		driver.get(url);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}
// preenche o formulario do veiculo
	@Given("I fill in the form Vehicle Data tab")
	public void i_fill_in_the_form_Vehicle_Data_tab() throws InterruptedException {
		datavehicle = new EnterVehicleData(driver);
		datavehicle.DataVehicle(url);
	}
// preenche os dados do seguro	
	@Given("I fill in the form Insurant Data tab")
	public void i_fill_in_the_form_Insurant_Data_tab() throws InterruptedException {
		insurantdata = new EnterInsurantData (driver);
		insurantdata.DataInsurant();    
	}
// preenche os dados do produto	
	@Given("I fill in the form Product Data tab")
	public void i_fill_in_the_form_Product_Data_tab()throws InterruptedException {
	   productdata = new EnterProductData(driver);
	   productdata.DataProduct();
	}
// seleciona o preço do seguro	
	@Given("I fill in the form Select Price Option")
	public void i_fill_in_the_form_Select_Price_Option()throws InterruptedException {
		priceselect = new SelectPriceOption(driver);
	    priceselect.SelectPrice();
	}
// preenche os dados da cotação	
	@Given("I fill in the form Send Quote")
	public void i_fill_in_the_form_Send_Quote() throws InterruptedException{
		sendquote = new SendQuote(driver);
		sendquote.QuoteSend();
	}
// verifica se a mensagem de sucesso é apresentada corretamente 
	@Then("The message {string} success is showed")
	public void the_message_Sending_e_mail_success_is_showed(String msg)throws InterruptedException {
	    msg = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
		assertEquals("Sending e-mail success!", msg);
		
	
	}
	
	}

