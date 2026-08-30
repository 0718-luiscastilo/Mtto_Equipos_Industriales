package codigo;
import java.util.Scanner;

public class Programa {
    static final int MAX_MAQUINAS =100;
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int totalMaquinas = 0; 
        Maquina[] maquinas = new Maquina[MAX_MAQUINAS]; 
        int op; 
        do { 
            op = Funciones.mostrarMenu(scanner); 
            System.out.println("Opción seleccionada: " + op); 
        } while (op != 13); 
        System.out.println("Gracias por utilizar el sistema."); 
        scanner.close(); 
    }

}
