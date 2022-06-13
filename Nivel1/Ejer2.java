package Nivel1;
import java.util.Scanner;
public class Ejer2 {
    public static void main(String [] args) {
        System.out.println("A continuación ingrese dos numeros enteros (uno por linea):");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.close();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multi = n1 * n2;
        int div = n1 / n2;
        int resto = n1 % n2;

        System.out.println(n1 + " + " + n2 + " = " + suma);
        System.out.println(n1 + " - " + n2 + " = " + resta);
        System.out.println(n1 + " * " + n2 + " = " + multi);
        System.out.println(n1 + " / " + n2 + " = " + div);
        System.out.println("El resto de la division entre " + n1 + " y " + n2 + " es: " + resto );
    }
}

