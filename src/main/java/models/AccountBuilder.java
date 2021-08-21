package models;

public class AccountBuilder {

    private String email;
    private String gender;
    private String firstName;
    private String lastName;
    private String password;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String companyName;
    private String addressName;
    private String cityName;
    private String stateName;
    private String zipCode;
    private String countryName;
    private String phoneNumber;
    private String alias;

    public AccountBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public AccountBuilder setGender(String gender){
        this.gender = gender;
        return this;
    }

    public AccountBuilder setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public AccountBuilder setBirthDay(String birthDay){
        this.birthDay = birthDay;
        return this;
    }

    public AccountBuilder setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
        return this;
    }

    public AccountBuilder setBirthYear(String birthYear){
        this.birthYear = birthYear;
        return this;
    }

    public  AccountBuilder setCompanyName(String companyName){
        this.companyName = companyName;
        return this;
    }

    public AccountBuilder setAddressName(String addressName){
        this.addressName =addressName;
        return this;
    }

    public AccountBuilder setCityName(String cityName){
        this.cityName = cityName;
        return this;
    }

    public AccountBuilder setStateName(String stateName){
        this.stateName = stateName;
        return this;
    }

    public AccountBuilder setZipCode(String zipCode){
        this.zipCode = zipCode;
        return this;
    }

    public AccountBuilder setCountryName(String countryName){
        this.countryName = countryName;
        return this;
    }

    public AccountBuilder setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AccountBuilder setAlias(String alias){
        this.alias = alias;
        return this;
    }

    public Account build(){
        return new Account(email,
                gender,
                firstName,
                lastName,
                password,
                birthDay,
                birthMonth,
                birthYear,
                companyName,
                addressName,
                cityName,
                stateName,
                zipCode,
                countryName,
                phoneNumber,
                alias);
    }
}