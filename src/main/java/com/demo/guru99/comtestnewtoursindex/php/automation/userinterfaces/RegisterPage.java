package com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    public static final Target DATE_FIRSTNAME = Target.the("Button option register user").locatedBy("//tbody/tr[2]/td[2]/input[1]");
    public static final Target DATE_LASTNAME = Target.the("Button option register user").located(By.name("lastName"));
    public static final Target DATE_PHONE = Target.the("Button option register user").located(By.name("phone"));
    public static final Target DATE_EMAIL = Target.the("Button option register user").located(By.name("email"));
    public static final Target DATE_ADDRESS1 = Target.the("Button option register user").located(By.name("address1"));
    public static final Target DATE_CITY = Target.the("Button option register user").located(By.name("city"));
    public static final Target DATE_STATE = Target.the("Button option register user").located(By.name("state"));
    public static final Target DATE_CODEPOSTAL = Target.the("Button option register user").located(By.name("postalCode"));
    public static final Target DATE_PASSWORD = Target.the("Button option register user").located(By.name("password"));
    public static final Target DATE_USERNAME = Target.the("Button option register user").located(By.name("userName"));
    public static final Target DATE_CONFIRMPASSWORD = Target.the("Button option register user").located(By.name("confirmPassword"));
    public static final Target BUTTON_SUMIT = Target.the("Button option register user").located(By.name("submit"));

}
