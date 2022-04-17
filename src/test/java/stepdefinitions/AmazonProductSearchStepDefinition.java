package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmzonProductSearchPage;

public class AmazonProductSearchStepDefinition {

    AmzonProductSearchPage amzonProductSearchPage=new AmzonProductSearchPage();


    @Given("User writes {string} in search bar")
    public void user_writes_in_search_bar(String string) {
    amzonProductSearchPage.searchbar.sendKeys(string+ Keys.ENTER);
    }

    @Then("User checks the number result")
    public void user_checks_the_number_result() {
        System.out.println(amzonProductSearchPage.result.getText());
    }


}
