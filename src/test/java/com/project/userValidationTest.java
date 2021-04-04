package com.project;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class userValidationTest {
    @Test
    public void enterFirstname_whenProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Firstname");
        Assert.assertEquals(true,result);
    }
    @Test
    public void enterFirstname_whenNotProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("firstname");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenShort_returnFalse(){
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Fi");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithSpecialChar_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("First@name");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithNumericValues_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("First114");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithSpace_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("First name");
        Assert.assertEquals(false,result);
    }

    //UC-2
    @Test
    public void enterLastname_whenProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("Lastname");
        Assert.assertEquals(true,result);
    }
    @Test
    public void enterLastname_whenNotProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("lastname");
        Assert.assertEquals(false,result);
    }
    @Test
    public void enterLastname_whenShort_returnFalse(){
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("Po");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterLastname_whenWithSpecialChar_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("P&otdar");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterLastname_whenWithNumericValues_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("Potdar22");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterLastname_whenWithSpace_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("Potd ar");
        Assert.assertEquals(false,result);
    }

    //UC3
    @Test
    public void enterEmail_whenProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname.lastname@yaho.com.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void enterEmail_whenNotProper_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname.lastname@yaho.in");
        Assert.assertEquals(false,result);
    }
    @Test
    public void enterEmail_whenNotProper1_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname..lastname@yaho.com.in");
        Assert.assertEquals(false,result);
    }
    @Test
    public void enterEmail_whenNotProper2_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname.lastname@@yaho.com.in");
        Assert.assertEquals(false,result);
    }
    @Test
    public void enterEmail_whenNotProper3_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname.lastname@yaho.com.co.in");
        Assert.assertEquals(false,result);
    }
    @Test
    public void enterEmail_whenwithSpecialChar_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateEmail("firstname#.lastname^@yaho.in");
        Assert.assertEquals(false,result);
    }

}
