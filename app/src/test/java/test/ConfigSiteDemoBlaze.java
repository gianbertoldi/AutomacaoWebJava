package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class ConfigSiteDemoBlaze {

	WebDriver driver = new ChromeDriver();

	public void AbrirSiteParaTest() {
		driver.get("https://www.demoblaze.com/index.html");
	}

	public void fecharSite() {
		driver.quit();
	}

	public WebElement procurarElemento(By by) {
		 
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
	}
	
}
