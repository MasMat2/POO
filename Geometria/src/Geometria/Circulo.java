package geometria;

public class Circulo extends Figura{
    private float radio;

    public Circulo(){
        this.setRadio(1);
    }
    
    public Circulo(float radio){
        this.setRadio(radio);
    }

    public float calcularArea(){
        return (float)(Math.PI*Math.pow(this.radio,2));
    }
    
    public void setRadio(float radio){
        if(radio>0){
            this.radio = radio;
        }
    }
    
    public float getRadio(){
        return this.radio;
    }
}