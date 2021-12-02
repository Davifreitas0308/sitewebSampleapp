package siteweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterTruckData {
	
	WebDriver driver;
	By TruckBar = By.id("nav_truck");
	
    public EnterTruckData(WebDriver driver)
    {
    	this.driver = driver;
    }
	
	public void  DataTruck() throws InterruptedException
	
	{
		Thread.sleep(1000);
		driver.findElement(TruckBar).click();
		Thread.sleep(3000);
	}

}
