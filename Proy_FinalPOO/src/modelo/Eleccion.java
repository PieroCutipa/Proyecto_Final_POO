
package modelo;

public class Eleccion {
    private Fecha fecha;
    private TipoEleccion TipoEleccion;
    

    public Eleccion(Fecha fecha, TipoEleccion TipoEleccion) {
        this.fecha = fecha;
        this.TipoEleccion = TipoEleccion;
        
    }
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public TipoEleccion getTipoEleccion() {
        return TipoEleccion;
    }

    public void setTipoEleccion(TipoEleccion TipoEleccion) {
        this.TipoEleccion = TipoEleccion;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "fecha=" + fecha + ", TipoEleccion=" + TipoEleccion + '}';
    }
    

    

    
    
    
        
}
