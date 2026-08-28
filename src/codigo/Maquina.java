package codigo;

public abstract class Maquina {
    private String codigo;
    private String nombre;
    private String modelo;
    private String tipo;
    private int temperatura;
    private int velocidad;
    private int cantidadPiezas;
    private boolean activa;

    public Maquina(String codigo, String nombre, String modelo, String tipo, int temperatura, int velocidad, 
        int cantidadPiezas, boolean activa){
            this.codigo = codigo;
            this.nombre = nombre;
            this.modelo = modelo;
            this.tipo = tipo;
            this.temperatura = temperatura;
            this.velocidad = velocidad;
            this.cantidadPiezas =cantidadPiezas;
            this.activa = activa;
    }
    public Maquina(String codigo, String nombre, String modelo){
            this.codigo = codigo;
            this.nombre = nombre;
            this.modelo = modelo;
            tipo = "General";
            temperatura = 100;
            velocidad =50;
            cantidadPiezas =10;
            activa = false;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getModelo(){
        return modelo;
    }
    public String getTipo(){
        return tipo;
    }
    public int getTemperatura(){
        return temperatura;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getCantidadPiezas(){
        return cantidadPiezas;
    }
    public boolean getActiva(){
        return activa;
    }
    public void setCodigo(String codigo){
        if(codigo != null && !codigo.isBlank()){
            this.codigo = codigo;
        }
    }
    public void setNombre(String nombre){
        if(nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }
    public void setModelo(String modelo){
        if(modelo != null && !modelo.isBlank()){
            this.modelo = modelo;
        }
    }
    public void setTipo(String tipo){
        if(tipo != null && !tipo.isBlank()){
            this.tipo = tipo;
        }
    }
    public void setTemperatura(int temperatura){
        if(temperatura >= 0){
            this.temperatura = temperatura;
        }
    }
    public void setVelocidad(int velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
        }
    }
    public void setCantidadPiezas(int cantidadPiezas){
        if(cantidadPiezas >= 0){
            this.cantidadPiezas = cantidadPiezas;
        }
    }
    public void isActiva(boolean activa){
        this.activa = activa;
    }
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Cantidad de Piezas: " + cantidadPiezas );
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Activa: " + activa);
        System.out.println("---------------------------");
    }
    public void iniciarMaquina(){
        System.out.println("La maquina esta iniciando");
        activa = true;
        setVelocidad(30);

    }
    public void detenerMaquina(){
        System.out.println("La maquina se esta deteniendo");
        activa = false;
        setVelocidad(0);

    }
    public void aumentarVelocidad(){
        System.out.println("La maquina aumento la velocidad ");
        setVelocidad(60);

    }
    public void reducirVelocidad(){
        System.out.println("La maquina redujo la velocidad ");
        setVelocidad(10);

    }
    public void registrarProduccion(){
         System.out.println("La produccion fue: " + getCantidadPiezas());

    }
    public void registrarProduccion(int piezasProducidas) {
        if (piezasProducidas <= 0) {
            System.out.println("Error: el valor debe ser mayor que cero.");
        }else {
            int total = getCantidadPiezas() + piezasProducidas;
            setCantidadPiezas(total);
            System.out.println("Producción registrada correctamente.");
            System.out.println("La producción total es: "+ getCantidadPiezas());
        }
    }

public void registrarProduccion(int piezasProducidas, int piezasExtra) {
    if (piezasProducidas <= 0 || piezasExtra < 0) {
        System.out.println("Error: las cantidades no son válidas.");
    } else {
        int produccionTotal = piezasProducidas + piezasExtra;
        setCantidadPiezas(getCantidadPiezas() + produccionTotal);
        System.out.println("Producción registrada correctamente.");
        System.out.println("Producción agregada: " + produccionTotal);
        System.out.println( "Cantidad total de piezas: " + getCantidadPiezas());
    }
}


public void registrarProduccion(int piezasProducidas, String turno) {
    if (piezasProducidas <= 0) {
        System.out.println("Error: el valor debe ser mayor que cero.");
    } else if (turno == null || turno.isEmpty()) {
        System.out.println("Error: el turno no puede estar vacío.");
    } else {
        int total = getCantidadPiezas() + piezasProducidas;
        setCantidadPiezas(total);
        System.out.println("Producción registrada correctamente.");
        System.out.println("Producción registrada en el turno: "+ turno);
        System.out.println( "Cantidad total de piezas: " + getCantidadPiezas());
    }
}
public abstract void realizarOperacion();

}
