package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class LaptopsPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(LaptopsPage.class);

    private final By likeLaptop = By.xpath("//div[@id='r6855689']");

    private final By toChart = By.xpath("//body/div[@id='mainWrapper']/div[@id='meniu_c']/div[2]/div[1]/div[1]/div[5]/a[4]");

    public LaptopsPage likeLaptop(){
        LOG.info("Like Laptop");
        mouseActions.clickOn(likeLaptop);
        wait.waitFor(Duration.ofSeconds(3));
        return new LaptopsPage();
    }

    public Chart navigateToChart() {
        LOG.info("Add to chart");
        mouseActions.clickOn(toChart);
        wait.waitFor(Duration.ofSeconds(3));
        return new Chart();
    }

}
