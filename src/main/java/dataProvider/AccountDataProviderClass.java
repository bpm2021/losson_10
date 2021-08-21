package dataProvider;

import com.github.javafaker.Faker;
import models.AccountBuilder;
import org.testng.annotations.DataProvider;

public class AccountDataProviderClass {

    protected static Faker faker = new Faker();

    @DataProvider(name = "account-provider")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{{new AccountBuilder()
                .setEmail(faker.internet().emailAddress())
                .setGender("1")
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setPassword("Qwerty!1234")
                .setBirthDay("10")
                .setBirthMonth("January")
                .setBirthYear("2006")
                .setCompanyName("UPC")
                .setAddressName("street New York, 12")
                .setCityName("New York")
                .setStateName("Delaware")
                .setZipCode("12345")
                .setCountryName("United States")
                .setPhoneNumber("+380567345956")
                .setAlias("Some text").build()
        }};
    }
    @DataProvider(name = "account-provider-purchase")
    public static Object[][] dataProviderMethodForPurchase() {
        return new Object[][]{{new AccountBuilder()
                .setEmail("deane.kemmer@gmail.com")
                .setGender("1")
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setPassword("Qwerty!1234")
                .setBirthDay("10")
                .setBirthMonth("January")
                .setBirthYear("2006")
                .setCompanyName("UPC")
                .setAddressName("street New York, 12")
                .setCityName("New York")
                .setStateName("Delaware")
                .setZipCode("12345")
                .setCountryName("United States")
                .setPhoneNumber("+380567345956")
                .setAlias("Some text").build()
        }};
    }
}
