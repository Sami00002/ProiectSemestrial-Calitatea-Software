package tests.ultimeleProduse;

import org.testng.annotations.Test;
import tests.BaseTest;

public class CamereSupraveghere extends BaseTest {
    @Test(description = "Select all thongs in Ultimele produse in left side")
    public void CamereDeSupraveghere() {
        homePage
                .navigateToUltimeleProduse()
                .navigateToCamereSupraveghere()
                .selectAllThings()
                .selectAllThings2();
    }
}
