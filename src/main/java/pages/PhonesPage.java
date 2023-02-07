package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class PhonesPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(PhonesPage.class);

    private final By selectApple = By.xpath("//a[contains(text(),'Apple')]");

    public Chart selectIphone() {
        LOG.info("Add to chart");
        mouseActions.clickOn(selectApple);
        wait.waitFor(Duration.ofSeconds(3));
        return new Chart();
    }

}
