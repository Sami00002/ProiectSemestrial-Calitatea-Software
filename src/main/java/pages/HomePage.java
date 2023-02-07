package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import reporting.ExtentManager;
import util.CustomLogger;

public class HomePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);
    private final By searchBar = By.xpath("//input[@id='keyword']");

    private final By priceBar1 = By.xpath("//input[@id='minManualValue']");

    private final By priceBar2 = By.xpath("//input[@id='maxManualValue']");

    private final By laptopCategoryButton = By.xpath("//a[contains(text(),'Laptopuri, Tablete & Software')]");

    private final By phoneCategoryButton = By.xpath("//a[contains(text(),'Telefoane Mobile & Gadget')]");

    private final By produseleZileiButton = By.xpath("//a[contains(text(),'Produsele zilei')]");

    private final By ultimeleProduse = By.xpath("//body/div[@id='mainWrapper']/div[2]/div[4]/a[2]/div[1]");

    public HomePage searchProduct(String product) {
        LOG.info("Search product: {}", product);
        keyboardActions.clearTheText(searchBar);
        keyboardActions.typeText(searchBar, product);
        keyboardActions.typeText(searchBar, String.valueOf(Keys.ENTER));
        return this;
    }

    public LaptopsTabletsSoftwarePage navigateToLaptops(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(laptopCategoryButton);
        return new LaptopsTabletsSoftwarePage();
    }

    public TelefoaneMobileGadgetSoftwarePage navigateToPhones(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(phoneCategoryButton);
        return new TelefoaneMobileGadgetSoftwarePage();
    }

    public HomePage searchPrice1(String price) {
        LOG.info("Search price: {}", price);
        keyboardActions.clearTheText(priceBar1);
        keyboardActions.typeText(priceBar1, price);
        keyboardActions.typeText(priceBar1, String.valueOf(Keys.ENTER));
        return this;
    }

    public HomePage searchPrice2(String price) {
        LOG.info("Search price: {}", price);
        keyboardActions.clearTheText(priceBar2);
        keyboardActions.typeText(priceBar2, price);
        keyboardActions.typeText(priceBar2, String.valueOf(Keys.ENTER));
        return this;
    }

    public ProduseleZilei navigateToProduseleZilei(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(produseleZileiButton);
        return new ProduseleZilei();
    }

    public UltimeleProduse navigateToUltimeleProduse(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(ultimeleProduse);
        return new UltimeleProduse();
    }
}
