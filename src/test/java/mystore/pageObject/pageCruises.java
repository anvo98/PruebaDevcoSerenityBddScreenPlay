package mystore.pageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class pageCruises {
	public static Target moreTravel = Target.the("opcion moreTravel")
			.located(By.xpath("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]"));
	public static Target Cruises = Target.the("opcion Cruises")
			.located(By.xpath("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[5]"));
	public static Target goinTo = Target.the("input goinTo")
			.located(By.xpath("//select[@id='cruise-destination']"));
	public static Target search = Target.the("boton search")
			.located(By.xpath("//button[contains(text(),'Search')]"));
	public static Target go = Target.the("opcion go")
			.located(By.xpath("//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='paxModalContainer']/div[1]/div[1]/div[2]/div[1]/button[1]"));
	public static Target CruisesItem = Target.the("botton CruisesItem")
			.located(By.xpath("//a[@id='selectSailingButton-AQoCY3YSAmJyGID49fqlLyAEKgNnbHMyAnVzOgNnbHNCAnVz-BR']"));
	public static Target CruisesItemCabin = Target.the("botton CruisesItemCabin")
			.located(By.xpath("//a[@id='supercat-INSIDE']"));
	public static Target CruisesItemCabinType = Target.the("botton CruisesItemCabinType")
			.located(By.xpath("//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/section[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]"));
	public static Target PriceDetails = Target.the("texto PriceDetails")
			.located(By.xpath("//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]"));
	
}