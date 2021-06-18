package com.demo.guru99.comtestnewtoursindex.php.automation.stepdefinitions;

import com.demo.guru99.comtestnewtoursindex.php.automation.models.Data;
import com.demo.guru99.comtestnewtoursindex.php.automation.tasks.Login;
import com.demo.guru99.comtestnewtoursindex.php.automation.tasks.OptionInHome;
import com.demo.guru99.comtestnewtoursindex.php.automation.tasks.Register;
import com.demo.guru99.comtestnewtoursindex.php.automation.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class RegisterStepsDefinitions {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private final Actor Oscar = Actor.named("Oscar");

    @Before
    public void setUp() {
        Oscar.can(BrowseTheWeb.with(navegador));
        Oscar.wasAbleTo(Open.browserOn(new HomePage()));
    }

    @Given("^nuevo registro$")
    public void selectRegister() {
        Oscar.attemptsTo(OptionInHome.register());
    }

    @When("^Este ingresa los datos en las casillas correspondientes de la informacion y le de enviar$")
    public void sendDatesUser(List<Data> dataList) {
        Oscar.attemptsTo(Register.datesUser(dataList));
    }

    @Then("^the user logs in the page username (.*),(.*)$")
    public void selectSingOn(String userName, String password) throws InterruptedException {
        Oscar.attemptsTo(Login.datesUserLogin(userName, password));
        Thread.sleep(3000);
    }
}

