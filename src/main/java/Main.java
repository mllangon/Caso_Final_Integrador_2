import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Eres staff o visitante?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("Staff")) {
            // Proporcionar acceso a todos los datos
            // Aquí necesitarás llamar a los métodos correspondientes para proporcionar acceso
            System.out.println("Acceso a todos los datos proporcionado.");
        } else if (userType.equalsIgnoreCase("Visitante")) {
            System.out.println("Por favor, introduce tu edad:");
            int age = scanner.nextInt();

            if (age < 18) {
                // Proporcionar acceso a GuiaNiños
                // GuiaNiños.acceso();
                System.out.println("Guia para niños proporcionado");
            } else {
                // Proporcionar acceso a otras guías
                // Aquí necesitarás llamar a los métodos correspondientes para proporcionar acceso
                System.out.println("Elige un guía: Aves, Mamíferos, Acuáticos, Herpetario o Insectos. ");
            }
        } else {
            System.out.println("Tipo de usuario no reconocido.");
        }

        scanner.close();
    }
}