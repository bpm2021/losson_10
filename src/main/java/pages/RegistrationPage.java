package pages;

import com.codeborne.selenide.SelenideElement;
import models.Account;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static lib.WebDriverMethods.*;

public class RegistrationPage {
    public SelenideElement
            genderMr = $(By.id("id_gender1")),
            genderMrs = $("#uniform-id_gender2"),
            customerFNInput = $(By.id("customer_firstname")),
            customerLNInput = $(By.id("customer_lastname")),
            emailInput = $(By.id("email")),
            passwordInput = $x("//input[@type='password']"),
            dayDropDown = $(By.id("days")),
            monthsDropDown = $(By.id("months")),
            yearsDropDown = $(By.id("years")),
            checkboxNewsLetter = $(By.id("uniform-newsletter")),
            checkboxNewsOptin = $(By.id("optin")),
            companyName = $(By.id("company")),
            addressByDefault = $x("//div[@class='account_creation']//p[4]//input[@type='text']"),
            cityInput = $x("//input[@id='city']"),
            selectStateByIndex = $(By.id("id_state")),
            postCodeInput = $x("//input[@id='postcode']"),
            idCountry = $(By.id("id_country")),
            phoneMobileInput = $(By.id("phone_mobile")),
            aliasInput = $(By.id("alias")),
            submitAccount = $(By.id("submitAccount")),
            myAccountText = $x("//h1[contains(text(),'My account')]");

    public void selectGender(String gender) {
        if (gender.equals("1")) {
            clickOnTheRadioButton(genderMr,gender);
        } else {
            clickOnTheRadioButton(genderMrs,gender);
        }
    }

    public void inputFirstName(String firstName) { inputValueToTheField(customerFNInput,firstName); }

    public void inputLastName(String lastName) {  inputValueToTheField(customerLNInput,lastName); }

    public void inputEmail(String email) { inputValueToTheField(emailInput,email); }

    public void inputPassword(String password) { inputValueToTheField(passwordInput,password); }


    public void selectBirthDay(String day) {selectValueFromScrollDownList(dayDropDown,day); }

    public void selectBirthMonth(String month) {selectValueFromScrollDownList(monthsDropDown,month); }

    private void selectBirthYear(String year) {selectValueFromScrollDownList(yearsDropDown,year); }

    public void clickOnCheckBoxNews() { clickOnTheCheckBox(checkboxNewsLetter); }

    public void clickOnCheckBoxNewsOptin() { clickOnTheCheckBox(checkboxNewsOptin); }

    public void inputCompany(String company) { inputValueToTheField(companyName, company); }

    public void inputAddress(String address) { inputValueToTheField(addressByDefault,address); }

    public void inputCity(String city) { inputValueToTheField(cityInput, city); }

    public void selectState(String state) { selectValueFromScrollDownList(selectStateByIndex, state); }

    public void inputPostCode(String postCode) { inputValueToTheField(postCodeInput,postCode); }

    public void selectCountry(String country) { selectValueFromScrollDownList(idCountry,country); }

    public void inputMobile(String mobile) { inputValueToTheField(phoneMobileInput, mobile); }

    public void inputAlias(String alias) { inputValueToTheField(aliasInput, alias); }

    public void submitAccount() { clickOnTheButton(submitAccount); }

    public void checkTextOnAccountPage(String mainText){checkIfTextCompare(myAccountText, mainText); }

    public void createNewUser(Account user){
        selectGender(user.getGender());
        inputFirstName(user.getFirstName());
        inputLastName(user.getLastName());
        inputEmail(user.getEmail());
        inputPassword(user.getPassword());
        selectBirthDay(user.getBirthDay());
        selectBirthMonth(user.getBirthMonth());
        selectBirthYear(user.getBirthYear());
        clickOnCheckBoxNews();
        clickOnCheckBoxNewsOptin();
        inputCompany(user.getCompanyName());
        inputAddress(user.getAddressName());
        inputCity(user.getCityName());
        selectState(user.getStateName());
        inputPostCode(user.getZipCode());
        selectCountry(user.getCountryName());
        inputMobile(user.getPhoneNumber());
        inputAlias(user.getAlias());
        submitAccount();
        checkTextOnAccountPage("MY ACCOUNT");
    }
}
