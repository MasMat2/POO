public class Circulo extends Punto{
	private float radio;

	public Circulo(float radio){
		this(0, 0, radio);
	}
	
	public Circulo(float x, float y, float radio){
		super(x, y);
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
		str   = super.toString() + "\n";
		str += radio;
		return str;
	}

}
		