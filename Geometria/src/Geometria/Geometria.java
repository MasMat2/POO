package geometria;

import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {
        int op;
        float var1, var2;
        Figura fig = new Figura();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una figura:\n1.- Triangulo\n2.- Cuadrado\n3.- Rectangulo\n4.- Circulo");
        do {
            System.out.print("Opcion: ");
            op = sc.nextInt();
        } while (op < 1 || op > 4);
        System.out.println();
        switch (op) {
            case 1:
                System.out.print("Ingresa la base del triangulo: ");
                var1 = sc.nextInt();
                System.out.print("Ingresa la altura del triangulo ");
                var2 = sc.nextInt();
                fig = new Triangulo(var1, var2);
                break;
            case 2:
                System.out.print("Ingresa la longitud del lado del cuadrado: ");
                var1 = sc.nextInt();
                fig = new Cuadrado(var1);
                break;
            case 3:
                System.out.print("Ingresa la base del rectangulo: ");
                var1 = sc.nextInt();
                System.out.print("Ingresa la alura del rectangulo: ");
                var2 = sc.nextInt();
                fig = new Rectangulo(var1, var2);
                break;
            case 4:
                System.out.print("Ingresa el radio del circulo ");
                var1 = sc.nextInt();
                fig = new Circulo(var1);
                break;
        }
        System.out.println("Ingresa el nombre de la figura: ");
        fig.setNombre(sc.nextLine());
        System.out.println(
                String.format("\nLa figura con nombre %s tiene un area de %.2f", fig.getNombre(), fig.calcularArea()));
    }
}