/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import modelo.*;

/**
 *
 * @author Average
 */
public class GestionEleccion {
    private final Eleccion[] elecciones;
    private int nro;
    private final static int MAX=3;

    public GestionEleccion() {
        elecciones= new Eleccion[MAX];
        nro=0;
    }
    
    public void agregar(Eleccion eleccion){
        if (nro<MAX){
            elecciones[nro] = eleccion;
            nro++;
        }else{
            System.out.println("Error ");
        }
    }

    
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < nro; i++) {
            mensaje = mensaje+elecciones[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return nro;
    }
    public Eleccion iesimo(int pos){
        if (pos>=0 && pos<nro){
            return elecciones[pos];
        }else{
            return null;
        }
    }
    
    public void eliminar(int pos){
        if (pos>=0 && pos<nro){
            for (int i = pos; i <nro-1; i++) {
                elecciones[i] = elecciones[i+1];
            }
            nro--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    } 
}
