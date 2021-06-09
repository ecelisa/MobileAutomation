package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.VerifyWith;
import co.com.choucair.automation.android.tasks.Login;
import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AuthenticationStepDefinitions {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that me wants to enter the Wordpress application$")
    public void thatMeWantsToEnterTheWordpressApplication() {
        OnStage.theActorCalled("Elian").wasAbleTo(OpenThe.wordpressApp());
    }

    @When("^i login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.fillForm(email, password));
    }
    @Then("^you should see the login in the application with the message (.*)$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWith.the(question)));
    }
}
