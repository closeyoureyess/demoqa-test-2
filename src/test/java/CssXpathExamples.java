import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssPathExamples() {
        //
        $("[data-testid-email]").setValue("1");
        $(by("data-testid", "email"));
        //
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        //Если хотим указать, что за тип элемента ↓
        $("input#email").setValue("1");
        //* означает, что любой элемент
        $x("//*[@id='email']").setValue("1");

        //byName
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        //class
        $("[class=login_form_input_box]").setValue("1");
        // .-сокращение для класса
        $(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        $(".inputtext").$(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");

        $x("//div[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa.guru!")).click();
        $(withText("llo, qa.guru")).click();


    }
}
