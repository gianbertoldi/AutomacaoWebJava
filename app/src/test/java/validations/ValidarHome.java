package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import page.DemoBlazePaginaInicialPage;
import test.ConfigSiteDemoBlaze;

public class ValidarHome {

    DemoBlazePaginaInicialPage paginaIniciaPage;
    WebDriver driver;

    public ValidarHome(WebDriver driver, ConfigSiteDemoBlaze iniciarTest) {
        this.driver = driver;
        this.paginaIniciaPage = new DemoBlazePaginaInicialPage(iniciarTest, driver);
    }

    public void validarTituloHome() {
        Assertions.assertEquals(paginaIniciaPage.getTitlePage().getText(), "PRODUCT STORE");
    }
}