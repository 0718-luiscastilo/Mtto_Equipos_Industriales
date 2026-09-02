package codigo;

import java.util.Scanner;

public class Funciones {
    static Scanner scanner = new Scanner(System.in); 
    
    public static int mostrarMenu(Scanner scanner) { 
        int op; 
        do { 
            System.out.println(); 
            System.out.println("====== SISTEMA DE GESTIÓN DE MÁQUINAS ======"); 
            System.out.println(); System.out.println("1. Registrar máquina"); 
            System.out.println("2. Mostrar todas las máquinas"); 
            System.out.println("3. Buscar máquina por código"); 
            System.out.println("4. Mostrar Estados de Maquinas "); 
            System.out.println("5. Calcular Promedio de Temperatura de Maquinas "); 
            System.out.println("6. Calulasr Maquinas por tipo"); 
            System.out.println("7. Mostrar Tipos de Maquinas"); 
            System.out.println("8. Realizar mantenimiento"); 
            System.out.println("9. Monitorear máquina"); 
            System.out.println("10. Salir"); 
            System.out.print("Seleccione una opción: "); 
            while (!scanner.hasNextInt()) { 
                System.out.println("Debe ingresar un número."); 
                scanner.next(); 
                System.out.print("Seleccione una opción: "); 
            } 
            op = scanner.nextInt(); 
            if (op < 1 || op > 10) { 
                System.out.println("Opción inválida. Seleccione una opción entre 1 y 13.");
            } 
        } while (op < 1 || op > 10); return op; 
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
        scanner.close();
    }
    public static void mostrarTodasLasMaquinas(Maquina[] maquinas, int totalMaquinas){
        if(totalMaquinas ==0){
            System.out.println("No hay ninguna maquina registrada");
            return;
        }
        for(int i =0;i<totalMaquinas;i++){
            maquinas[i].mostrarInformacion();
        }
    }
    public static void buscarMaquinaPorCodigo(Maquina[] maquinas, int totalMaquinas){
        boolean encontrado = false;
        if(totalMaquinas ==0){
            System.out.println("No hay ninguna maquina registrada");
            return;
        }
        System.out.print("Ingrese el codigo: ");
        String buscarcodigo =scanner.nextLine();
        while(buscarcodigo.isBlank()){
            System.out.println("Ingrese codigo valido.");
            buscarcodigo= scanner.nextLine();
        }
        for(int i =0;i<totalMaquinas;i++){
            if(maquinas[i].getCodigo().equalsIgnoreCase(buscarcodigo)){
                encontrado=true;
                maquinas[i].mostrarInformacion();
            }  
        }
        if(!encontrado){
            System.out.println("No existe minguna maquina comn ese codigo.");
        }
    }
    public static void mostrarMaquinasPorEstado(Maquina[] maquinas, int totalMaquinas){
        boolean encontrado = false;
        if(totalMaquinas ==0){
            System.out.println("No hay ninguna maquina registrada");
            return;
        }
        System.out.println("1. Mostrar máquinas activas"); 
        System.out.println("2. Mostrar máquinas inactivas"); 
        System.out.print("Seleccione una opción: "); 
        int opcion = scanner.nextInt(); 

        boolean buscarEstado;
        if (opcion == 1) { 
            buscarEstado = true; 
        }else if (opcion == 2) { 
            buscarEstado = false; 
        } else { 
            System.out.println("Opción no válida."); 
            return; 
        }
        for(int i =0;i<totalMaquinas;i++){
            if(maquinas[i].getActiva() == buscarEstado){
                encontrado = true;
                maquinas[i].mostrarInformacion();
            }
        }
        if(!encontrado){
            System.out.println("No existe minguna maquina comn ese estado.");
        }
    }
    public static void calcularTemperaturaPromedio(Maquina[] maquinas, int totalMaquinas){
        if(totalMaquinas ==0){
            System.out.println("No hay ninguna maquina registrada");
            return;
        }
        double sumaTemperatura =0;
        for(int i =0;i<totalMaquinas;i++){
            sumaTemperatura += maquinas[i].getTemperatura();
        }
        double promedioTemperatura = sumaTemperatura / totalMaquinas;

        System.out.println("==========================================");
        System.out.println("El promedio de temperatura de las máquinas es: " + promedioTemperatura + " °C");
    }
    public static void contarMaquinasPorTipo(Maquina[] maquinas, int totalMaquinas){
        if(totalMaquinas ==0){
            System.out.println("No hay ninguna maquina registrada");
            return;
        }
        int maquinaProduccion = 0;
        int maquinaEmpaque = 0;
        int robotIndustrial = 0;
        for(int i =0; i<totalMaquinas;i++){
            if(maquinas[i] instanceof MaquinaProduccion){
            maquinaProduccion++;
            }
            if(maquinas[i] instanceof MaquinaEmpaque){
            maquinaEmpaque++;
            }
            if(maquinas[i] instanceof RobotIndustrial){
            robotIndustrial++;
            }
        }
        System.out.println("===========MAQUINAS REGISTRADAS ==========");
        System.out.println("Maquinas de Produccion_: " + maquinaProduccion);
        System.out.println("Maquinas de Enbarque: " + maquinaEmpaque);
        System.out.println("Robot: " + robotIndustrial);
    }
    public static void realizarMantenimiento(Maquina[] maquinas, int totalMaquinas) {
        if (totalMaquinas == 0) {
            System.out.println("No hay ninguna máquina registrada.");
            return;
        }
        System.out.print("Ingrese el código de la máquina: ");
        String codigo = scanner.nextLine();
        while (codigo.isBlank()) {
            System.out.println("Ingrese un código válido.");
            codigo = scanner.nextLine();
        }
        codigo = codigo.trim();
        boolean encontrado = false;
        for (int i = 0; i < totalMaquinas; i++) {
            if (maquinas[i].getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                if (maquinas[i] instanceof Mantenible) {
                    Mantenible mantenible = (Mantenible) maquinas[i];
                    mantenible.realizarMantenimiento();
                }
                else{
                    System.out.println("Esta máquina no permite realizar mantenimiento.");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ninguna máquina con ese código.");
        }
    }
    public static void monitorearMaquina(Maquina[] maquinas, int totalMaquinas) {
        if (totalMaquinas == 0) {
            System.out.println("No hay ninguna máquina registrada.");
            return;
        }
        System.out.print("Ingrese el código de la máquina: ");
        String codigo = scanner.nextLine();
        while (codigo.isBlank()) {
            System.out.println("Ingrese un código válido.");
            codigo = scanner.nextLine();
        }
        codigo = codigo.trim();
        boolean encontrado = false;
        for (int i = 0; i < totalMaquinas; i++) {
            if (maquinas[i].getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
                if (maquinas[i] instanceof Monitoreable) {
                    Monitoreable monitoreable = (Monitoreable) maquinas[i];
                    System.out.println("\n===== MONITOREO =====");
                    System.out.println("1. Iniciar monitoreo");
                    System.out.println("2. Detener monitoreo");
                    System.out.print("Seleccione una opción: ");
                    int opcion = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion == 1) {
                        monitoreable.iniciarMonitoreo();
                    } else if (opcion == 2) {
                        monitoreable.detenerMonitoreo();
                    } else {
                        System.out.println("Opción no válida.");
                    }
                } else {
                    System.out.println("Esta máquina no permite realizar monitoreo.");
                }
            break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ninguna máquina con ese código.");
        }
    }
}
