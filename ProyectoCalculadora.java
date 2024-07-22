package proyecto;

import java.util.Scanner;

public class ProyectoCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        // Solicitar 2 números enteros
        System.out.print("Ingresa el primer numero entero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo numero entero: ");
        double numero2 = entrada.nextDouble();

        // Realizar operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        // Mostrar resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);

        entrada.close();// Cerrar Scanner
    }
}
