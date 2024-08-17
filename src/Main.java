import org.openqa.selenium.WebDriver;
import src.drivers.App;

public class Main {
    public static void main(String[] args) {
        App app = new App();  // Crea una instancia de App
        App.DriverManager driverManager = app.new DriverManager();  // Usa la instancia de App para crear DriverManager
        driverManager.initializeDriver();
        WebDriver driver = driverManager.getDriver();
        driver.manage().window().maximize();

        try {
            PaginaPrincipal paginaPrincipal = new PaginaPrincipal(driver);

            paginaPrincipal.openPage();
            Thread.sleep(6000);

            paginaPrincipal.Username("Admin");
            Thread.sleep(2000);

            paginaPrincipal.enterPassword("admin123");
            Thread.sleep(2000);

            paginaPrincipal.submitButton();
            Thread.sleep(1000);
       
            paginaPrincipal.clickRecruitmentButton();
            Thread.sleep(1000);

            paginaPrincipal.addFormCandidatesButton();
            Thread.sleep(1000);

            paginaPrincipal.fullnameInput("oscar");
            Thread.sleep(1000);

            paginaPrincipal.middlenameInput("andres");
            Thread.sleep(1000); 

            paginaPrincipal.lastnameInput("roa");
            Thread.sleep(2000);

            paginaPrincipal.vacancyDropdownButton("Senior QA Lead");
            Thread.sleep(2000);

            paginaPrincipal.emailInput("oscarandres@gmail.com");
            Thread.sleep(2000);

            paginaPrincipal.contactNumberInput("453465464347");
            Thread.sleep(2000);

            // Seleccionar una fecha
            // paginaPrincipal.selectDate("2023-08-15");
            // Thread.sleep(2000);

            // ruta y formato del archivo C:\\Users\\clare\\Desktop\\CODIGO.Clarence Mendoza - CV.docx
            String filePath = "C:\\Users\\clare\\Desktop\\CODIGO\\Clarence Mendoza - CV.docx";
            paginaPrincipal.browseInformationButton(driver, filePath);

            paginaPrincipal.clickRecruitmentButtonForm();
            Thread.sleep(8000);

            paginaPrincipal.VacanciesButton();
            Thread.sleep(8000);

            Thread.sleep(2000);
            paginaPrincipal.vacancyDropdownButton("QA Lead");
            Thread.sleep(2000);


            paginaPrincipal.vacancyDropdownButton("Pooja Bhole");
            Thread.sleep(2000);

            paginaPrincipal.vacancyDropdownButton("Active");
            Thread.sleep(2000);



            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
