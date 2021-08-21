package web;


import base.BaseTest;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import dataProvider.AccountDataProviderClass;
import models.Account;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ScreenShooter.class, TextReport.class})
@Report
public class PurchaseTest extends BaseTest {
    @Test(dataProvider  = "account-provider-purchase", dataProviderClass = AccountDataProviderClass.class)
    private void checkPurchase(Account user){
        mainPage.clickOnBlouseProposition();
        mainPage.clickOnCheckoutProposition();
        purchasePage.buyBlouse(user);
    }
}
