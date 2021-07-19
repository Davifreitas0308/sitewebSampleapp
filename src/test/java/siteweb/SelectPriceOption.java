package siteweb;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelectPriceOption {
//Definição dos elementos a serem utilizados na pagina
	
	WebDriver driver;
	By selectPrice = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]");
	By nextButton  = By.name("Next (Send Quote)");
	
	public SelectPriceOption(WebDriver driver)
	{
	this.driver = driver;	
	}
	
	public void  SelectPrice() throws InterruptedException
	{ 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		assertEquals("Select Price Option", driver.getTitle()); // identificador da pagina
		driver.findElement(selectPrice).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,280)");
		Thread.sleep(1000);
		driver.findElement(nextButton).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-260)");
		
	}

	
	
}
