import java.util.Scanner;
import Visitantes.GuiaNiños;
import Visitantes.GuiaMamiferos;
import Visitantes.GuiaAves;
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
            System.out.println("Elige un guía: Guía niños (Recomendado para menores de 12 y cumpleaños), Mamíferos, Aves, Acuáticos, Herpetario o Insectos. ");
            String guiaElegida = scanner.nextLine();

            switch (guiaElegida.toLowerCase()) {
                case "Guía niños (recomendado para menores de 12 y cumpleaños)":
                    GuiaNiños guiaNiños = new GuiaNiños();
                    guiaNiños.ofrecerGuia();
                    System.out.println("¿Quieres un recorrido especial por tu cumpleaños? (Sí/No)");
                    String cumpleaños = scanner.nextLine();
                    if (cumpleaños.equalsIgnoreCase("Sí")) {
                        System.out.println("¡Felicidades! Te llevaremos a un recorrido especial por tu cumpleaños, Empezaremos por los Mamíferos y recorreremos todo el zoológico hasta llegar a los Insectos. ¡Disfruta tu día!");
                    } else if (cumpleaños.equalsIgnoreCase("No")) {
                        System.out.println("En ese caso, ¿Por donde te gustaría empezar? (Mamíferos, Aves, Acuáticos, Herpetario o Insectos)");
                        String recorrido = scanner.nextLine();
                        switch (recorrido.toLowerCase()) {
                            case "Mamíferos":
                                GuiaMamiferos guiaMamiferos = new GuiaMamiferos();
                                guiaMamiferos.ofrecerGuia();
                                break;
                            case "Aves":
                                GuiaAves guiaAves = new GuiaAves();
                                guiaAves.ofrecerGuia();
                                break;
                            case "Acuáticos":
                                GuiaAcuaticos guiaAcuaticos = new GuiaAcuaticos();
                                guiaAcuaticos.ofrecerGuia();
                                break;
                            case "Herpetario":
                                GuiaHerpetario guiaHerpetario = new GuiaHerpetario();
                                guiaHerpetario.ofrecerGuia();
                                break;
                            case "Insectos":
                                GuiaInsectos guiaInsectos = new GuiaInsectos();
                                guiaInsectos.ofrecerGuia();
                                break;
                            default:
                                System.out.println("Guía no reconocida.");
                                break;
                        }
                    } else {
                        System.out.println("Respuesta no reconocida.");
                    }
                    break;
                case "Mamíferos":
                    GuiaMamiferos guiaMamiferos = new GuiaMamiferos();
                    guiaMamiferos.ofrecerGuia();
                    break;
                case "Aves":
                    GuiaAves guiaAves = new GuiaAves();
                    guiaAves.ofrecerGuia();
                    break;
                case "Acuáticos":
                    GuiaAcuaticos guiaAcuaticos = new GuiaAcuaticos();
                    guiaAcuaticos.ofrecerGuia();
                    break;
                case "Herpetario":
                    GuiaHerpetario guiaHerpetario = new GuiaHerpetario();
                    guiaHerpetario.ofrecerGuia();
                    break;
                case "Insectos":
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