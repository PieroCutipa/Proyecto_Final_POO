
package modelo;



public class ActaElectoral {
    private String titulo;
    private Fecha fecha;
    private double hora;
    private String lugar;
    
    private String selloOficial;
    private MesaElectoral mesa;
    private String observaciones;
    private String nroActaUnico;
    
    public ActaElectoral() {
    }
    public ActaElectoral(String titulo,Fecha fecha,double hora,String lugar,String selloOficial,String observaciones,String nroActaUnico) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.selloOficial = selloOficial;
        this.observaciones = observaciones;
        this.nroActaUnico = nroActaUnico;
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public String getSelloOficial() {
        return selloOficial;
    }

    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNroActaUnico() {
        return nroActaUnico;
    }

    public void setNroActaUnico(String nroActaUnico) {
        this.nroActaUnico = nroActaUnico;
    }
    @Override
    public String toString() {
        return "ActaElectoral{" + "titulo=" + titulo + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", selloOficial=" + selloOficial + ", Observaciones=" + observaciones + ", nroActaUnico=" + nroActaUnico  + '}';
    }
   
}
