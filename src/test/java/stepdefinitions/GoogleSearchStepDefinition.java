package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GoogleSearchPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.sql.SQLOutput;

public class GoogleSearchStepDefinition {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @Given("User is in google page")
    public void user_is_in_google_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
    }

    @Given("User writes Techproeducation to search bar")
    public void user_writes_Techproeducation_to_search_bar() {
        googleSearchPage.searchBar.sendKeys("Techproeducation"+Keys.ENTER);
    }

    @Then("User checks title of search")
    public void user_checks_title_of_search() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title=Driver.getDriver().getTitle();
       boolean isDisplayed=title.contains("Techproeducation");
       Assert.assertTrue(isDisplayed);
    }

    @Given("User writes Selemium in search bar")
    public void user_writes_Selemium_in_search_bar() {
        googleSearchPage.searchBar.sendKeys("Selenium"+Keys.ENTER);

    }

    @Then("User checks the number result of the title")
    public void user_checks_the_number_result_of_the_title() {
    String results=googleSearchPage.numberofResult.getText();
        System.out.println(results);
    }
    @Given("User searches {string} word")
    public void user_searches_word(String string) {
    googleSearchPage.searchBar.sendKeys(string+Keys.ENTER);
    }

    @Then("User checks the word {string} in the search")
    public void user_checks_the_word_in_the_search(String string) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title=Driver.getDriver().getTitle();
        boolean doesContain=title.contains(string);
        Assert.assertTrue(doesContain);
    }
    @Given("User searches {string}")
    public void user_searches(String string) {
        googleSearchPage.searchBar.sendKeys(string+Keys.ENTER);
    }

    @Then("User checks {string} i title")
    public void user_checks_i_title(String string) {
        String titles=Driver.getDriver().getTitle();
        System.out.println(titles);
    }





}
