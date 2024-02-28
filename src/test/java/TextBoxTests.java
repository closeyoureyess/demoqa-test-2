import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    //https://demoqa.com/text-box
    @Test
    void fillFormTests() {

        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

        open("/text-box");
        $("[id=userName]").setValue("Vadim Sirik");
        $("[id=userEmail]").setValue("demoqa@org.ru");
        $("[id=currentAddress]").setValue("1234");
        $("[id=permanentAddress]").setValue("Alabama");
        $("#submit").click();

        $("#output").shouldHave(text("Vadim Sirik"), text("demoqa@org.ru"),
                text("1234"), text("Alabama"));

    }
}
