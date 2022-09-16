package testing.pruebagit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class StartGithubPage {

    public static final Target BTN_SING_IN = Target
            .the("este es el boton para ir a la interfaz de logeuo")
            .locatedBy("//a[contains(text(),'Sign in')]");
}
