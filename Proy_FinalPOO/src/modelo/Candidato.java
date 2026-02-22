/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Average
 */
public class Candidato extends Persona {
    private String dni;
    private PartidoPolitico partidopolitico;

    public Candidato(String dni, PartidoPolitico partidopolitico, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.dni = dni;
        this.partidopolitico = partidopolitico;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public PartidoPolitico getPartidopolitico() {
        return partidopolitico;
    }

    public void setPartidopolitico(PartidoPolitico partidopolitico) {
        this.partidopolitico = partidopolitico;
    }

    @Override
    public String toString() {
        return "Candidato{" + "dni=" + dni + ", partidopolitico=" + partidopolitico + '}';
    }

    
    
    
}
