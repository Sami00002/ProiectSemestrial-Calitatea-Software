package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class LaptopsTabletsSoftwarePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(LaptopsTabletsSoftwarePage.class);

    private final By laptopsLaptopsButton = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]");

    public LaptopsPage navigateToLaptopsLaptops() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(laptopsLaptopsButton);
        return new LaptopsPage();
    }

    public FirstLaptop navigateToLaptopsLaptops2() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(laptopsLaptopsButton);
        return new FirstLaptop();
    }

    public FirstLaptop navigateToLaptopsLaptops3() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(laptopsLaptopsButton);
        return new FirstLaptop();
    }

}
