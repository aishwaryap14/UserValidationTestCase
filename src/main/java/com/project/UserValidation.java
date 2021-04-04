package com.project;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String Name_Pattern="^[A-Z]{1}[a-z]{2,}$";
    public static final String Email_Pattern="^[A-Za-z]{1,}([.]{1}[0-9a-zA-Z+-]{1,}){0,}[@]{1}" +
                                        "[0-9a-zA-Z]{1,}[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-Z]{2,4}?)$";
    public static final String Email_PhoneNumber="^[+]{1}([0-9]{0,2})[ ]{1}([0-9]{1,10}?)$";
    public static final String Password_Pattern="^[a-zA-Z0-9]{8,}$";

    public boolean validateFirstname(String fname) {
        Pattern pattern=Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastname(String lname) {
        Pattern pattern=Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern=Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNumber(String phone) {
        Pattern pattern=Pattern.compile(Email_PhoneNumber);
        return pattern.matcher(phone).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern=Pattern.compile(Password_Pattern);
        return  pattern.matcher(password).matches();
    }
}
