
import java.time.LocalDate;
import java.util.Arrays;

public class Personaje {
    String nombre;
    String apellido;
    String Casa;
    String Patronus;
    String ascendencia;
    LocalDate fechaNacimiento;
    int anhoCurso;
    Varita varita;
    Hechizo[] hechizos;
    Dinero dinero;

    void aprenderHechizo(int idHechizo) {
        Hechizo hechizo = new Hechizo(idHechizo);
        hechizos = Arrays.copyOf(hechizos, hechizos.length + 1);
        hechizos[hechizos.length - 1] = hechizo;
    }


}
