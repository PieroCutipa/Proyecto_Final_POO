/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 *
 * @author Average
 */
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
