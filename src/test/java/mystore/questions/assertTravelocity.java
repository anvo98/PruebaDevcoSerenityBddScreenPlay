package mystore.questions;
import mystore.pageObject.pageCruises;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class assertTravelocity {
    public static Question<String> subtitulo() {
    return actor -> Text.of(pageCruises.PriceDetails)
            .viewedBy(actor).asString();
    }

}
