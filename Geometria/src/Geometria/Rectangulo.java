package geometria;

public class Rectangulo extends Figura {
    private float base;
    private float altura;

    public Rectangulo() {
        this.setBase(1);
        this.setAltura(1);
    }

    public Rectangulo(float base) {
        this.setBase(base);
        this.setAltura(1);
    }

    public Rectangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    @Override
    public float calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();
        str += "base: " + this.base + "\n";
        str += "altura: " + this.altura + "\n";
        return str;
    }

    public void setBase(float base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public float getBase() {
        return this.base;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public float getAltura() {
        return this.altura;
    }
}