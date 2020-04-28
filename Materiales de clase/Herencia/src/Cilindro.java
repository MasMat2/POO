public class Cilindro extends Circulo{
	private float altura;

	public Cilindro(float radio, float altura){
		this(0, 0, radio, altura);
	}
	
	public Cilindro(float x, float y, float radio, float altura){
		super(x, y, radio);
		setAltura(altura);
	}

	public void setAltura(float altura){	
		if(altura>0){
			this.altura = altura;
		}
	}
	
	public float getAltura(){
		return altura;
	}

	public float area(){
		float area = 0;
		area = 2 * super.area() + circunferencia() * altura;
		return area;
	}

	public float volumen(){
		float volumen = 0;
		volumen = super.area() * altura;
		return volumen;
	}

	public String toString(){
		String str = "";
		str   = super.toString() + "\n";
		str += altura;
		return str;
	}

}
		