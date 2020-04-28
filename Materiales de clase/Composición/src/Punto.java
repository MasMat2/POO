public class Punto{
	private float x;
	private float y;

	public Punto(){
		this(0,0);
	}
	
	public Punto(float x, float y){
		setX(x);
		setY(y);
	}

	public void setX(float x){
		this.x = x;
	}
	
	public float getX(){
		return x;
	}

	public void setY(float y){
		this.y = y;
	}

	public float getY(){
		return y;
	}

	public float area(){
		return 0;
	}

	public float volumen(){
		return 0;
	}

	public String toString(){
		String str = "";
		str   = x + "\n";
		str += y;
		return str;
	}

}
		