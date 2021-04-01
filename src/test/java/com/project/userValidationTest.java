package com.project;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class userValidationTest {
    @Test
    public void enterFirstname_whenProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Aishwarya");
        Assert.assertEquals(true,result);
    }
    @Test
    public void enterFirstname_whenNotProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("aishwarya");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenShort_returnFalse(){
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Ai");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithSpecialChar_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Aishw@rya");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithNumericValues_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Aishwa144");
        Assert.assertEquals(false,result);
    }

    @Test
    public void enterFirstname_whenWithSpace_returnFalse() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateFirstname("Aishwar ya");
        Assert.assertEquals(false,result);
    }

    //UC-2
    @Test
    public void enterLastname_whenProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("Potdar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void enterLastname_whenNotProper_returnTrue() {
        UserValidation userValidation =new UserValidation();
        boolean result= userValidation.validateLastname("potdar");
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
}
