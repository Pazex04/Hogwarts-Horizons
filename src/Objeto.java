public abstract class Objeto {
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    public int cantidad;

    protected void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
    protected void disminuirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            Objeto objeto = (Objeto) obj;
            return objeto.id == this.id;
        }else {
            return false;
        }
    }
}
