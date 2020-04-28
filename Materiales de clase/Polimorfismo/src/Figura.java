abstract class Figura{
	private String nombre;

	abstract public float area();
	abstract public float volumen();

	public String toString(){
		String str = "";
		str   = super.toString() + "\n";
		str  += nombre + "\n";
		return str;
	}

}
		