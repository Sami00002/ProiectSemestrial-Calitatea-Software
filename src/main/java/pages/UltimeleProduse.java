package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class UltimeleProduse extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(UltimeleProduse.class);
    private final By camereButton = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/a[1]");

    public AcesoriiCamereSupravehgere navigateToCamereSupraveghere() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(camereButton);
        return new AcesoriiCamereSupravehgere();
    }

}
