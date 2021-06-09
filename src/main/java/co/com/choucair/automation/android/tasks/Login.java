package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.automation.android.userinterfaces.ApplicationHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login implements Task {
    private String email;
    private String password;
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public static Login fillForm(String email, String password) {
        return Tasks.instrumented(Login.class, email, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(INPUT_EMAIL),
                Click.on(BUTTON_NEXT),
                Click.on(LINK_PASSWORD),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_NEXT),
                WaitUntil.the(LABEL_TEXT,isPresent()).forNoMoreThan(10).seconds()

        );
    }
}
