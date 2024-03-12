import java.util.Scanner;

import Animales.Mamifero;
import Animales.Aves;
import Animales.Reptiles;
import Animales.Anfibios;
import Animales.Insectos;
import Animales.Peces;
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
            System.out.println("Elige un guía: niños, mamíferos, aves, acuáticos, herpetario o insectos.");
            String guiaElegida = scanner.nextLine();

            switch (guiaElegida.toLowerCase()) {
                case "niños":
                    GuiaNiños guiaNiños = new GuiaNiños();
                    guiaNiños.ofrecerGuia();
                    System.out.println("¿Quieres un recorrido especial por tu cumpleaños? (Sí/No)");
                    String cumpleaños = scanner.nextLine();
                    if (cumpleaños.equalsIgnoreCase("Sí")) {
                        System.out.println("¡Felicidades! Te llevaremos a un recorrido especial por tu cumpleaños, Empezaremos por los Mamíferos y recorreremos todo el zoológico hasta llegar a los Insectos. ¡Disfruta tu día!");
                    } else if (cumpleaños.equalsIgnoreCase("No")) {
                        System.out.println("¡Disfruta tu recorrido!");
                    } else {
                        System.out.println("Respuesta no reconocida.");
                    }
                case "mamíferos":
                    GuiaMamiferos guiaMamiferos = new GuiaMamiferos();
                    guiaMamiferos.ofrecerGuia();
                    System.out.println("En ese caso iremos al edificio 1, donde se encuentran los mamíferos. ¿Qué mamífero querrías ver? (Leones, Tigres, Osos, Chimpancés, Jirafas)");
                    String mamifero = scanner.nextLine();
                    switch (mamifero.toLowerCase()) {
                        case "leones":
                            System.out.println("¡Vamos a ver a los leones! Están en la zona 1, ahí les podéis ver.");
                            Mamifero.LEON_H.comer();
                            Mamifero.LEON_M.moverse();
                            Mamifero.LEON_M.comportarse();
                            Mamifero.LEON_H.comportarse();
                            Mamifero.LEON_M.tipoPelaje();
                            Mamifero.LEON_H.tipoPelaje();
                            break;
                        case "tigres":
                            System.out.println("¡Vamos a ver a los tigres! Están en la zona 2, ahí les podéis ver.");
                            Mamifero.TIGRE_M.comer();
                            Mamifero.TIGRE_H.dormir();
                            Mamifero.TIGRE_M.comportarse();
                            Mamifero.TIGRE_H.comportarse();
                            Mamifero.TIGRE_M.tipoPelaje();
                            Mamifero.TIGRE_H.tipoPelaje();
                            break;
                        case "osos":
                            System.out.println("¡Vamos a ver a los osos! Están en la zona 3, ahí les podéis ver.");
                            Mamifero.OSO.comer();
                            Mamifero.OSO.comportarse();
                            Mamifero.OSO.tipoPelaje();
                            break;
                        case "chimpancés":
                            System.out.println("¡Vamos a ver a los chimpancés! Están en la zona 4, ahí les podéis ver.");
                            Mamifero.CHIMPANCE_H.dormir();
                            Mamifero.CHIMPANCE_P.moverse();
                            Mamifero.CHIMPANCE_P.comportarse();
                            Mamifero.CHIMPANCE_H.comportarse();
                            Mamifero.CHIMPANCE_P.tipoPelaje();
                            Mamifero.CHIMPANCE_H.tipoPelaje();
                            break;
                        case "jirafas":
                            System.out.println("¡Vamos a ver a las jirafas! Están en la zona 5, ahí les podéis ver.");
                            Mamifero.JIRAFA_M.comer();
                            Mamifero.JIRAFA_H.moverse();
                            Mamifero.JIRAFA_H.comportarse();
                            Mamifero.JIRAFA_M.comportarse();
                            Mamifero.JIRAFA_H.tipoPelaje();
                            Mamifero.JIRAFA_M.tipoPelaje();
                            break;
                        default:
                            System.out.println("Mamífero no reconocido, elije otra opción.");
                            break;
                    }
                    break;
                case "aves":
                    GuiaAves guiaAves = new GuiaAves();
                    guiaAves.ofrecerGuia();
                    System.out.println("En ese caso iremos al edificio 2, donde se encuentran las aves. ¿Qué ave querrías ver? (Águilas, Pavos Reales, Flamencoso Halcones)");
                    String ave = scanner.nextLine();
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