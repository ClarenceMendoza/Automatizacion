package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Validators {
    private WebDriver driver;

    public Validators(WebDriver driver) {
        this.driver = driver;
    }

    // Validar el nombre completo del candidato
    public boolean validateFullName(String expectedName) {
        try {
            WebElement nameField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[3]/div"));
            String actualName = nameField.getAttribute("value");
            return expectedName.equals(actualName);
        } catch (NoSuchElementException e) {
            System.out.println("El campo de nombre completo no se encontró.");
            return false;
        }
    }


    // Validar el nombre de la vacante
    public boolean validateEmail(String expectedEmail) {
        try {
            WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
            String actualEmail = emailField.getAttribute("value");
            return expectedEmail.equals(actualEmail);
        } catch (NoSuchElementException e) {
            System.out.println("El campo de correo electrónico no se encontró.");
            return false;
        }
    }
/*/ 
     Validar el Gerente de Contrataciones
    public boolean validateContactNumber(String expectedContactNumber) {
        try {
            WebElement contactNumberField = driver.findElement(By.xpath("//input[@name='contactNumber']"));
            String actualContactNumber = contactNumberField.getAttribute("value");
            return expectedContactNumber.equals(actualContactNumber);
        } catch (NoSuchElementException e) {
            System.out.println("El campo de número de contacto no se encontró.");
            return false;
        }
    }

    // Validar la fecha de la aplicacion
    public boolean validateContactNumber(String expectedContactNumber) {
    try {
        WebElement contactNumberField = driver.findElement(By.xpath("//input[@name='contactNumber']"));
        String actualContactNumber = contactNumberField.getAttribute("value");
        return expectedContactNumber.equals(actualContactNumber);
    } catch (NoSuchElementException e) {
        System.out.println("El campo de número de contacto no se encontró.");
        return false;
    }

    // Validar el status de la aplicacion
    public boolean validateContactNumber(String expectedContactNumber) {
        try {
            WebElement contactNumberField = driver.findElement(By.xpath("//input[@name='contactNumber']"));
            String actualContactNumber = contactNumberField.getAttribute("value");
            return expectedContactNumber.equals(actualContactNumber);
        } catch (NoSuchElementException e) {
            System.out.println("El campo de número de contacto no se encontró.");
            return false;
        }
/*/



}






}

