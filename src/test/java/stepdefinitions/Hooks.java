package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("setUp method worked");
    }

   /* @After
    public void tearDown(Scenario scenario){
        System.out.println("yeardpwn methodu calisti");
        final  byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){ 
            scenario.embed(screenshot,"image/png");
        }
        Driver.closeDriver();
    }
*/
}
