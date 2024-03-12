import java.util.Scanner;
import Visitantes.GuiaNiños;
import Visitantes.GuiaMamiferos;
import Visitantes.GuiaHerpetario;
import Visitantes.GuiaInsectos;
import Visitantes.GuiaAcuaticos;

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
            System.out.println("Elige un guía: Guía niños (Recomendado para menores de 12 y cumpleaños), Mamíferos, Acuáticos, Herpetario o Insectos. ");
            String guiaElegida = scanner.nextLine();

            switch (guiaElegida.toLowerCase()) {
                case "guía niños (recomendado para menores de 12 y cumpleaños)":
                    GuiaNiños guiaNiños = new GuiaNiños();
                    guiaNiños.ofrecerGuia();
                    break;
                case "mamíferos":
                    GuiaMamiferos guiaMamiferos = new GuiaMamiferos();
                    guiaMamiferos.ofrecerGuia();
                    break;
                case "acuáticos":
                    GuiaAcuaticos guiaAcuaticos = new GuiaAcuaticos();
                    guiaAcuaticos.ofrecerGuia();
                    break;
                case "herpetario":
                    GuiaHerpetario guiaHerpetario = new GuiaHerpetario();
                    guiaHerpetario.ofrecerGuia();
                    break;
                case "insectos":
                    GuiaInsectos guiaInsectos = new GuiaInsectos();
                    guiaInsectos.ofrecerGuia();
                    break;
                default:
                    System.out.println("Guía no reconocida.");
                    break;
            }
        } else {
            System.out.println("Tipo de usuario no reconocido.");
        }

        scanner.close();
    }
}