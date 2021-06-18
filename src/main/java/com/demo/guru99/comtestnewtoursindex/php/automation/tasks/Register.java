package com.demo.guru99.comtestnewtoursindex.php.automation.tasks;

import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.HomePage;
import com.demo.guru99.comtestnewtoursindex.php.automation.models.Data;
import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    private List<Data> data;

    public Register(List<Data> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(RegisterPage.DATE_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getLastName()).into(RegisterPage.DATE_LASTNAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getPhone()).into(RegisterPage.DATE_PHONE));
        actor.attemptsTo(Enter.theValue(data.get(0).getEmail()).into(RegisterPage.DATE_EMAIL));
        actor.attemptsTo(Enter.theValue(data.get(0).getAddress1()).into(RegisterPage.DATE_ADDRESS1));
        actor.attemptsTo(Enter.theValue(data.get(0).getCity()).into(RegisterPage.DATE_CITY));
        actor.attemptsTo(Enter.theValue(data.get(0).getState()).into(RegisterPage.DATE_STATE));
        actor.attemptsTo(Enter.theValue(data.get(0).getPostalCode()).into(RegisterPage.DATE_CODEPOSTAL));
        actor.attemptsTo(Enter.theValue(data.get(0).getUserName()).into(RegisterPage.DATE_USERNAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(RegisterPage.DATE_PASSWORD));
        actor.attemptsTo(Enter.theValue(data.get(0).getConfirmPassword()).into(RegisterPage.DATE_CONFIRMPASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BUTTON_SUMIT));
    }

    public static Register datesUser(List<Data> data) {
        return instrumented(Register.class, data);
    }
}
