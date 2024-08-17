public class Username {

    // Declarar correo y contraseña estáticos
    private static final String EMAIL = "Admin";
    private static final String PASSWORD = "admin123";

    public static void sendKeys() {
        // Aquí iría la lógica para manejar el correo y la contraseña
        // Por ejemplo, podrías simular el envío de estas credenciales a un campo de formulario:
        System.out.println("Correo: " + EMAIL);
        System.out.println("Contraseña: " + PASSWORD);

        // Lógica de operación, como enviar estas credenciales a un servicio
        // o emular la entrada de datos en un campo.
    }

    public static void main(String[] args) {
        // Llamar al método sendKeys para mostrar el correo y la contraseña
        sendKeys();
    }
}
