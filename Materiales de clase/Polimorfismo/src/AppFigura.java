class AppFigura{
	public static void main(String args[]){
		Punto punto = new Punto(3,4);
		Circulo circulo = new Circulo(4,4,6);
		Cilindro cilindro = new Cilindro(2,2,3,4);

		Figura figura[] = new Figura[3];
		figura[0] = punto;
		figura[1] = circulo;
		figura[2] = cilindro;

		for(int pos = 0; pos<figura.length; pos++ ){
			System.out.println(figura[pos].toString());
			System.out.println("area: " + figura[pos].area());
			System.out.println("volumen: " + figura[pos].volumen());
			System.out.println();

			if(figura[pos] instanceof Punto){
				System.out.println("La figura[" + pos + "]Es una instancia de punto");
			}
			
			if(figura[pos] instanceof Circulo){
				System.out.println("La figura[" + pos + "]Es una instancia de circulo");
			}

			if(figura[pos] instanceof Cilindro){
				System.out.println("La figura[" + pos + "]Es una instancia de cilindro");
			}
		}
	}
}