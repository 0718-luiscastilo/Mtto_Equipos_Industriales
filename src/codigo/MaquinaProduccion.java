package codigo;

public class MaquinaProduccion extends Maquina {
    private String tipoProducto;
    private int piezasPorHora;
    private boolean modoAutomatico;

    public MaquinaProduccion(String codigo, String nombre, String modelo, String tipo, int temperatura, int velocidad, 
        int cantidadPiezas, boolean activa, String tipoProducto, int piezasPorHora, boolean modoAutomatico){
            super(codigo, nombre, modelo, tipoProducto, temperatura, velocidad, cantidadPiezas, activa);
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
    public void setTipo(String tipoProducto){
        if(tipoProducto != null && !tipoProducto.isBlank()){
            this.tipoProducto = tipoProducto;
        }
    }
    public void setTemperatura(int piezasPorHora){
        if(piezasPorHora >= 0){
            this.piezasPorHora = piezasPorHora;
        }
    }
    public void isActiva(boolean modoAutomatico){
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

    
}
