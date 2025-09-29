/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadigitosrecursiva;
import java.util.Scanner;

public class SumaDigitosRecursiva {
    public static int sumaDigitos(int n) {
        if (n == 0) return 0; // Caso base: cuando el número ya es 0
        return (n % 10) + sumaDigitos(n / 10); // Último dígito + recursión con el resto
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}


