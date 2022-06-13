package Nivel1;

import java.util.*;

public class Ejer1 {
    public static void main(String [] args) {
        System.out.println("A continuación ingrese su nombre de usuario:");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        scan.close();

        System.out.println("Hola " + nombre + "!!!");
    }
}