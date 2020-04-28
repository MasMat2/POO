package geometria;

import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {
        int op;
        float var1, var2;
        // Usaremos polimorfismo para referenciar el objeto que el usuario escogio
        // mediante el objeto padre de tipo Figura
        Figura fig = new Figura();
        // Inicializar Scanner para recibir la entrada del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una figura:\n1.- Triangulo\n2.- Cuadrado\n3.- Rectangulo\n4.- Circulo");
        // Ciclo que repite la pregunta hasta que el numero ingresado este en el rango
        // correcto
        do {
            System.out.print("Opcion: ");
            op = sc.nextInt();
        } while (op < 1 || op > 4);
        System.out.println();
        // Preguntar por los datos de la figura en base a la figura escogida
        switch (op) {
            case 1:
                System.out.print("Ingresa la base del triangulo: ");
                var1 = sc.nextFloat();
                System.out.print("Ingresa la altura del triangulo ");
                var2 = sc.nextFloat();
                fig = new Triangulo(var1, var2);
                break;
            case 2:
                System.out.print("Ingresa la longitud del lado del cuadrado: ");
                var1 = sc.nextFloat();
                fig = new Cuadrado(var1);
                break;
            case 3:
                System.out.print("Ingresa la base del rectangulo: ");
                var1 = sc.nextFloat();
                System.out.print("Ingresa la alura del rectangulo: ");
                var2 = sc.nextFloat();
                fig = new Rectangulo(var1, var2);
                break;
            case 4:
                System.out.print("Ingresa el radio del circulo ");
                var1 = sc.nextFloat();
                fig = new Circulo(var1);
                break;
        }
        System.out.println("Ingresa el nombre de la figura: ");
        sc.nextLine();
        fig.setNombre(sc.nextLine());
        System.out.println(
                String.format("\nLa figura con nombre %s tiene un area de %.2f", fig.getNombre(), fig.calcularArea()));
    }
}