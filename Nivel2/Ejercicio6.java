package Nivel2;
import java.util.*;
public class Ejercicio6 {
    public static void main(String [] args){
        Set<Dependiente> dependientes = new HashSet();
        Map<Integer, Integer> sueldos = new HashMap();

        dependientes.add(new Dependiente("Lautaro Buenmozo", 29139795, 6, 60));
        dependientes.add(new Dependiente("Tomas Guiso", 36242771, 9, 50));
        dependientes.add(new Dependiente("Jere Espindola", 12345678, 8, 55));
        extraerHorasYvalor(dependientes, sueldos);
    }

    public static void extraerHorasYvalor(Set<Dependiente> dependientes, Map<Integer, Integer> sueldos){
        for(Dependiente dependiente : dependientes){
            Integer salario = dependiente.horasTrabajadas * dependiente.valorXhora;
            sueldos.put((dependiente.dni), (salario));
            
        }
        for (Map.Entry<Integer, Integer> sueldo : sueldos.entrySet()){
            System.out.println("Empleado con DNI " + sueldo.getKey() + " recibe un sueldo de $" + sueldo.getValue());
        }
    }
}
