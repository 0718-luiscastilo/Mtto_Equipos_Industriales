package codigo;

public class MaquinaProduccion extends Maquina implements Mantenible, Monitoreable{
    private String tipoProducto;
    private int piezasPorHora;
    private boolean modoAutomatico;

    public MaquinaProduccion(String codigo, String nombre, String modelo, String tipo, int temperatura, int velocidad, 
        int cantidadPiezas, boolean activa, String tipoProducto, int piezasPorHora, boolean modoAutomatico){
            super(codigo, nombre, modelo, tipo, temperatura, velocidad, cantidadPiezas, activa);
            this.tipoProducto = tipoProducto;
            this.piezasPorHora = piezasPorHora;
            this.modoAutomatico = modoAutomatico;
    }
    public String getTipoProducto(){
        return tipoProducto;
    }
    public int getPiezasPorHora(){
        return piezasPorHora;
    }
    public boolean getModoAutomatico(){
        return modoAutomatico;
    }
    public void setTipoProducto(String tipoProducto){
        if(tipoProducto != null && !tipoProducto.isBlank()){
            this.tipoProducto = tipoProducto;
        }
    }
    public void setPiezasPorHora(int piezasPorHora){
        if(piezasPorHora >= 0){
            this.piezasPorHora = piezasPorHora;
        }
    }
    public void ismodoAutomatico(boolean modoAutomatico){
        this.modoAutomatico = modoAutomatico;
    }
    @Override
    public void realizarOperacion(){
        System.out.println("La maquina esta operando.");
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        super.mostrarInformacion();
        System.out.println("Tipo de Producto: " + tipoProducto);
        System.out.println("Piezas por Hora: " + piezasPorHora);
        System.out.println("Modo: " + modoAutomatico);
    }
    public void activarModoAutomatico(){
        modoAutomatico = true;
        System.out.println("El modo Automatico esta activado");
    }
    public void desactivarModoAutomatico(){
        modoAutomatico = false;
        System.out.println("El modo Automatico esta desactivado");
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("A la Maquina se le tiene que realizar un mantenimiento");
    }
    @Override
    public void mostrarEstadoMantenimiento() {
        System.out.println("El mantenimiento ya se realizo");
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
