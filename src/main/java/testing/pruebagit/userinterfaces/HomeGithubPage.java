package testing.pruebagit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeGithubPage {

    public static final Target LABEL_TEXTO_VALIDADOR = Target.the("label que tiene el texto a validar")
            .locatedBy("//div[@class='border-top']//h2[contains(.,'Recent activity')]");


}
