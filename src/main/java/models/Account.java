package models;

public class Account {
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
    public Account(String email, String gender,
                   String firstName, String lastName,
                   String password, String birthDay,
                   String birthMonth, String birthYear,
                   String companyName, String addressName,
                   String cityName, String stateName,
                   String zipCode, String countryName,
                   String phoneNumber, String alias) {
        this.email = email;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.companyName = companyName;
        this.addressName = addressName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.countryName = countryName;
        this.phoneNumber = phoneNumber;
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAlias() {
        return alias;
    }
}

