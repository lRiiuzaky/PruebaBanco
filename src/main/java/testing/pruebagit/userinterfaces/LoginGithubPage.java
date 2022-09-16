package testing.pruebagit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class LoginGithubPage {

    public static final Target INPUT_USER = Target.the("Input para ingresar el usuario de git")
            .located(By.id("login_field"));

    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar la contraseña de git")
            .located(By.id("password"));

    public static final Target BTN_INGRESAR = Target.the("boton para iniciar sesion")
            .locatedBy("//input[@value='Sign in']");


}
