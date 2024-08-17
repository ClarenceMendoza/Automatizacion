package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vacancyDropdown {

    public static void main(String[] args) {
        // Configurar el driver de Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Asegúrate de poner la ruta correcta
        WebDriver driver = new ChromeDriver();

        try {

            // Instanciar la clase vacancyDropdown
            vacancyDropdown dropdownAutomation = new vacancyDropdown(driver);

            // Llamar al método para seleccionar la opción "QA Lead"
            vacancyDropdown.selectOption("QA Lead");

            // Añadir cualquier otra lógica de automatización que necesites aquí

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador después de la ejecución
            driver.quit();
        }
    }

    private static void selectOption(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectOption'");
    }
}
