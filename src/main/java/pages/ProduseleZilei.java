package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class ProduseleZilei extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(ProduseleZilei.class);

    private final By filtre = By.xpath("//a[@id='btnShowFiltre']");

    public Chart filtre() {
        LOG.info("Go to filtre");
        mouseActions.clickOn(filtre);
        wait.waitFor(Duration.ofSeconds(3));
        return new Chart();
    }

}
