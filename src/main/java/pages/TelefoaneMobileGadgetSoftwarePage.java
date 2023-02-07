package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class TelefoaneMobileGadgetSoftwarePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(TelefoaneMobileGadgetSoftwarePage.class);
    private final By phoneButton = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]");

    public PhonesPage navigatePhonePhone() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(phoneButton);
        return new PhonesPage();
    }

}
