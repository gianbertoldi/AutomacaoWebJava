package task;

import org.openqa.selenium.WebDriver;

import page.DemoBlazePaginaInicialPage;
import test.ConfigSiteDemoBlaze;
import validations.ValidarHome;

public class DemoBlazeEfeturarCompraTask {

    ConfigSiteDemoBlaze iniciarTest;
    WebDriver driver;
    DemoBlazePaginaInicialPage paginaInicialPage;
     ValidarHome homeValidations;

    public DemoBlazeEfeturarCompraTask(WebDriver driver, ConfigSiteDemoBlaze iniciarTest) {
        this.driver = driver;
        this.iniciarTest = iniciarTest;
        this.paginaInicialPage = new DemoBlazePaginaInicialPage(iniciarTest, driver);
        this.homeValidations = new ValidarHome(driver, iniciarTest);
    }

    public void validarPaginaInicial() {
        homeValidations.validarTituloHome();
    }

    public void efetuarCompraAreaMonitores() {
        
    }
}