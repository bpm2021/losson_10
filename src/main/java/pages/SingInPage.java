package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static lib.WebDriverMethods.clickOnTheButton;
import static lib.WebDriverMethods.inputValueToTheField;

public class SingInPage {
    public SelenideElement
            clickSignIn = $x("//a[@class='login']"),
            emailField = $x("//input[@id='email_create']"),
            signInButton = $x("//button[@id ='SubmitLogin']");


    public void clickInSignInButton(){ clickOnTheButton(clickSignIn); }

    public void inputEmail(String email){ inputValueToTheField(emailField,email);}

    public void clickOnCreateAccountButton() {clickOnTheButton(signInButton);  }
}
