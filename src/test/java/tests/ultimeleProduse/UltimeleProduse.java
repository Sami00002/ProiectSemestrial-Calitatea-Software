package tests.ultimeleProduse;

import org.testng.annotations.Test;
import tests.BaseTest;

public class UltimeleProduse extends BaseTest {
    @Test(description = "Navigate to ultimele produse")
    public void goToUltimeleProduse() {
        homePage
                .navigateToUltimeleProduse();
    }
}
