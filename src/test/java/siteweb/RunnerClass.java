package siteweb;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "Cenarios.Feature"

		)
public class RunnerClass {
	
 	public RunnerClass()
	{

}

}