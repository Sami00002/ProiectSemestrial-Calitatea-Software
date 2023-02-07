package tests.chart;

import org.testng.annotations.Test;
import tests.BaseTest;

public class AddToChart extends BaseTest {
    @Test(description = "Add the first laptop to cart")
    public void addToCart() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops2()
                .navigateToFirstLaptop()
                .addToChart();
    }
}
