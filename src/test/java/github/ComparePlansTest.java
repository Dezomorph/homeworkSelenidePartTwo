package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ComparePlansTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void comparePlansTest() {

        open(Configuration.baseUrl);
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".font-mktg").shouldHave(text("Compare features"));
    }
}
