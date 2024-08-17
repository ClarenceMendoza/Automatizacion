package src;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

// Clase DropdownAutomator para manejar el dropdown
public class DropdownAutomator {
    private WebDriver driver;
    private WebDriverWait wait;

    public DropdownAutomator(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void selectOption(String valorASeleccionar) {
        try {
            // Esperar hasta que el dropdown esté disponible y hacer clic para desplegar las opciones
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-select-text-input")));
            dropdown.click();

            // Buscar y seleccionar la opción deseada
            List<WebElement> opciones = driver.findElements(By.xpath("//div[@class='oxd-select-wrapper']//span"));
            boolean valorEncontrado = false;

            for (WebElement opcion : opciones) {
                if (opcion.getText().trim().equals(valorASeleccionar)) {
                    opcion.click();
                    valorEncontrado = true;
                    break;
                }
            }

            // Si no se encontró el valor, seleccionar la primera opción disponible
            if (!valorEncontrado) {
                System.out.println("No se encontró el valor especificado. Seleccionando la primera opción disponible.");
                opciones.get(0).click();
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}


