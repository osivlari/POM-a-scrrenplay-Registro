package com.demo.guru99.comtestnewtoursindex.php.automation.tasks;

import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OptionInHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.BUTTON_REGISTER));
    }


    public static OptionInHome register(){
        return instrumented(OptionInHome.class);
    }
}
