/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import modelo.Candidato;

/**
 *
 * @author Average
 */
public class GestionCandidato {
    private Candidato[] candidatos;
    private int  nro;
    private final static int MAX=36;
    
    public GestionCandidato() {
        candidatos = new Candidato[MAX];
        nro = 0 ;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    public void agregar(Candidato candidato){
        if (nro<MAX){
            candidatos[nro] = candidato;
            nro++;
        }else{
            System.out.println("Error ");
        }
    }
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < nro; i++) {
            mensaje = mensaje+candidatos[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return nro;
    }
    public Candidato iesimo(int pos){
        if (pos>=0 && pos<nro){
            return candidatos[pos];
        }else{
            return null;
        }
    }
    
    public void eliminar(int pos){
        if (pos>=0 && pos<nro){
            for (int i = pos; i <nro-1; i++) {
                candidatos[i] = candidatos[i+1];
            }
            nro--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
}
        
    
