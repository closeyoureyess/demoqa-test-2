import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CssXpathExamples {
    void cssPathExamples() {
        //
        $("[data-testid-email]").setValue("1");
        $(by("data-testid", "email"));


    }
}
