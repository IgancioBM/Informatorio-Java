package Nivel1;
import java.util.*;
public class Ejer5 {
    public static void main(String [] args){
        System.out.print("Ingrese un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int num2 = scan.nextInt();
        scan.close();
        int producto = 0;
        int x = 1;

        while (x <= num2){
            producto = producto + num1;
            x++;
        }
        System.out.println(num1 + " * " + num2 + " = " + producto);
    } 
}
