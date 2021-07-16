package siteweb;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class EnterVehicleData {
	//Definição dos elementos a serem utilizados
    WebDriver driver;
	By selectMake = By.id("make");
	By enginePerformace = By.id("engineperformance");
	By dataManufacture = By.id("dateofmanufacture");
	By selectFuel = By.id("fuel");
	By numberofSeats = By.id("numberofseats");
	By selectInsurance = By.id("insurancesum");
	By listPrice = By.id("listprice");
	By annualMileage = By.id("annualmileage");
    By nextButton = By.name ("Next (Enter Insurant Data)");
	    public EnterVehicleData(WebDriver driver)
	    {
	    	this.driver = driver;
	    }
		public void  DataVehicle() throws InterruptedException
		
		{    
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			assertEquals("Enter Vehicle Data", driver.getTitle());
		    WebElement selectElementMake = driver.findElement(selectMake);
		    WebElement selectElementSeats = driver.findElement(numberofSeats);
		    WebElement selectElementFuel = driver.findElement(selectFuel);
		    selectElementMake.sendKeys("Toyota");
		    driver.findElement(enginePerformace).sendKeys("100");
		    Thread.sleep(1000);
		    driver.findElement(dataManufacture).sendKeys("01/06/2015");
		    selectElementSeats.sendKeys("4");
		    selectElementFuel.sendKeys("Gas");
		    jse.executeScript("window.scrollBy(0,260)");
		    Thread.sleep(1000);
		    driver.findElement(listPrice).sendKeys("40000");
		    driver.findElement(annualMileage).sendKeys("100");
		    Thread.sleep(1000);
		    driver.findElement(nextButton).click();
		    Thread.sleep(1000);
		    jse.executeScript("window.scrollBy(0,-680)");
		    Thread.sleep(2000);
		}
	
	}


