package testing.pruebagit.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.pruebagit.constants.GeneralConstants;
import testing.pruebagit.driver.DriverRemoteBrowser;
import testing.pruebagit.models.Login;
import testing.pruebagit.question.TextoValidacionLoginGithub;
import testing.pruebagit.tasks.LoginGithubTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginGithubStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que Jonathan debo ingresar a la url de github$")
    public void queJonathanDeboIngresarALaUrlDeGithub() {
        DriverRemoteBrowser.withOptions();
        OnStage.theActorCalled(GeneralConstants.actor).can(BrowseTheWeb
                .with(DriverRemoteBrowser.en(GeneralConstants.urlGithub)));
    }

    @Cuando("^Jonathan ingreso los datos$")
    public void jonathanIngresoLosDatos(List<Login> loginList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginGithubTask.donde().user(loginList.get(0).getUser())
                        .password(loginList.get(0).getPassword())
        );

    }

    @Entonces("^Jonathan puede ver el texto (.*)$")
    public void jonathanPuedeVerElTextoRecentRepositories(String text) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TextoValidacionLoginGithub.textoValidador(), equalTo(text))
        );
    }



}
