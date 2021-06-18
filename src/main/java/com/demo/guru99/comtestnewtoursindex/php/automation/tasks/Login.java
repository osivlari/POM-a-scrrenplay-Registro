package com.demo.guru99.comtestnewtoursindex.php.automation.tasks;

import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.IndexPage;
import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    String userName;
    String password;


    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Ensure.that(IndexPage.ENSURE_TIME).isDisplayed());
        actor.attemptsTo(Click.on(IndexPage.BUTTON_LOGIN));
        actor.attemptsTo(Enter.theValue(userName).into(LoginPage.USERNAME_DATE));
        actor.attemptsTo(Enter.theValue(password).into(LoginPage.PASSWORD_DATE));
        actor.attemptsTo(Click.on(LoginPage.BUTTON_SUBMIT));

    }

    public static Login datesUserLogin(String userName, String  password) {
        return instrumented(Login.class, userName, password);
    }

}