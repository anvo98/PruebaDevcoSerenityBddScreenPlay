package mystore.actions;

import org.openqa.selenium.WebDriver;
import mystore.constant.Url;
import mystore.pageObject.pageCruises;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class GetInto implements Interaction {
	WebDriver driver;
	public GetInto(WebDriver driver){
        this.driver = driver;
    }
	public static Performable chooseCruisesGoinTo(WebDriver driver) {
		return Instrumented.instanceOf(GetInto.class).withProperties(driver);
	}
	@Override
	@Step("{0} ingresa los datos del formulario y da click en buscar")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Navigate.hacia(Url.paginaTravelocity),
				Click.on(pageCruises.moreTravel),
				Click.on(pageCruises.Cruises)
				);
	}

}
