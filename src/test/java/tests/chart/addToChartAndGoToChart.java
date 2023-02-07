package tests.chart;

import org.testng.annotations.Test;
import tests.BaseTest;

public class addToChartAndGoToChart extends BaseTest {
    @Test(description = "Add the first laptop to cart and go to cart")
    public void addToChartAndGoToChart() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops2()
                .navigateToFirstLaptop()
                .addToChart()
                .navigateToChart();
    }
}
