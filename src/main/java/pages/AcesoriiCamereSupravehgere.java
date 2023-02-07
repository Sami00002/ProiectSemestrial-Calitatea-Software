package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;


public class AcesoriiCamereSupravehgere extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(AcesoriiCamereSupravehgere.class);
    private final By phoneButton = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]");

    private final By hawell = By.xpath("//a[contains(text(),'Hawell')]");
    private final By furnizorii = By.xpath("//a[contains(text(),'Furnizor')]");

    public AcesoriiCamereSupravehgere selectAllThings() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(hawell);
        return new AcesoriiCamereSupravehgere();
    }

    public AcesoriiCamereSupravehgere selectAllThings2() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(furnizorii);
        return new AcesoriiCamereSupravehgere();
    }

}
