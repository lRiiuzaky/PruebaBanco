package testing.pruebagit.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.pruebagit.userinterfaces.LoginGithubPage;
import testing.pruebagit.userinterfaces.StartGithubPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginGithubTask implements Task {

    String user;
    String password;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(StartGithubPage.BTN_SING_IN, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(StartGithubPage.BTN_SING_IN),
                WaitUntil.the(LoginGithubPage.INPUT_USER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(LoginGithubPage.INPUT_USER),
                Enter.theValue(password).into(LoginGithubPage.INPUT_PASSWORD),
                JavaScriptClick.on(LoginGithubPage.BTN_INGRESAR)
        );
    }

    public static LoginGithubTask donde(){
        return Instrumented.instanceOf(LoginGithubTask.class).withProperties();
    }

    public LoginGithubTask user(String user){
        this.user=user;
        return this;
    }
    public LoginGithubTask password(String password){
        this.password=password;
        return this;
    }

}
