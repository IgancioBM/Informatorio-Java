package Nivel1;
import java.util.*;
public class Ejer4 {
    public static void main(String [] args) {
        System.out.print("Ingrese a continuación un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int factorial = 1;
        int m = num;

        while(num != 0){
            factorial = factorial * num;
            num--;
        }
        System.out.println("El factorial de " + m + " es: " + factorial);
    }
}
