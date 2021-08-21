package lib;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class WebDriverMethods {

    /**
     * method inputValueToTheField
     * @param element
     * @param text
     */

    public static void inputValueToTheField(SelenideElement element, String text){
        try{
            element.setValue(text);
        }catch (Exception e){
            Assert.fail("Failed to input the text - " + text);
        }
    }

    /**
     * method clickOnTheButton
     * @param element
     */

    public static void clickOnTheButton(SelenideElement element){
        try{
            element.click();
        }catch (Exception e){
            Assert.fail("Failed to click on the button");
        }
    }

    /**
     * method clickOnTheCheckBox
     * @param element
     */

    public static void clickOnTheCheckBox(SelenideElement element){
        try{
            element.click();
        }catch (Exception e){
            Assert.fail("Failed to click on the Check Box");
        }
    }

    /**
     * method clickOnTheRadioButton
     * @param element
     * @param text
     */

    public static void clickOnTheRadioButton(SelenideElement element, String text){
        try{
            element.selectRadio(text);
        }catch (Exception e){
            Assert.fail("Failed to select Radio button");
        }
    }

    /**
     * method selectFromScrollDownList
     * @param element
     * @param text
     */

    public static void selectValueFromScrollDownList(SelenideElement element, String text){
        try{
            element.selectOptionContainingText(text);
        }catch (Exception e){
            Assert.fail("Failed to select value from Scroll down list");
        }
    }

    /**
     * method checkIfTextCompare
     * @param element
     * @param text
     */

    public static void checkIfTextCompare(SelenideElement element, String text){
        try{
            Assert.assertEquals(element.getText(),text);
        }catch (Exception e){
            Assert.fail("Failed to compare texts");
        }
    }
}
