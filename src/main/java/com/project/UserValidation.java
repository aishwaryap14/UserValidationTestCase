package com.project;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String Name_Pattern="^[A-Z]{1}[a-z]{2,}$";
    public static final String Email_Pattern="^[A-Za-z]{1,}([.]{1}[0-9a-zA-Z+-]{1,}){0,}[@]{1}" +
                                        "[0-9a-zA-Z]{1,}[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-Z]{2,4}?)$";
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
}
