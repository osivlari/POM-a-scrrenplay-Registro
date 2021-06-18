package com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IndexPage extends PageObject {

    public static final Target ENSURE_TIME = Target.the("Button option login user").locatedBy("//a[contains(text(),'Travel @ About.com')]");
    public static final Target BUTTON_REGISTER = Target.the("Button option register user").locatedBy("//a[contains(text(),'REGISTER')]");
    public static final Target BUTTON_LOGIN = Target.the("Button option Login user").locatedBy("//a[contains(text(),'sign-in')]");


}
