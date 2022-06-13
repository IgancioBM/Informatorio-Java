package Nivel1;
import java.util.*;
public class Ejer7 {
    public static void main(String [] args){
        System.out.print("Ingrese una palabra en minusculas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.next();
        scan.close();
        String mayus = palabra.toUpperCase();
        System.out.println(mayus);
    }
}
