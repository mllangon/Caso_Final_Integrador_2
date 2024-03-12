import java.util.Scanner;

import Animales.Mamifero;
import Animales.Aves;
import Animales.Reptiles;
import Animales.Anfibios;
import Animales.Insectos;
import Animales.Peces;
import Visitantes.GuiaMamiferos;
import Visitantes.GuiaAves;
import Visitantes.GuiaHerpetario;
import Visitantes.GuiaInsectos;
import Visitantes.GuiaAcuaticos;
import Habitats.Hab_Terrestre;
import Habitats.Hab_Acuatico;
import Habitats.Hab_Aviario;
import Habitats.Hab_Herpetario;
import Habitats.Hab_Insectario;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        System.out.println("¿Eres staff o visitante?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("Staff")) {
            System.out.println("¿Deseas realizar seguimiento o seguridad?");
            String staffChoice = scanner.nextLine();

            if (staffChoice.equalsIgnoreCase("seguimiento")) {
                do {
                    System.out.println("Elige una opció para hacer el seguimiento:Recursos, Terrario, Acuático, Aciario, Herpetario, insectario o escriba salir para terminar.");
                    String habitatElegido = scanner.nextLine();

                    switch (habitatElegido.toLowerCase()) {
                        case "terrario":
                            System.out.println("Las zonas del terrario son: 1, 2, 3, 4, 5");
                            System.out.println("¿De qué zona quieres hacer el seguimiento?");
                            int zonaTerrario = scanner.nextInt();
                            switch (zonaTerrario) {
                                case 1:
                                    System.out.println("Las condiciones de la zona 1 son: " + Hab_Terrestre.ZONA_1.getTemperatura() + "°C, " + Hab_Terrestre.ZONA_1.getHumedad() + "% de humedad, y " + Hab_Terrestre.ZONA_1.isLimpieza() + " de limpieza.");
                                    break;
                                case 2:
                                    System.out.println("Las condiciones de la zona 2 son: " + Hab_Terrestre.ZONA_2.getTemperatura() + "°C, " + Hab_Terrestre.ZONA_2.getHumedad() + "% de humedad, y " + Hab_Terrestre.ZONA_2.isLimpieza() + " de limpieza.");
                                    break;
                                case 3:
                                    System.out.println("Las condiciones de la zona 3 son: " + Hab_Terrestre.ZONA_3.getTemperatura() + "°C, " + Hab_Terrestre.ZONA_3.getHumedad() + "% de humedad, y " + Hab_Terrestre.ZONA_3.isLimpieza() + " de limpieza.");
                                    break;
                                case 4:
                                    System.out.println("Las condiciones de la zona 4 son: " + Hab_Terrestre.ZONA_4.getTemperatura() + "°C, " + Hab_Terrestre.ZONA_4.getHumedad() + "% de humedad, y " + Hab_Terrestre.ZONA_4.isLimpieza() + " de limpieza.");
                                    break;
                                case 5:
                                    System.out.println("Las condiciones de la zona 5 son: " + Hab_Terrestre.ZONA_5.getTemperatura() + "°C, " + Hab_Terrestre.ZONA_5.getHumedad() + "% de humedad, y " + Hab_Terrestre.ZONA_5.isLimpieza() + " de limpieza.");
                                    break;
                                default:
                                    System.out.println("Zona no reconocida, elije otra opción.");
                                    break;
                            }
                            break;
                        case "aviario":
                            System.out.println("Las zonas del aviario son: 1, 2, 3, 4");
                            System.out.println("¿De qué zona quieres hacer el seguimiento?");
                            int zonaAviario = scanner.nextInt();
                            switch (zonaAviario) {
                                case 1:
                                    System.out.println("Las condiciones de la zona 1 son: " + Hab_Aviario.ZONA_1.getTemperatura() + "°C, " + Hab_Aviario.ZONA_1.getHumedad() + "% de humedad, y " + Hab_Aviario.ZONA_1.isLimpieza() + " de limpieza.");
                                    break;
                                case 2:
                                    System.out.println("Las condiciones de la zona 2 son: " + Hab_Aviario.ZONA_2.getTemperatura() + "°C, " + Hab_Aviario.ZONA_2.getHumedad() + "% de humedad, y " + Hab_Aviario.ZONA_2.isLimpieza() + " de limpieza.");
                                    break;
                                case 3:
                                    System.out.println("Las condiciones de la zona 3 son: " + Hab_Aviario.ZONA_3.getTemperatura() + "°C, " + Hab_Aviario.ZONA_3.getHumedad() + "% de humedad, y " + Hab_Aviario.ZONA_3.isLimpieza() + " de limpieza.");
                                    break;
                                case 4:
                                    System.out.println("Las condiciones de la zona 4 son: " + Hab_Aviario.ZONA_4.getTemperatura() + "°C, " + Hab_Aviario.ZONA_4.getHumedad() + "% de humedad, y " + Hab_Aviario.ZONA_4.isLimpieza() + " de limpieza.");
                                    break;
                                default:
                                    System.out.println("Zona no reconocida, elije otra opción.");
                                    break;
                            }
                            break;
                        case "acuático":
                            System.out.println("Las zonas del acuático son: 1, 2, 3, 4, 5, 6");
                            System.out.println("¿De qué zona quieres hacer el seguimiento?");
                            int zonaAcuatico = scanner.nextInt();
                            switch (zonaAcuatico) {
                                case 1:
                                    System.out.println("Las condiciones de la zona 1 son: " + Hab_Acuatico.ZONA_1.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_1.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_1.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_1.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_1.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_1.getProfundidad() + " de profundidad.");
                                    break;
                                case 2:
                                    System.out.println("Las condiciones de la zona 2 son: " + Hab_Acuatico.ZONA_2.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_2.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_2.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_2.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_2.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_2.getProfundidad() + " de profundidad.");
                                    break;
                                case 3:
                                    System.out.println("Las condiciones de la zona 3 son: " + Hab_Acuatico.ZONA_3.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_3.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_3.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_3.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_3.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_3.getProfundidad() + " de profundidad.");
                                    break;
                                case 4:
                                    System.out.println("Las condiciones de la zona 4 son: " + Hab_Acuatico.ZONA_4.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_4.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_4.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_4.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_4.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_4.getProfundidad() + " de profundidad.");
                                    break;
                                case 5:
                                    System.out.println("Las condiciones de la zona 5 son: " + Hab_Acuatico.ZONA_5.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_5.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_5.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_5.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_5.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_5.getProfundidad() + " de profundidad.");
                                    break;
                                case 6:
                                    System.out.println("Las condiciones de la zona 6 son: " + Hab_Acuatico.ZONA_6.getTemperatura() + "°C, " + Hab_Acuatico.ZONA_6.getHumedad() + "% de humedad, " + Hab_Acuatico.ZONA_6.isLimpieza() + " de limpieza, " + Hab_Acuatico.ZONA_6.getNivelAgua() + " de nivel de agua, " + Hab_Acuatico.ZONA_6.getSalinidad() + " de salinidad, y " + Hab_Acuatico.ZONA_6.getProfundidad() + " de profundidad.");
                                    break;
                                default:
                                    System.out.println("Zona no reconocida, elije otra opción.");
                                    break;
                            }
                            break;
                        case "herpetario":
                            System.out.println("Las zonas del herpetario son: 1, 2, 3, 4, 5, 6, 7");
                            System.out.println("¿De qué zona quieres hacer el seguimiento?");
                            int zonaHerpetario = scanner.nextInt();
                            switch (zonaHerpetario) {
                                case 1:
                                    System.out.println("Las condiciones de la zona 1 son: " + Hab_Herpetario.ZONA_1.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_1.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_1.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_1.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_1.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 2:
                                    System.out.println("Las condiciones de la zona 2 son: " + Hab_Herpetario.ZONA_2.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_2.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_2.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_2.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_2.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 3:
                                    System.out.println("Las condiciones de la zona 3 son: " + Hab_Herpetario.ZONA_3.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_3.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_3.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_3.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_3.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 4:
                                    System.out.println("Las condiciones de la zona 4 son: " + Hab_Herpetario.ZONA_4.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_4.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_4.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_4.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_4.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 5:
                                    System.out.println("Las condiciones de la zona 5 son: " + Hab_Herpetario.ZONA_5.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_5.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_5.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_5.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_5.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 6:
                                    System.out.println("Las condiciones de la zona 6 son: " + Hab_Herpetario.ZONA_6.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_6.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_6.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_6.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_6.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                case 7:
                                    System.out.println("Las condiciones de la zona 7 son: " + Hab_Herpetario.ZONA_7.getTemperatura() + "°C, " + Hab_Herpetario.ZONA_7.getHumedad() + "% de humedad, " + Hab_Herpetario.ZONA_7.isLimpieza() + " de limpieza, " + Hab_Herpetario.ZONA_7.getNivelUVB() + " de nivel UVB, y " + Hab_Herpetario.ZONA_7.getTipoSuelo() + " de tipo de suelo.");
                                    break;
                                default:
                                    System.out.println("Zona no reconocida, elije otra opción.");
                                    break;
                            }
                            break;
                        case "insectario":
                            System.out.println("Las zonas del insectario son: 1, 2, 3, 4, 5");
                            System.out.println("¿De qué zona quieres hacer el seguimiento?");
                            int zonaInsectario = scanner.nextInt();
                            switch (zonaInsectario) {
                                case 1:
                                    System.out.println("Las condiciones de la zona 1 son: " + Hab_Insectario.ZONA_1.getTemperatura() + "°C, " + Hab_Insectario.ZONA_1.getHumedad() + "% de humedad, " + Hab_Insectario.ZONA_1.isLimpieza() + " de limpieza, " + Hab_Insectario.ZONA_1.getNivelTierra() + " de nivel de tierra, " + Hab_Insectario.ZONA_1.getHumedadTierra() + " de humedad de tierra, y " + Hab_Insectario.ZONA_1.getProfundidadTierra() + " de profundidad de tierra.");
                                    break;
                                case 2:
                                    System.out.println("Las condiciones de la zona 2 son: " + Hab_Insectario.ZONA_2.getTemperatura() + "°C, " + Hab_Insectario.ZONA_2.getHumedad() + "% de humedad, " + Hab_Insectario.ZONA_2.isLimpieza() + " de limpieza, " + Hab_Insectario.ZONA_2.getNivelTierra() + " de nivel de tierra, " + Hab_Insectario.ZONA_2.getHumedadTierra() + " de humedad de tierra, y " + Hab_Insectario.ZONA_2.getProfundidadTierra() + " de profundidad de tierra.");
                                    break;
                                case 3:
                                    System.out.println("Las condiciones de la zona 3 son: " + Hab_Insectario.ZONA_3.getTemperatura() + "°C, " + Hab_Insectario.ZONA_3.getHumedad() + "% de humedad, " + Hab_Insectario.ZONA_3.isLimpieza() + " de limpieza, " + Hab_Insectario.ZONA_3.getNivelTierra() + " de nivel de tierra, " + Hab_Insectario.ZONA_3.getHumedadTierra() + " de humedad de tierra, y " + Hab_Insectario.ZONA_3.getProfundidadTierra() + " de profundidad de tierra.");
                                    break;
                                case 4:
                                    System.out.println("Las condiciones de la zona 4 son: " + Hab_Insectario.ZONA_4.getTemperatura() + "°C, " + Hab_Insectario.ZONA_4.getHumedad() + "% de humedad, " + Hab_Insectario.ZONA_4.isLimpieza() + " de limpieza, " + Hab_Insectario.ZONA_4.getNivelTierra() + " de nivel de tierra, " + Hab_Insectario.ZONA_4.getHumedadTierra() + " de humedad de tierra, y " + Hab_Insectario.ZONA_4.getProfundidadTierra() + " de profundidad de tierra.");
                                    break;
                                case 5:
                                    System.out.println("Las condiciones de la zona 5 son: " + Hab_Insectario.ZONA_5.getTemperatura() + "°C, " + Hab_Insectario.ZONA_5.getHumedad() + "% de humedad, " + Hab_Insectario.ZONA_5.isLimpieza() + " de limpieza, " + Hab_Insectario.ZONA_5.getNivelTierra() + " de nivel de tierra, " + Hab_Insectario.ZONA_5.getHumedadTierra() + " de humedad de tierra, y " + Hab_Insectario.ZONA_5.getProfundidadTierra() + " de profundidad de tierra.");
                                    break;
                                default:
                                    System.out.println("Zona no reconocida, elije otra opción.");
                                    break;
                            }
                            break;
                        case "recursos":


                        case "salir":
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Hábitat no reconocido, elije otra opción.");
                            break;
                    }
                    System.out.println("¿Quieres hacer seguimiento de otro hábitat? (si/no)");
                    continuar = scanner.nextLine();
                } while (continuar.equalsIgnoreCase("si"));
            } else if (staffChoice.equalsIgnoreCase("seguridad")) {

                // Por ejemplo:
                // System.out.println("Estado del león: " + Mamifero.LEON.getEstado());
                // System.out.println("Condiciones del hábitat del león: " + Habitat.LEON.getCondiciones());
                // Repite esto para cada animal y hábitat
            } else if (staffChoice.equalsIgnoreCase("mantenimiento")) {
                // Aquí necesitarás llamar a los métodos que realizan tareas de mantenimiento
                // Por ejemplo:
                // Mamifero.LEON.realizarMantenimiento();
                // Repite esto para cada animal
            } else {
                System.out.println("Opción no reconocida.");
            }
        } else if (userType.equalsIgnoreCase("Visitante")) {
            do {
                System.out.println("Elige un guía: mamíferos, aves, acuáticos, herpetario, insectos, o escribe 'salir' para terminar.");
                String guiaElegida = scanner.nextLine();

                switch (guiaElegida.toLowerCase()) {
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
                        switch (ave.toLowerCase()) {
                            case "águilas":
                                System.out.println("¡Vamos a ver a las águilas! Están en la zona 1, ahí les podéis ver.");
                                Aves.AGUILA_M.moverse();
                                Aves.AGUILA_H.comer();
                                Aves.AGUILA_M.comportarse();
                                Aves.AGUILA_H.comportarse();
                                Aves.AGUILA_M.tipoPlumas();
                                Aves.AGUILA_H.tipoPlumas();
                                break;
                            case "pavos reales":
                                System.out.println("¡Vamos a ver a los pavos reales! Están en la zona 2, ahí les podéis ver.");
                                Aves.PAVO_REAL_M.comer();
                                Aves.PAVO_REAL_H.dormir();
                                Aves.PAVO_REAL_M.comportarse();
                                Aves.PAVO_REAL_H.comportarse();
                                Aves.PAVO_REAL_M.tipoPlumas();
                                Aves.PAVO_REAL_H.tipoPlumas();
                                break;
                            case "flamencos":
                                System.out.println("¡Vamos a ver a los flamencos! Están en la zona 3, ahí les podéis ver.");
                                Aves.FLAMENCO_M.moverse();
                                Aves.FLAMENCO_H.moverse();
                                Aves.FLAMENCO_M.comportarse();
                                Aves.FLAMENCO_H.comportarse();
                                Aves.FLAMENCO_M.tipoPlumas();
                                Aves.FLAMENCO_H.tipoPlumas();
                                break;
                            case "halcones":
                                System.out.println("¡Vamos a ver a los halcones! Están en la zona 4, ahí les podéis ver.");
                                Aves.HALCON.moverse();
                                Aves.HALCON.comportarse();
                                Aves.HALCON.tipoPlumas();
                                break;
                            default:
                                System.out.println("Ave no reconocida, elije otra opción.");
                                break;
                        }
                        break;
                    case "acuáticos":
                        GuiaAcuaticos guiaAcuaticos = new GuiaAcuaticos();
                        guiaAcuaticos.ofrecerGuia();
                        System.out.println("En ese caso iremos al edificio 3, donde se encuentran los acuáticos. ¿Qué acuático querrías ver? (Tiburón, Pez payaso, Pez globo, Pez cirujano, Pez mandarín, Delfín)");
                        String acuatico = scanner.nextLine();
                        switch (acuatico.toLowerCase()) {
                            case "tiburón":
                                System.out.println("¡Vamos a ver al tiburón! Está en la zona 1, ahí le podéis ver.");
                                Peces.TIBURON.comer();
                                Peces.TIBURON.comportarse();
                                break;
                            case "pez payaso":
                                System.out.println("¡Vamos a ver al pez payaso! Está en la zona 2, ahí le podéis ver.");
                                Peces.PEZ_PAYASO.moverse();
                                Peces.PEZ_PAYASO.comportarse();
                                break;
                            case "pez globo":
                                System.out.println("¡Vamos a ver al pez globo! Está en la zona 3, ahí le podéis ver.");
                                Peces.PEZ_GLOBO.moverse();
                                Peces.PEZ_GLOBO.comportarse();
                                break;
                            case "pez cirujano":
                                System.out.println("¡Vamos a ver al pez cirujano! Está en la zona 4, ahí le podéis ver.");
                                Peces.PEZ_CIRUJANO.comer();
                                Peces.PEZ_CIRUJANO.comportarse();
                                break;
                            case "pez mandarín":
                                System.out.println("¡Vamos a ver al pez mandarín! Está en la zona 5, ahí le podéis ver.");
                                Peces.PEZ_MANDARIN.dormir();
                                Peces.PEZ_MANDARIN.comportarse();
                                break;
                            case "delfín":
                                System.out.println("¡Vamos a ver al delfín! Está en la zona 6, ahí le podéis ver.");
                                Peces.DELFIN.moverse();
                                Peces.DELFIN.comportarse();
                                break;
                            default:
                                System.out.println("Animal no reconocido, elije otra opción.");
                                break;
                        }
                        break;
                    case "herpetario":
                        GuiaHerpetario guiaHerpetario = new GuiaHerpetario();
                        guiaHerpetario.ofrecerGuia();
                        System.out.println("En ese caso iremos al edificio 4, donde se encuentran los reptiles y anfibios. ¿Qué animal querrías ver? (Serpientes, Cocodrilos, Ranas, Salamandras, Tritones, Tortugas o Camaleones)");
                        String herpetario = scanner.nextLine();
                        switch (herpetario.toLowerCase()) {
                            case "serpientes":
                                System.out.println("¡Vamos a ver a las serpientes! Están en la zona 1, ahí les podéis ver.");
                                Reptiles.SERPIENTE.moverse();
                                Reptiles.SERPIENTE.comportarse();
                                break;
                            case "cocodrilos":
                                System.out.println("¡Vamos a ver a los cocodrilos! Están en la zona 2, ahí les podéis ver.");
                                Reptiles.COCODRILO.comer();
                                Reptiles.COCODRILO.comportarse();
                                break;
                            case "ranas":
                                System.out.println("¡Vamos a ver a las ranas! Están en la zona 3, ahí les podéis ver.");
                                Anfibios.RANA.moverse();
                                Anfibios.RANA.comportarse();
                                break;
                            case "salamandras":
                                System.out.println("¡Vamos a ver a las salamandras! Están en la zona 4, ahí les podéis ver.");
                                Anfibios.SALAMANDRA.comer();
                                Anfibios.SALAMANDRA.comportarse();
                                break;
                            case "tritones":
                                System.out.println("¡Vamos a ver a los tritones! Están en la zona 5, ahí les podéis ver.");
                                Anfibios.TRITON.moverse();
                                Anfibios.TRITON.comportarse();
                                break;
                            case "tortugas":
                                System.out.println("¡Vamos a ver a las tortugas! Están en la zona 6, ahí les podéis ver.");
                                Reptiles.TORTUGA_M.comer();
                                Reptiles.TORTUGA_H.dormir();
                                Reptiles.TORTUGA_M.comportarse();
                                Reptiles.TORTUGA_H.comportarse();
                                break;
                            case "camaleones":
                                System.out.println("¡Vamos a ver a los camaleones! Están en la zona 7, ahí les podéis ver.");
                                Reptiles.CAMALEON.moverse();
                                Reptiles.CAMALEON.comportarse();
                                break;
                            default:
                                System.out.println("Animal no reconocido, elije otra opción.");
                                break;
                        }
                        break;
                    case "insectos":
                        GuiaInsectos guiaInsectos = new GuiaInsectos();
                        guiaInsectos.ofrecerGuia();
                        System.out.println("En ese caso iremos al edificio 5, donde se encuentran los insectos. ¿Qué insecto querrías ver? (Viuda negra, Mariposa rosa, Mariposa azul, Escarabajo, Hormiga bala)");
                        String insecto = scanner.nextLine();
                        switch (insecto.toLowerCase()) {
                            case "viuda negra":
                                System.out.println("¡Vamos a ver a la viuda negra! Está en la zona 1, ahí la podéis ver.");
                                Insectos.VIUDA_NEGRA.comer();
                                Insectos.VIUDA_NEGRA.comportarse();
                                break;
                            case "mariposa rosa":
                                System.out.println("¡Vamos a ver a la mariposa rosa! Está en la zona 2, ahí la podéis ver.");
                                Insectos.MARIPOSA_R.dormir();
                                Insectos.MARIPOSA_R.comportarse();
                                break;
                            case "mariposa azul":
                                System.out.println("¡Vamos a ver a la mariposa azul! Está en la zona 3, ahí la podéis ver.");
                                Insectos.MARIPOSA_A.moverse();
                                Insectos.MARIPOSA_A.comportarse();
                                break;
                            case "escarabajo":
                                System.out.println("¡Vamos a ver al escarabajo! Está en la zona 4, ahí le podéis ver.");
                                Insectos.ESCARABAJO.moverse();
                                Insectos.ESCARABAJO.comportarse();
                                break;
                            case "hormiga bala":
                                System.out.println("¡Vamos a ver a la hormiga bala! Está en la zona 5, ahí la podéis ver.");
                                Insectos.HORMIGA_B.comer();
                                Insectos.HORMIGA_B.comportarse();
                                break;
                            default:
                                System.out.println("Insecto no reconocido, elije otra opción.");
                                break;
                            }
                            break;
                    case "salir":
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Guía no reconocida.");
                        break;
                }
                System.out.println("¿Deseas ver otro animal o cambiar de especie? (si/no)");
                continuar = scanner.nextLine().toLowerCase();
            } while (continuar.equals("si"));

            scanner.close();
        }
    }
    }