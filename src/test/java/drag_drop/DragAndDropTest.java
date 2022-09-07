package drag_drop;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        Configuration.browserSize = "1920x1080";
    }



    @Test
    void dragAndDropTest() {
        open(Configuration.baseUrl);
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }


}
