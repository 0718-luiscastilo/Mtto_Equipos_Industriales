package codigo;

public class MaquinaEmpaque extends Maquina implements Mantenible, Monitoreable{
    private String tipoEmpaque;
    private int velocidadEmpaque;
    private boolean sensorSeguridad;
    
    public MaquinaEmpaque(String codigo, String nombre, String modelo, String tipo, int temperatura, int velocidad, 
        int cantidadPiezas, boolean activa, String tipoEmpaque, int velocidadEmpaque, boolean sensorSeguridad){
            super(codigo, nombre, modelo, tipo, temperatura, velocidad, cantidadPiezas, activa);
            this.tipoEmpaque = tipoEmpaque;
            this.velocidadEmpaque = velocidadEmpaque;
            this.sensorSeguridad = sensorSeguridad;
    }
    public String getTipoEmpaque(){
        return tipoEmpaque;
    }
    public int getVelocidadEmpaque(){
        return velocidadEmpaque;
    }
    public boolean getSensorSeguridad(){
        return sensorSeguridad;
    }
    public void setTipoEmpaque(String tipoEmpaque){
        if(tipoEmpaque != null && !tipoEmpaque.isBlank()){
            this.tipoEmpaque = tipoEmpaque;
        }
    }
    public void setVelocidadEmpaque(int velocidadEmpaque){
        if(velocidadEmpaque >= 0){
            this.velocidadEmpaque = velocidadEmpaque;
        }
    }
    public void setSensorSeguridad(boolean sensorSeguridad){
        this.sensorSeguridad = sensorSeguridad;
    }
    @Override
    public void realizarOperacion(){
        System.out.println("La máquina está realizando el proceso de empaque.");
    }
     @Override
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        super.mostrarInformacion();
        System.out.println("Tipo de Enpaque: " + tipoEmpaque);
        System.out.println("Velocidad de Enpaque: " + velocidadEmpaque);
        System.out.println("Sensor de Seguridad: " + sensorSeguridad);
    }
    public void activarSensorSeguridad(){
        sensorSeguridad = true;
        System.out.println("El Sensor de Seguridad esta activado");
    }
    public void desactivarSensorSeguridad(){
        sensorSeguridad = false;
        System.out.println("El Sensor de Seguridad esta desactivado");
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("A la Maquina se le tiene que realizar un mantenimiento");
    }
    @Override
    public void mostrarEstadoMantenimiento() {
        System.out.println("EDl mantenimiento ya se realizo");
    }
    @Override
    public void iniciarMonitoreo() {
        System.out.println("Iniciando monitoreo de la maquina...");
    }
        @Override
    public void detenerMonitoreo() {
        System.out.println("Deteniendo monitoreo de la maquina...");
    }

}
