package Nivel1;
import java.util.*;
public class Ejer6 {
    public static void main(String [] args){
        System.out.print("Ingrese un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        System.out.print("Ingrese la potencia entera a la que quiera elevar dicho numero: ");
        int expo = scan.nextInt();
        scan.close();
        int a = base;
        int x = 2;

        while (x <= expo){
            base = base * a;
            x++;
        }
        System.out.println(a + " elevado a la " + expo + " es igual a " + base);
    } 
}
