package siteweb;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class EnterInsurantData {
//Definição dos elementos a serem utilizados na pagina ao preencher os dados do seguro
	
	WebDriver driver;
	By selectCountryData = By.id("country");
	By selectOccupationData = By.id("occupation");
    By firstName = By.id("firstname");
    By lastName = By.id ("lastname");
    By birthDate = By.id("birthdate");
    By genderData = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
    By streetAddres = By.id("streetaddress");
    By zipCode = By.id("zipcode");
    By cityData = By.id("city");
    By hobbieData = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
    By nextButton = By.name("Next (Enter Product Data)");
    
	public EnterInsurantData (WebDriver driver)
	{
	this.driver = driver;	
	}
	public void DataInsurant() throws InterruptedException
	{   
		WebElement selectCountry = driver.findElement(selectCountryData);
		WebElement selectOccupation = driver.findElement(selectOccupationData);  
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		assertEquals("Enter Insurant Data", driver.getTitle());   // identificador da pagina
		driver.findElement(firstName).sendKeys("David");
		driver.findElement(lastName).sendKeys("Rodrigues");
		driver.findElement(birthDate).sendKeys("03/08/1990");
		Thread.sleep(1000);
		driver.findElement(genderData).click();
		jse.executeScript("window.scrollBy(0,160)"); 
		driver.findElement(streetAddres).sendKeys("Rua 44");
		selectCountry.sendKeys("Brazil");
		driver.findElement(zipCode).sendKeys("04918190");
		driver.findElement(cityData).sendKeys("São Paulo");
		selectOccupation.sendKeys("Employee");
		driver.findElement(hobbieData).click();
		jse.executeScript("window.scrollBy(0,160)"); 
		Thread.sleep(1000);
		driver.findElement(nextButton).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-685)");
		Thread.sleep(2000);

	}
	
}
