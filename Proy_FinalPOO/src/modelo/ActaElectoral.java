
package modelo;

import modelo.RegistroVoto;

public class ActaElectoral {
    private String titulo;
    private Fecha fecha;
    private double hora;
    private String lugar;
    private String identificacionMesa;
    private String selloOficial;
    private int nroVotantes;
    private int votosBlancos;
    private int votosNulos;
    private String Obersvaciones;
    private String nroActaUnico;
    
    // --- AQUÍ ESTÁ LA CORRECCIÓN CLAVE ---
    // Reemplazamos el String por un Arreglo de Objetos (Obligatorio para tu rúbrica)
    private RegistroVoto[] resultadoCandidatos;
    private int cantidadCandidatosRegistrados; // Contador para saber cuántos vamos guardando
    public ActaElectoral(){
       resultadoCandidatos=new RegistroVoto[20];
       cantidadCandidatosRegistrados=0;
    }

    public ActaElectoral(String titulo, Fecha fecha, double hora, String lugar, String identificacionMesa, String selloOficial, int nroVotantes, int votosBlancos, int votosNulos, String Obersvaciones, String nroActaUnico, RegistroVoto[] resultadoCandidatos, int cantidadCandidatosRegistrados) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.identificacionMesa = identificacionMesa;
        this.selloOficial = selloOficial;
        this.nroVotantes = nroVotantes;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.Obersvaciones = Obersvaciones;
        this.nroActaUnico = nroActaUnico;
        this.resultadoCandidatos = resultadoCandidatos;
        this.cantidadCandidatosRegistrados = cantidadCandidatosRegistrados;
       
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

    public String getIdentificacionMesa() {
        return identificacionMesa;
    }

    public void setIdentificacionMesa(String identificacionMesa) {
        this.identificacionMesa = identificacionMesa;
    }

    public String getSelloOficial() {
        return selloOficial;
    }

    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }

    public int getNroVotantes() {
        return nroVotantes;
    }

    public void setNroVotantes(int nroVotantes) {
        this.nroVotantes = nroVotantes;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public void setVotosBlancos(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public String getObersvaciones() {
        return Obersvaciones;
    }

    public void setObersvaciones(String Obersvaciones) {
        this.Obersvaciones = Obersvaciones;
    }

    public String getNroActaUnico() {
        return nroActaUnico;
    }

    public void setNroActaUnico(String nroActaUnico) {
        this.nroActaUnico = nroActaUnico;
    }

    public RegistroVoto[] getResultadoCandidatos() {
        return resultadoCandidatos;
    }

    public void setResultadoCandidatos(RegistroVoto[] resultadoCandidatos) {
        this.resultadoCandidatos = resultadoCandidatos;
    }

    public int getCantidadCandidatosRegistrados() {
        return cantidadCandidatosRegistrados;
    }

    public void setCantidadCandidatosRegistrados(int cantidadCandidatosRegistrados) {
        this.cantidadCandidatosRegistrados = cantidadCandidatosRegistrados;
    }
    
    public void agregarRegistroVoto(RegistroVoto registro){
        if(cantidadCandidatosRegistrados<resultadoCandidatos.length){
                resultadoCandidatos[cantidadCandidatosRegistrados]=registro;
                cantidadCandidatosRegistrados++;
        }else{
            System.out.println("Error: Cantidad de candidatos superado");
        }
    }
    public void corregirVotosCandidato(){
        
    }
    
} 