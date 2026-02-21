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

    // Metodos
    // Constructores
    // COnstructor sin parametros, por default, predeterminado
    public Fecha() {
        // inicializar los valores de los atributos
        dia = 1;
        mes = 1;
        anio = 2000;
    }

    public Fecha(int pDia, int pMes, int pAnio) {
        // inicializar los atributo con los valores de los parametros
        if(esFechaValida(pDia, pMes, pAnio)){
            dia = pDia;
            mes = pMes;
            anio = pAnio;
        }else{
            System.out.println("Fecha no válida. Se asignará 1/1/2000");
            
        }
    }   
    // otros metodos
    public void escribir() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
    }

    // Metodo privado para determinar el numero de dias de un mes y año
    // respectivo
    private int nroDiasMes(int pMes, int pAnio) {
        // Mes 2 o febrero
        if (pMes == 2) {
            if (pAnio % 4 == 0) {
                return 29;
            }else{
                return 28;
            }
        }
        // Meses: 4,6,9,11
        if (pMes==4 || pMes==6 || pMes==9 || pMes==11){
            return 30;
        }
        // meses: 1, 3, 5, 7, 8, 10, 12
        if (pMes==1 || pMes==3 || pMes==5 || pMes==7 || pMes==8 || pMes==10 || pMes==12){
            return 31;
        }
        return -1; // Error
    }
    // Metodo privado para determinar si una fecha es valida o no
    protected boolean esFechaValida(int pDia, int pMes, int pAnio){
        if (pAnio>0){
            // verificar si los meses son validos
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
}
