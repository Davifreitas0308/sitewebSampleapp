package siteweb;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import siteweb.Cenario;




public class Cenario {
	

	WebDriver driver;
	String url;
	EnterVehicleData datavehicle;
	EnterInsurantData insurantdata;
	EnterProductData  productdata;
	@Before
	public void before () throws InterruptedException {

		url = "http://sampleapp.tricentis.com/101/app.php";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\davif\\Documents\\Site1\\Automacao-Site1\\siteweb\\drivers\\chome\\91\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}
	@After
	public void after () {
		driver.quit();
		
	}
	
	@Given("I acess the site sample app")
	public void i_acess_the_site_sample_app() throws InterruptedException {
	    
		driver.get(url);
		Thread.sleep(1000);
	}

	@Given("I fill in the form Vehicle Data tab")
	public void i_fill_in_the_form_Vehicle_Data_tab() throws InterruptedException {
		datavehicle = new EnterVehicleData(driver);
		datavehicle.DataVehicle();
	}
	
	@Given("I fill in the form Insurant Data tab")
	public void i_fill_in_the_form_Insurant_Data_tab() throws InterruptedException {
		insurantdata = new EnterInsurantData (driver);
		insurantdata.DataInsurant();
	    
	}
	
	@Given("I fill in the form Product Data tab")
	public void i_fill_in_the_form_Product_Data_tab()throws InterruptedException {
	   productdata = new EnterProductData(driver);
	   productdata.DataProduct();
	    
	}

	}

