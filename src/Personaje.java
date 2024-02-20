
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
    Objeto[] objetos;
    Dinero efectivo;
    Dinero camaraGringotts;
    int procesoAnimago;
    boolean esMagoOscuro;

    public Personaje(String nombre, Objeto[] objetos) {
        this.nombre = nombre;
        this.objetos = objetos;
    }

    private void aprenderHechizo(int idHechizo) {
        Hechizo hechizo = new Hechizo(idHechizo);
        hechizos = Arrays.copyOf(hechizos, hechizos.length + 1);
        hechizos[hechizos.length - 1] = hechizo;
    }
    private void intercambiarObjeto(Objeto objeto, int cantidad, Personaje personaje) {
        objeto.disminuirCantidad(cantidad);
        personaje.aumentarCantidadObjeto(objeto, cantidad);
    }

    private void aumentarCantidadObjeto(Objeto objeto, int cantidad) {
        boolean existe = false;
        for (Objeto value : objetos) {
            if (objeto.equals(value)) {
                value.aumentarCantidad(cantidad);
                existe = true;
            }
        }
        if (!existe) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            objetos[objetos.length - 1] = objeto;
            objeto.aumentarCantidad(cantidad);
        }
    }

}
