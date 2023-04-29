package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FiltersPage {

    ElementHelper elementHelper;

    By filters = By.id("com.sahibinden:id/util_primary_text");
    By buttons = By.id("android:id/button1");
    By showResult = By.id("com.sahibinden:id/search_button");
    By maxPrice = By.id("com.sahibinden:id/maxAmountEditText");

    public FiltersPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }

    public void clickFilter(String filter) {

elementHelper.clickElementWithText(filters,filter);

    }

    public void clickOkeyButton(String okey) {

        elementHelper.clickElementWithText(buttons,okey);


    }

    public void clickShowResults() {

        elementHelper.click(showResult);

    }

    public void sendKeysMaxPrice(String price) {

        elementHelper.sendKeys(maxPrice,price);


    }


}
