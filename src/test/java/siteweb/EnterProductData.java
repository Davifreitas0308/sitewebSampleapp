package siteweb;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterProductData  {
	
	WebDriver driver;
	By startDate = By.id("startdate");
	By selectInsurance = By.id("insurancesum");
	By selectMerit = By.id("meritrating");
	By selecDamage = By.id("damageinsurance");
	By OptionalProduct = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	By selecCourtesyCar = By.id("courtesycar");
	By nextButton = By.id("nextselectpriceoption");

	public EnterProductData (WebDriver driver)
	{
	this.driver = driver;	
	}

	public void DataProduct() throws InterruptedException
	{
		driver.findElement(By.id("enterproductdata")).click();
		assertEquals("Enter Product Data", driver.getTitle());
		WebElement selectElementInsurance = driver.findElement(selectInsurance);
		WebElement selectElementMerit = driver.findElement(selectMerit);
		WebElement selectElementDamageInsurance = driver.findElement(selecDamage);
		WebElement selectElementCourtesy = driver.findElement(selecCourtesyCar);
		driver.findElement(startDate).sendKeys("08/27/2021");
		selectElementInsurance.sendKeys("30.000.000,00");
		selectElementMerit.sendKeys("Malus 12");
		selectElementDamageInsurance.sendKeys("Partial Coverage");
		Thread.sleep(2000);
		driver.findElement(OptionalProduct).click();
		selectElementCourtesy.sendKeys("No");
		Thread.sleep(1000);
		driver.findElement(nextButton).click();
		Thread.sleep(6000);
		
	}
	

}
