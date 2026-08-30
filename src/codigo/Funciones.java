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
    public static void registrarMaquina(Maquina[] maquinas, int[] totalMaquinas, int MAX_MAQUINAS){
        Scanner scanner = new Scanner(System.in); 
        if(totalMaquinas[0] >= MAX_MAQUINAS){
            System.out.println("No hay espacio para registrar mas Maquinas");
            return;
        }
        
        System.out.print("Codigo: ");
        String codigo = scanner.nextLine();
        while(codigo.isBlank()){
            System.out.println("Ingrese un Codigo valido ");
            codigo = scanner.nextLine();
        }
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        while(nombre.isBlank()){
            System.out.println("Ingrese un nombre valido ");
            nombre = scanner.nextLine();
        }
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        while(modelo.isBlank()){
            System.out.println("Ingrese un Modelo valido ");
            modelo = scanner.nextLine();
        }
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        while(tipo.isBlank()){
            System.out.println("Ingrese un Tipo valido ");
            tipo = scanner.nextLine();
        }
        System.out.print("Temperatura: ");
        while(!scanner.hasNextInt()){
            System.out.println("Debe ingresar un número.");
            scanner.next();
        }
        int temperatura = scanner.nextInt();
        while(temperatura <0){
            System.out.println("La temperatura no puede ser negativa.");
            temperatura = scanner.nextInt();
        }
        System.out.print("Velocidad: ");
        while(!scanner.hasNextInt()){
            System.out.println("Debe ingresar un número.");
            scanner.next();
        }
        int velocidad = scanner.nextInt();
        while(velocidad <0){
            System.out.println("La velocidad no puede ser negativa.");
            velocidad = scanner.nextInt();
        }
        System.out.print("Cantidad de Piezas: ");
        while(!scanner.hasNextInt()){
            System.out.println("Debe ingresar un número.");
            scanner.next();
        }
        int cantidadPiezas = scanner.nextInt();
        while(cantidadPiezas <0){
            System.out.println("Debe ingresar un número.");
            cantidadPiezas = scanner.nextInt();
        }
        System.out.print("¿La máquina está activa? (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Debe ingresar true o false.");
            scanner.next();
        }
        boolean activa = scanner.nextBoolean();
        scanner.nextLine();
        

        System.out.println("Seleccione el tipo de máquina:");
        System.out.println("1. Máquina de producción");
        System.out.println("2. Máquina de empaque");
        System.out.println("3. Robot industrial");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Tipo: ");
                String tipoProducto = scanner.nextLine();
                while(tipoProducto.isBlank()){
                    System.out.println("Ingrese un Tipo valido ");
                    tipoProducto = scanner.nextLine();
                }
                System.out.print("Piezas por Hora: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Debe ingresar un número.");
                    scanner.next();
                }
                int piezasHora = scanner.nextInt();
                while(piezasHora <0){
                    System.out.println("La velocidad no puede ser negativa.");
                    piezasHora = scanner.nextInt();
                }
                System.out.print("¿La máquina está modo Automatico? (true/false): ");
                while (!scanner.hasNextBoolean()) {
                    System.out.println("Debe ingresar true o false.");
                    scanner.next();
                }
                boolean modoAuto = scanner.nextBoolean();
                scanner.nextLine();

                maquinas[totalMaquinas[0]] = new MaquinaProduccion(codigo,nombre,modelo,tipo,temperatura,velocidad,cantidadPiezas,activa,tipoProducto,
                    piezasHora,modoAuto);
                break;

            case 2:
                System.out.print("Tipo Empaque: ");
                String tipoEnpaque = scanner.nextLine();
                while(tipoEnpaque.isBlank()){
                    System.out.println("Ingrese un Tipo valido ");
                    tipoEnpaque = scanner.nextLine();
                }
                System.out.print("Velocidad Enpaque: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Debe ingresar un número.");
                    scanner.next();
                }
                int velocidadEnpaque = scanner.nextInt();
                while(velocidadEnpaque <0){
                    System.out.println("La velocidad no puede ser negativa.");
                    velocidadEnpaque = scanner.nextInt();
                }
                System.out.print("¿La máquina tiene Sensor de Seguridad? (true/false): ");
                while (!scanner.hasNextBoolean()) {
                    System.out.println("Debe ingresar true o false.");
                    scanner.next();
                }
                boolean sensorSeguridad = scanner.nextBoolean();
                scanner.nextLine();

                maquinas[totalMaquinas[0]] = new MaquinaEmpaque(codigo,nombre,modelo,tipo,temperatura,velocidad,cantidadPiezas,activa,tipoEnpaque,
                velocidadEnpaque,sensorSeguridad);
                break;

            case 3:
                System.out.print("Tipo de Robot: ");
                String tipoRobort = scanner.nextLine();
                while(tipoRobort.isBlank()){
                    System.out.println("Ingrese un Tipo valido ");
                    tipoRobort = scanner.nextLine();
                }
                System.out.print("Numero de Ejes: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Debe ingresar un número.");
                    scanner.next();
                }
                int numeroEjes = scanner.nextInt();
                while(numeroEjes <0){
                    System.out.println("La velocidad no puede ser negativa.");
                    numeroEjes = scanner.nextInt();
                }
                System.out.print("¿La máquina tiene Vision Artificial? (true/false): ");
                while (!scanner.hasNextBoolean()) {
                    System.out.println("Debe ingresar true o false.");
                    scanner.next();
                }
                boolean visionArtificial = scanner.nextBoolean();
                scanner.nextLine();

                maquinas[totalMaquinas[0]] = new RobotIndustrial(codigo,nombre,modelo,tipo,temperatura,velocidad,cantidadPiezas,activa,tipoRobort,
                    numeroEjes,visionArtificial);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        totalMaquinas[0]++;
        System.out.println();
        System.out.println("====================================");
        System.out.println("Máquina registrada correctamente.");
        System.out.println("====================================");
    }
    
}
