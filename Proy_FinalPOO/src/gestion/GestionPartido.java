/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import modelo.PartidoPolitico;
/**
 *
 * @author Average
 */
public class GestionPartido {
    private final PartidoPolitico[] partidospoliticos;
    private int nro ;
    private final static int MAX=36;
    public GestionPartido() {
        partidospoliticos = new PartidoPolitico[MAX];
        nro = 0 ;
    }
    public void agregar(PartidoPolitico partidopolitico){
        if (nro<MAX){
            partidospoliticos[nro] = partidopolitico;
            nro++;
        }else{
            System.out.println("Error ");
        }
    }

    
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < nro; i++) {
            mensaje = mensaje+partidospoliticos[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return nro;
    }
    public PartidoPolitico iesimo(int pos){
        if (pos>=0 && pos<nro){
            return partidospoliticos[pos];
        }else{
            return null;
        }
    }
    
    public void eliminar(int pos){
        if (pos>=0 && pos<nro){
            for (int i = pos; i <nro-1; i++) {
                partidospoliticos[i] = partidospoliticos[i+1];
            }
            nro--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
}
