package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class FirstLaptop extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(FirstLaptop.class);

    private final By firstLaptop = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]");

    private final By likeComment = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[1]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]");

    private final By addToChart = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/a[1]/div[1]");

    public FirstLaptop navigateToFirstLaptop() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(firstLaptop);
        return new FirstLaptop();
    }

    public FirstLaptop navigateToFirstLaptop2() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(firstLaptop);
        return new FirstLaptop();
    }

    public LaptopsPage likeComment(){
        LOG.info("Like Laptop");
        mouseActions.clickOn(likeComment);
        wait.waitFor(Duration.ofSeconds(3));
        return new LaptopsPage();

    }  public LaptopsPage addToChart(){
        LOG.info("Like Laptop");
        mouseActions.clickOn(addToChart);
        wait.waitFor(Duration.ofSeconds(3));
        return new LaptopsPage();
    }

}
