package web;

import base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import dataProvider.AccountDataProviderClass;
import models.Account;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import pages.SingInPage;

@Listeners({ScreenShooter.class, TextReport.class})
@Report
public class RegistrationTest extends BaseTest {

    @Test(dataProvider  = "account-provider", dataProviderClass = AccountDataProviderClass.class)
    private void checkRegistration(Account user){
        singInPage.clickInSignInButton();
        singInPage.inputEmail(user.getEmail());
        singInPage.clickOnCreateAccountButton();
        registrationPage.createNewUser(user);
    }
}
