package Nivel1;
import java.util.*;
import java.io.IOException;
public class Ejer9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String texto;
        char caracter = 'a';
        int numeroDeVeces = 0;
        do {
            System.out.print("Introduce texto: ");
            texto = scan.nextLine();
        } while (texto.isEmpty());
        numeroDeVeces = contarLetras(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");  
        scan.close();
    }
    public static int contarLetras(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;           
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}
