import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import src.DropdownAutomator;

import org.openqa.selenium.By;

public class PaginaPrincipal {
    private static WebDriver driver;
    

    public PaginaPrincipal(WebDriver driver) {
        PaginaPrincipal.driver = driver;
        
    }

    // Abre la página principal
    public void openPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // Cambia por la URL de tu aplicación
    }

    // Username
    public void Username(String user) {
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys(user);  // Envía el parámetro 'user' al campo de nombre de usuario
    }

    // Password
    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys(password);
    }

    // Boton de login
    public void submitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }

    // Botón de Recruitment
    public void clickRecruitmentButton() {
        WebElement recruitmentButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]"));  
        recruitmentButton.click();
    }

    // Botón de add en el formulario de candidatos
    public void addFormCandidatesButton() {
        WebElement addFormCandidatesButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));  
        addFormCandidatesButton.click();
    }

    // Full Name Input
    public void fullnameInput(String name) {
        WebElement fullnameInput = driver.findElement(By.xpath("//input[@name='firstName']"));
        fullnameInput.sendKeys(name);  // Envía el parámetro 'user' al campo de nombre completo
    }

    // Middle Name Input
    public void middlenameInput(String middlename) {
        WebElement middlenameInput = driver.findElement(By.xpath("//input[@name='middleName']"));
        middlenameInput.sendKeys(middlename);  // Envía el parámetro 'user' al campo de segundo nombre
    }

    // Last Name Input
    public void lastnameInput(String lastname) {
        WebElement lastnameInput = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastnameInput.sendKeys(lastname);  // Envía el parámetro 'user' al campo de apellido
    }

        // Vacancy dropdown Button
        public void vacancyDropdownButton(String vacancy) {
            // Crear una instancia de DropdownAutomator y seleccionar la opción
            DropdownAutomator dropdownAutomator = new DropdownAutomator(driver);
            dropdownAutomator.selectOption(vacancy);
        }
              
    
    // Email Input
    public void emailInput(String email) {
        WebElement emailInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
        emailInput.sendKeys(email);  // Envía el parámetro 'email' al campo de correo electrónico
    }

    // Contact Number Input
    public void contactNumberInput(String contactNumber) {
        WebElement contactNumberInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));
        contactNumberInput.sendKeys(contactNumber);  // Envía el parámetro 'contactNumber' al campo de número de contacto
    }

    // Método para subir un archivo
    public static void browseInformationButton(String filePath) {
        WebElement fileInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div"));
        fileInput.sendKeys(filePath);
    }

    /* / Método para seleccionar una fecha en el calendario
    public void selectDate(String date) {
        datePicker.calendar(date);  // Utiliza el método del DatePicker para seleccionar la fecha
    }  / */

    // Método para subir un archivo con WebDriver
    public void browseInformationButton(WebDriver driver, String filePath) {
        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys(filePath);
    }

    // Método para Boton Aceptar en formulario de Recruitment
    public void clickRecruitmentButtonForm() {
        WebElement clickRecruitmentButtonForm = driver.findElement(By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"oxd-checkbox-input-icon\", \" \" ))]"));
        clickRecruitmentButtonForm.click();
    }


    // Método para Boton de vacantes
    public void VacanciesButton() {
    WebElement VacanciesButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
    VacanciesButton.click();
    }

    
    // Método para Boton de Shorlist
    public void shorlistButton() {
        WebElement shorlistButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
        shorlistButton.click();
    }





}

 




            








