package com.demo.guru99.comtestnewtoursindex.php.automation.tasks;
import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new HomePage()));
    }


    public static OpenTheBrowser On(){
        return instrumented(OpenTheBrowser.class);
    }
}
