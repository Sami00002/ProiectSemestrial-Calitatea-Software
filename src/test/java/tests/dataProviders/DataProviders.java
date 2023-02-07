package tests.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "products")
    public Object[][] products() {
        return new Object[][]{
                {"iphone"}, {"samsung"}, {"motorola"}, {"huawei"}
        };
    }

    public Object[][] prices1() {
        return new Object[][]{
                {"1000"}
        };
    }

    public Object[][] prices2() {
        return new Object[][]{
                {"1000"}
        };
    }
}
