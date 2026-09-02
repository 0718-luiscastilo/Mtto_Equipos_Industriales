package codigo;
import java.util.Scanner;

public class Programa {
    static final int MAX_MAQUINAS =100;
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int[] totalMaquinas = {0};
        Maquina[] maquinas = new Maquina[MAX_MAQUINAS]; 
        int op; 
        do { 
            op = Funciones.mostrarMenu(scanner); 
            switch (op) {
                case 1:
                    Funciones.registrarMaquina(maquinas, totalMaquinas, MAX_MAQUINAS);
                    break;
                case 2:
                    Funciones.mostrarTodasLasMaquinas(maquinas, totalMaquinas[0]);
                    break;
                case 3:
                    Funciones.buscarMaquinaPorCodigo(maquinas, totalMaquinas[0]);
                    break;
                case 4:
                    Funciones.mostrarMaquinasPorEstado(maquinas, totalMaquinas[0]);
                    break;
                case 5:
                    Funciones.calcularTemperaturaPromedio(maquinas, totalMaquinas[0]);
                    break;
                case 6:
                    Funciones.contarMaquinasPorTipo(maquinas, totalMaquinas[0]);
                    break;
                case 7:
                    Funciones.realizarMantenimiento(maquinas, totalMaquinas[0]);
                    break;
                case 8:
                    Funciones.monitorearMaquina(maquinas, totalMaquinas[0]);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        } while (op != 9); 
        System.out.println("Gracias por utilizar el sistema."); 
        scanner.close(); 
    }

}
