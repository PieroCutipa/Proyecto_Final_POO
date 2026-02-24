/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author Average
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    
    public Fecha() {
        
        dia = 1;
        mes = 1;
        anio = 2000;
    }

    public Fecha(int pDia, int pMes, int pAnio) {
       
        if(esFechaValida(pDia, pMes, pAnio)){
            dia = pDia;
            mes = pMes;
            anio = pAnio;
        }else{
            System.out.println("Fecha no válida. Se asignará 1/1/2000");
            
        }
    }   
   
    public void escribir() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
    }

    
    private int nroDiasMes(int pMes, int pAnio) {
       
        if (pMes == 2) {
            if (pAnio % 4 == 0) {
                return 29;
            }else{
                return 28;
            }
        }
        
        if (pMes==4 || pMes==6 || pMes==9 || pMes==11){
            return 30;
        }
       
        if (pMes==1 || pMes==3 || pMes==5 || pMes==7 || pMes==8 || pMes==10 || pMes==12){
            return 31;
        }
        return -1; // Error
    }
    
    protected boolean esFechaValida(int pDia, int pMes, int pAnio){
        if (pAnio>0){
           
            if (pMes>=1 && pMes<=12){
                if (pDia>=1 && pDia <= nroDiasMes(pMes,pAnio)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anio ;
    }
    
}
