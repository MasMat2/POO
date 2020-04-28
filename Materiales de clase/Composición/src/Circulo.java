public class Circulo{
	public Punto centro;
	private float radio;

	public Circulo(float radio){
		this(0,0, radio);
	}
	
	public Circulo(float x, float y, float radio){
		this(new Punto(x,y), radio);
	}

	public Circulo(Punto centro, float radio){
		setCentro(centro);
		setRadio(radio);
	}
	
	public void setRadio(float radio){	
		if(radio>0){
			this.radio = radio;
		}
	}
	
	public float getRadio(){
		return radio;
	}
	
	public void setCentro(Punto centro){
		this.centro = centro;
	}

	public Punto getCentro(){
		return centro;
	}

	public float diametro(){
		float diametro = 0;
		diametro = radio * 2;
		return diametro;
	}

	public float circunferencia(){
		float circunferencia = 0;
		circunferencia = (float)(Math.PI) * diametro();
		return circunferencia;
	}

	public float area(){
		float area = 0;
		area = (float)(Math.PI) * (float)(Math.pow(radio,2));
		return area;
	}

	public String toString(){
		String str = "";
		str   = centro.toString() + "\n";
		str += radio;
		return str;
	}

}
		