package com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USERNAME_DATE = Target.the("Box date userName").located(By.name("userName"));
    public static final Target PASSWORD_DATE = Target.the("Box date password").located(By.name("password"));
    public static final Target BUTTON_SUBMIT = Target.the("Button submit login").locatedBy("//tbody/tr[4]/td[1]/input[1]");


}
