// Clase base para la configuración inicial del navegador
// Se encarga de abrir y cerrar el navegador antes y después de las pruebas
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
