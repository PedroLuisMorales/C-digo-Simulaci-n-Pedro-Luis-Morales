// Pruebas automatizadas del motor de búsqueda
// Simula el comportamiento de un usuario en la barra de búsqueda
package tests;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    public void pausa(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
@Test
public void caso1_escribir() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

    pausa(3000);
}

@Test
public void caso2_escribirOtro() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("Pruebas QA");

    pausa(3000);
}

@Test
public void caso3_escribirMas() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("JUnit Selenium");

    pausa(3000);
}

@Test
public void caso4_busquedaUnaVez() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("Testing software");

    pausa(2000);

    driver.findElement(By.name("q")).submit();

    pausa(3000);
}

@Test
public void caso5_escribirFinal() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("Automatizacion");

    pausa(3000);
}

@Test
public void caso6_escrituraExtra() {
    driver.get("https://www.google.com");
    pausa(2000);

    driver.findElement(By.name("q")).sendKeys("Calidad de software");

    pausa(3000);
}
}
