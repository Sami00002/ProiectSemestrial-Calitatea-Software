package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class Chart extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(Chart.class);

    private final By addToChart = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/a[1]/div[1]");

    private final By goToChart = By.xpath("//body/div[@id='mainWrapper']/div[@id='meniu_c']/div[2]/div[1]/div[1]/div[5]/a[4]");

    private final By delete = By.xpath("//body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]/span[1]");


    public Chart navigateToChart() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(goToChart);
        return new Chart();
    }

    public LaptopsPage deleteFromChart(){
        LOG.info("Like Laptop");
        mouseActions.clickOn(delete);
        wait.waitFor(Duration.ofSeconds(3));
        return new LaptopsPage();
    }

}
