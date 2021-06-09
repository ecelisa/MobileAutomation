package co.com.choucair.automation.android.questions;

import co.com.choucair.automation.android.userinterfaces.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyWith implements Question<Boolean> {
    private String question;

    public VerifyWith(String question) {
        this.question = question;
    }

    public static VerifyWith the(String question) {
        return new VerifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(ApplicationHomePage.LABEL_TEXT).viewedBy(actor).asString();
        return question.equals(answer);
    }
}
