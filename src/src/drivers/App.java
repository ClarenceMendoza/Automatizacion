package src.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {

    public class DriverManager {
        private WebDriver driver; 

        public void initializeDriver() {
            // Establece la propiedad del sistema para EdgeDriver
            System.setProperty("webdriver.edge.driver", "C:\\Users\\clare\\Desktop\\CODIGO\\edgedriver_win32\\msedgedriver.exe");
            driver = new EdgeDriver();                             
        }

        public WebDriver getDriver() {
            return driver;
        }

        public void quitDriver() {
            if (driver != null) {
                driver.quit();
            }
        
        }
    }
    }


