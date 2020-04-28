public class Cilindro{
	public Circulo base;
	private float altura;

	public Cilindro(float radio, float altura){
		this(0, 0, radio, altura);
	}
	
	public Cilindro(float x, float y, float radio, float altura){
		this(new Circulo(x, y, radio), altura);
	}

	public Cilindro(Circulo base, float altura){
		setBase(base);
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

	public void setBase(Circulo base){
		this.base = base;
	}

	public Circulo getBase(){
		return base;
	}

	public float diametro(){
		return base.diametro();
	}

	public float circunferencia(){
		return base.circunferencia();
	}

	public float area(){
		float area = 0;
		area = 2 * base.area() + base.circunferencia() * altura;
		return area;
	}

	public float volumen(){
		float volumen = 0;
		volumen = base.area() * altura;
		return volumen;
	}

	public String toString(){
		String str = "";
		str   = base.toString() + "\n";
		str += altura;
		return str;
	}

}
		