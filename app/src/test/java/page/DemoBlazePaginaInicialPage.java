package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.ConfigSiteDemoBlaze;

public class DemoBlazePaginaInicialPage {

    ConfigSiteDemoBlaze iniciarTest;
    WebDriver driver;

    public DemoBlazePaginaInicialPage(ConfigSiteDemoBlaze iniciarTest, WebDriver driver) {
        this.iniciarTest = iniciarTest;
        this.driver = driver;
    }

    public WebElement getTitlePage() {
        return iniciarTest.procurarElemento(By.id("nava"));
    }
}