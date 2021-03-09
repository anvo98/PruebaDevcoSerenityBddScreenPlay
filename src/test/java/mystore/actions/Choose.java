package mystore.actions;

import interactions.WaitToLoad;
import mystore.pageObject.pageCruises;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Choose implements Interaction {
	WebDriver driver;
	public Choose(WebDriver driver){
        this.driver = driver;
    }
	public static Performable chooseCruise(WebDriver driver) {
		return Instrumented.instanceOf(Choose.class).withProperties(driver);
	}
	@Override
	@Step("{0} se registra en lifemiles")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				SelectFromOptions.byVisibleText("Caribbean").from(pageCruises.goinTo),
				WaitToLoad.theMiliSeconds(3000),
				Click.on(pageCruises.search)
		);
		actor.attemptsTo(
				WaitToLoad.theMiliSeconds(3000),
				Click.on(pageCruises.CruisesItem)
				);
		ArrayList<String> pestaña = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(pestaña.get(1));
		actor.attemptsTo(
				WaitToLoad.theMiliSeconds(2000),
				Click.on(pageCruises.CruisesItemCabin),
				WaitToLoad.theMiliSeconds(2000),
				Click.on(pageCruises.CruisesItemCabinType));
	}








}
