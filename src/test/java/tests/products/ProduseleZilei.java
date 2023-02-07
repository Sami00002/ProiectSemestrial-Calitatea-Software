package tests.products;

import org.testng.annotations.Test;
import tests.BaseTest;

public class ProduseleZilei extends BaseTest {
    @Test(description = "Go to Produsele zilei and to the Filtre")
    public void navigateToProduseleZilei() {
        homePage
                .navigateToProduseleZilei()
                .filtre();
    }
}
