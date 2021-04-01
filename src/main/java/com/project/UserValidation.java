package com.project;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String Name_Pattern="^[A-Z]{1}[a-z]{2,}$";
    public boolean validateFirstname(String fname) {
        Pattern pattern=Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastname(String lname) {
        Pattern pattern=Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }
}
