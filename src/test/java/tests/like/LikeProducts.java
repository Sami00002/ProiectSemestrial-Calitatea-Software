package tests.like;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LikeProducts extends BaseTest {
    @Test(description = "Like products")
    public void likeProducts() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops()
                .likeLaptop();
    }
}
