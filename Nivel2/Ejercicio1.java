package Nivel2;
import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String [] args){
        ArrayList<Localidad> ciudadesFav = new ArrayList<>();
        ciudadesFav.add(new Localidad("Carlos Paz"));
        ciudadesFav.add(new Localidad("Tilcara"));
        ciudadesFav.add(new Localidad("Resistencia"));
        int j = 1;
        for (int i = 0; i < ciudadesFav.size(); i++){
            System.out.println("#" + j + " - " + ciudadesFav.get(i));
            j++;
        }
    }
}
