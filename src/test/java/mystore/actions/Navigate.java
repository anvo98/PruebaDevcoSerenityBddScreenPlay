package mystore.actions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Navigate implements Interaction {
    @Override
    @Step("{0} navega hacia una pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(opcionDeURL));
    }

    public static Performable hacia(String opcionURL) {
        return Instrumented.instanceOf(Navigate.class).withProperties(opcionURL);
    }

    private final String opcionDeURL;

    public Navigate(String opcionDeURL) {
        this.opcionDeURL = opcionDeURL;
    }
}