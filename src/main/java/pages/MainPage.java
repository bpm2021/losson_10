package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static lib.WebDriverMethods.clickOnTheButton;

public class MainPage {

    public SelenideElement
        blouseButton = $$x("//ul[@id='homefeatured']//li").get(1).find(withText("Add to cart")),
        checkOutButton = $(withText("Proceed to checkout"));

    public void clickOnBlouseProposition(){clickOnTheButton(blouseButton); }
    public void clickOnCheckoutProposition(){clickOnTheButton(checkOutButton); }
}
