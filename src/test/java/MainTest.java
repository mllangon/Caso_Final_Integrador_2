import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ByteArrayInputStream testIn;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    public void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(System.in);
    }

    @Test
    public void testUserTypeStaffSeguimiento() {
        System.out.println("Testeando el tipo de usuario Staff y el seguimiento de la zona 1");

        String input = "Staff\nseguimiento\nterrario\n1\nno\n";
        provideInput(input);

        Main.main(null);

        assertTrue(outContent.toString().contains("¿Deseas realizar seguimiento o seguridad?"));
        assertTrue(outContent.toString().contains("Elige una opció para hacer el seguimiento"));
        assertTrue(outContent.toString().contains("Las condiciones de la zona 1 son:"));
    }

    @Test
    public void testGuiaHastaLeones() {
        System.out.println("Testeando el guía de mamíferos hasta llegar a los leones");

        String input = "Visitante\nmamíferos\nleones\nno\n";
        provideInput(input);

        Main.main(null);

        assertTrue(outContent.toString().contains("Elige un guía: mamíferos, aves, acuáticos, herpetario, insectos"));
        assertTrue(outContent.toString().contains("¡Vamos a ver a los leones!"));
        assertTrue(outContent.toString().contains("¿Deseas ver otro animal o cambiar de especie?"));
    }

}
