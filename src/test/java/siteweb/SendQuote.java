package siteweb;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SendQuote {
	//Definição dos elementos a serem utilizados
	WebDriver driver;
	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirPassword = By.id("confirmpassword");
	By sendButton = By.id("sendemail");
	
	public SendQuote (WebDriver driver)
	{
	this.driver = driver;	
	}

	public void  QuoteSend() throws InterruptedException
	{ 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		assertEquals("Send Quote", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(email).sendKeys("davifreitas0308@gmail.com");
		driver.findElement(phone).sendKeys("11950517516");
		driver.findElement(username).sendKeys("davifreitas0308");
		driver.findElement(password).sendKeys("davidnaAceenture2021");
		jse.executeScript("window.scrollBy(0,260)");
		driver.findElement(confirPassword).sendKeys("davidnaAceenture2021");
		Thread.sleep(1000);
		driver.findElement(sendButton).click();
		Thread.sleep(10000);
	}
}
