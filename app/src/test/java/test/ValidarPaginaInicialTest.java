package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import task.DemoBlazeEfeturarCompraTask;

public class ValidarPaginaInicialTest {

    ConfigSiteDemoBlaze iniciarTest;
    DemoBlazeEfeturarCompraTask comprarTask;
    WebDriver driver;

    @BeforeEach
    public void prepararTest() {
        iniciarTest = new ConfigSiteDemoBlaze();
        comprarTask = new DemoBlazeEfeturarCompraTask(driver, iniciarTest);
        iniciarTest.AbrirSiteParaTest();
    }

    @AfterEach
    public void finalizarTest() {
        iniciarTest.fecharSite();
    }

    @Test
    public void validarPaginaInicial() {
        comprarTask.validarPaginaInicial();
    }
}