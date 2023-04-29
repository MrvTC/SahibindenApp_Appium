package stepdefinitions;

import io.cucumber.java.en.When;
import pages.FiltersPage;
import utils.DriverManager;

public class FiltersPageSteps {

    pages.FiltersPage FiltersPage = new FiltersPage(DriverManager.getDriver());
    @When("taps {string} on Filters Page")
    public void tapsOnFiltersPage(String filter) {

        FiltersPage.clickFilter(filter);
    }

    @When("taps {string} button on Filters Page")
    public void tapsButtonOnFiltersPage(String okey) {


        FiltersPage.clickOkeyButton(okey);
    }

    @When("taps Show Result Button on Filters Page")
    public void tapsShowResultButtonOnFiltersPage() {

        FiltersPage.clickShowResults();
    }
    @When("sendkeys Max Price {string} on Filters Page")
    public void sendkeysMaxPriceOnFiltersPage(String price) {


        FiltersPage.sendKeysMaxPrice(price);
    }




}
