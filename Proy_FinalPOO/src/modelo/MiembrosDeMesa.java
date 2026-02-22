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
    //Constructores

    public MiembrosDeMesa() {
        super();
        dni="";
    }

    public MiembrosDeMesa(String nombres, String apellidos, String dni) {
        super(nombres, apellidos);
        this.dni = dni;
    }   
    //Getters and Setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
