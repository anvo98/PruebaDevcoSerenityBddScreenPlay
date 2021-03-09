package mystore.stepdefinitions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


import mystore.actions.Choose;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mystore.actions.GetInto;
import mystore.questions.assertTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class stepDefinitionTravelocity {

	@Steps(shared = true)
	Actor actor = Actor.named("el usuario de devco");
	@Managed
	WebDriver driver;
	
	@Given("^ingresa al sitio web de travelocity.com$")
	public void ingresarSitioWeb() {
		actor.can(BrowseTheWeb.with(driver));
	}

	@When("^el usuario busca un crucero$")
	public void chooseCruises() {
		actor.attemptsTo(GetInto.chooseCruisesGoinTo(driver));
		actor.attemptsTo(Choose.chooseCruise(driver));
	}

	@Then("el usuario valida el crucero seleccionado$")
	public void assertSearchCruises() {
		actor.should(seeThat("", assertTravelocity.subtitulo(), equalTo("Price details")));
	}
	}
	
	



