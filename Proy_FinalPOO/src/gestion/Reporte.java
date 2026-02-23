/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import modelo.MesaElectoral;
public class Reporte {

     public void ReportePorMesa(MesaElectoral mesa) {

        System.out.println("    REPORTE DE MESA    ");
        System.out.println("Numero de mesa: " + mesa.getNumeroMesa());
        System.out.println("Total votantes: " );
        System.out.println("Votos emitidos: " );
        System.out.println("Votos nulos: " );
        System.out.println("Votos en blanco: " );
        
    }
}
