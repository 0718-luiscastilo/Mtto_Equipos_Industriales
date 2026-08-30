package codigo;

import java.util.Scanner;

public class Funciones {
    public static int mostrarMenu(Scanner scanner) { 
        int op; 
        do { 
            System.out.println(); 
            System.out.println("====== SISTEMA DE GESTIÓN DE MÁQUINAS ======"); 
            System.out.println(); System.out.println("1. Registrar máquina"); 
            System.out.println("2. Mostrar todas las máquinas"); 
            System.out.println("3. Buscar máquina por código"); 
            System.out.println("4. Mostrar máquinas activas"); 
            System.out.println("5. Mostrar máquinas inactivas"); 
            System.out.println("6. Iniciar máquina"); 
            System.out.println("7. Detener máquina"); 
            System.out.println("8. Registrar producción"); 
            System.out.println("9. Mostrar máquina con mayor producción"); 
            System.out.println("10. Realizar operación"); 
            System.out.println("11. Realizar mantenimiento"); 
            System.out.println("12. Monitorear máquina"); 
            System.out.println("13. Salir"); 
            System.out.print("Seleccione una opción: "); 
            while (!scanner.hasNextInt()) { 
                System.out.println("Debe ingresar un número."); 
                scanner.next(); 
                System.out.print("Seleccione una opción: "); 
            } 
            op = scanner.nextInt(); 
            if (op < 1 || op > 13) { 
                System.out.println("Opción inválida. Seleccione una opción entre 1 y 13.");
            } 
        } while (op < 1 || op > 13); return op; 
    }
    public static void registrarMaquina(Maquina[] maquinas, int totalMaquinas, int MAX_MAQUINAS){
        if(totalMaquinas ==MAX_MAQUINAS){
            System.out.println("No hay espacio para registrar mas Maquinas");
            return;
        }
    }
    
}
