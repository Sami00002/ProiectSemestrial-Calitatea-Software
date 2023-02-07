package tests.likeComment;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LikeComment extends BaseTest {
    @Test(description = "Like comment")
    public void likeComment() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops2()
                .navigateToFirstLaptop()
                .likeComment();
    }
}
