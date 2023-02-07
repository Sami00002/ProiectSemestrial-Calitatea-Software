package tests.products;

import org.testng.annotations.Test;
import tests.BaseTest;

public class Iphones extends BaseTest {
    @Test(description = "Selecting iphone phone")
    public void IphonesSelected() {
        homePage
                .navigateToPhones()
                .navigatePhonePhone()
                .selectIphone();
    }
}
