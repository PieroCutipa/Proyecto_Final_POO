/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Average
 */
public class MiembrosDeMesa extends Persona{
    //Inicializo Atributos p
    protected String dni;
    private TipoMiembro tipomiembro;
    //Constructores

    public MiembrosDeMesa( String nombres, String apellidos,String dni, TipoMiembro tipomiembro) {
        super(nombres, apellidos);
        this.dni = dni;
        this.tipomiembro = tipomiembro;
    }
    public String getDni() {   
        return dni;
    }

    public void setDni(String dni) {     
        this.dni = dni;
    }

    public TipoMiembro getTipomiembro() {
        return tipomiembro;
    }

    //Getters and Setters
    public void setTipomiembro(TipoMiembro tipomiembro) {
        this.tipomiembro = tipomiembro;
    }

    //Metodo 
    public String MostrarCargo() {
        super.toString();
        return "Datos Miembro de Mesa \n" +
                "---------------------\n" +
                "DNI      : " + dni + "\n" +
                "---------------------------------";
    }
    
}
