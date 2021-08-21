package pages;

import com.codeborne.selenide.SelenideElement;
import models.Account;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static lib.WebDriverMethods.*;
import static lib.WebDriverMethods.clickOnTheButton;

public class PurchasePage {

    public SelenideElement
            checkOutButton = $x("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]"),
            checkOutButton1 = $x("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"),
            checkOutButton2 = $x("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"),
            emailInput = $(By.id("email")),
            passwordInput = $x("//input[@type='password']"),
            signInButton = $x("//button[@id ='SubmitLogin']"),
            agreeCheckBox= $x("//input[@id='cgv']"),
            paymentMethod = $x("//a[@class='bankwire']"),
            confirmButton = $x("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"),
//            price = $x("//strong[contains(text(),'$56.00')]"),
            bankName = $x("//strong[contains(text(),'RTP')]"),
            details = $x("//strong[contains(text(),'xyz')]");

    public void clickOnCheckoutButton(){clickOnTheButton(checkOutButton); }

    public void inputEmail(String email) { inputValueToTheField(emailInput,email); }

    public void inputPassword(String password) { inputValueToTheField(passwordInput,password); }

    public void clickOnSignInButton(){clickOnTheButton(signInButton); }

    public void clickOnCheckoutButton1(){clickOnTheButton(checkOutButton1); }

    public void clickOnAgree(){clickOnTheCheckBox(agreeCheckBox);}

    public void clickOnCheckoutButton2(){clickOnTheButton(checkOutButton2); }

    public void selectOnPaymentMethod(){ clickOnTheButton(paymentMethod); }

    public void confirmFee(){clickOnTheButton(confirmButton); }

    public void checkIfPurchaseWasSuccessful(){
//        checkIfTextCompare(price,"$56.00");
        checkIfTextCompare(bankName,"RTP");
        checkIfTextCompare(details,"xyz");
    }

    public void buyBlouse(Account user){
        clickOnCheckoutButton();
        inputEmail(user.getEmail());
        inputPassword(user.getPassword());
        clickOnSignInButton();
        clickOnCheckoutButton1();
        clickOnAgree();
        clickOnCheckoutButton2();
        selectOnPaymentMethod();
        confirmFee();
        checkIfPurchaseWasSuccessful();
    }
}
