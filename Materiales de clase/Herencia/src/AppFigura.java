class AppFigura{
	public static void main(String args[]){
		Punto punto = new Punto(3,4);
		Circulo circulo = new Circulo(4,4,6);
		Cilindro cilindro = new Cilindro(2,2,3,4);

		System.out.println("Punto");
		System.out.println(punto.toString());

		System.out.println("\nCirculo");
		System.out.println(circulo.toString());
		System.out.println(circulo.diametro());
		System.out.println(circulo.circunferencia());
		System.out.println(circulo.area());

		System.out.println("\nCilindro");
		System.out.println(cilindro.toString());
		System.out.println(cilindro.diametro());
		System.out.println(cilindro.circunferencia());
		System.out.println(cilindro.area());
		System.out.println(cilindro.volumen());
			
		
	}
}