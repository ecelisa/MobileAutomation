package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomePage {
    public static final Target BUTTON_LOGIN = Target.the("button for redirect login form").located(By.id("org.wordpress.android:id/login_button"));
    public static final Target INPUT_EMAIL = Target.the("input for write email").located(By.id("org.wordpress.android:id/input"));
    public static final Target INPUT_PASSWORD = Target.the("input for write password").located(By.id("org.wordpress.android:id/input"));
    public static final Target BUTTON_NEXT = Target.the("button to show next section").located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target LINK_PASSWORD = Target.the("link for enter the password").located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target LABEL_TEXT = Target.the("text label for validations").located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
