package tests.apple;

import config.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.dataProviders.DataProviders;

public class ApplePrice extends BaseTest {

    @Test(description = "Select Iphone")
    public void selectIphones() {
        homePage
                .navigateToPhones()
                .navigatePhonePhone()
                .selectIphone();
    }

    @Test(description = "search Price1", dataProvider = "prices1", dataProviderClass = DataProviders.class,
            groups = {"Prices", "smoke"})
    public void prices1(String prices1) {
        homePage
                .searchPrice1(prices1);
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains(prices1));
    }

    @Test(description = "search Price2", dataProvider = "prices2", dataProviderClass = DataProviders.class,
            groups = {"Prices", "smoke"})
    public void prices2(String prices2) {
        homePage
                .searchPrice2(prices2);
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains(prices2));
    }
}
