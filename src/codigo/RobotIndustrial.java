package codigo;

public class RobotIndustrial extends Maquina implements Mantenible, Monitoreable{
    private String tipoRobot;
    private int numeroEjes;
    private boolean visionArtificial;

    public RobotIndustrial(String codigo, String nombre, String modelo, String tipo, int temperatura, int velocidad, 
        int cantidadPiezas, boolean activa, String tipoRobot, int numeroEjes, boolean visionArtificial){
            super(codigo, nombre, modelo, tipo, temperatura, velocidad, cantidadPiezas, activa);
            this.tipoRobot = tipoRobot;
            this.numeroEjes = numeroEjes;
            this.visionArtificial = visionArtificial;
    }
    public String getTipoRobot(){
        return tipoRobot;
    }
    public int getNumeroEjes(){
        return numeroEjes;
    }
    public boolean getVisionArtificial(){
        return visionArtificial;
    }
    public void setTipoRobot(String tipoRobot){
        if(tipoRobot != null && !tipoRobot.isBlank()){
            this.tipoRobot = tipoRobot;
        }
    }
    public void setNumeroEjes(int numeroEjes){
        if(numeroEjes > 0){
            this.numeroEjes = numeroEjes;
        }
    }
    public void setSensorSeguridad(boolean visionArtificial){
        this.visionArtificial = visionArtificial;
    }
    @Override
    public void realizarOperacion(){
        System.out.println("El robot está realizando una soldadura.");
    }
     @Override
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        super.mostrarInformacion();
        System.out.println("Tipo de Robot: " + tipoRobot);
        System.out.println("Numero de Ejes: " + numeroEjes);
        System.out.println("Visión Artificial: " + visionArtificial);
    }
    public void activarVisionArtificial(){
        visionArtificial = true;
        System.out.println("La Vision Artificial esta activado");
    }
    public void desactivarVisionArtificial(){
        visionArtificial = false;
        System.out.println("La Vision Artificial esta desactivado");
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
