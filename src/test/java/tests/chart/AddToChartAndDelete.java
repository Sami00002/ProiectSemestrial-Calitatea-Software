package tests.chart;

import org.testng.annotations.Test;
import tests.BaseTest;

public class AddToChartAndDelete extends BaseTest {
    @Test(description = "Add the first laptop to cart")
    public void AddToChartAndDelete() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops2()
                .navigateToFirstLaptop()
                .addToChart()
                .navigateToChart()
                .deleteFromChart();
    }
}
