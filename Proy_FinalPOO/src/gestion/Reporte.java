/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import modelo.MesaElectoral;
import modelo.Candidato;
public class Reporte {

    public void ReportePorMesa(MesaElectoral mesa) {

        System.out.println("    REPORTE DE MESA    ");
        System.out.println("Numero de mesa: " + mesa.getNumeroMesa());
        
        for (int i = 0; i < mesa.getContadorCandidatos(); i++) {
            Candidato c = mesa.getCandidatos()[i];
            System.out.println(c.getNombres() + " " +c.getApellidos() +" Votos: " +c.getVotos());
        }
        System.out.println("Votos nulos: " + mesa.getVotosNulos());
        System.out.println("Votos en blanco: " + mesa.getVotosBlanco());
        System.out.println("Total votos emitidos: " + mesa.getTotalVotosEmitidos());
    }
}
