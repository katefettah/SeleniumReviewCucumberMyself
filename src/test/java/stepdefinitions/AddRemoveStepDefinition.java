package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddRemovePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AddRemoveStepDefinition {
    AddRemovePage addRemovePage=new AddRemovePage();

    @Given("User is in {string}")
    public void user_is_in(String string) {
    Driver.getDriver().get(string);
    }

    @Given("User clicks Add Element")
    public void user_clicks_Add_Element() {
    addRemovePage.addButton.click();
    }

    @Then("User checks Delete web elemnet is displayed")
    public void user_checks_Delete_web_elemnet_is_displayed() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
        WebElement deleteElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='added-manually']")));
        System.out.println(deleteElement.getText());

        String deleteElement1=deleteElement.getText();
        boolean doesContain=deleteElement1.contains("Delete");
        Assert.assertTrue(doesContain);

    }




}
