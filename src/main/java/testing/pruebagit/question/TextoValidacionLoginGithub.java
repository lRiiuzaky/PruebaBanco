package testing.pruebagit.question;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.pruebagit.userinterfaces.HomeGithubPage;

public class TextoValidacionLoginGithub implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return HomeGithubPage.LABEL_TEXTO_VALIDADOR.resolveFor(actor).getText();
    }

    public static Question<String> textoValidador(){
        return Instrumented.instanceOf(TextoValidacionLoginGithub.class).withProperties();
    }

}
