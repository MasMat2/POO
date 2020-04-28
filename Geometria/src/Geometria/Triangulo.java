package geometria;

public class Triangulo extends Rectangulo {
    public Triangulo() {
        super();
    }

    public Triangulo(float base) {
        super(base);
    }

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return this.getBase() * this.getAltura() / 2;
    }
}