package geometria;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado() {
        this.setLado(1);
    }

    public Cuadrado(float lado) {
        this.setLado(lado);
    }

    @Override
    public float calcularArea() {
        return (float) Math.pow(this.lado, 2);
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public float getLado() {
        return this.lado;
    }
}