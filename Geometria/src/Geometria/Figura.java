package geometria;

public class Figura {
    private String nombre;

    public float calcularArea() {
        return 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String toString() {
        String str = "";
        str += "nombre: " + this.nombre + "\n";
        return str;
    }

}