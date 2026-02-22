/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Average
 */
public class MesaElectoral {
    private int NumeroMesa;
    private MiembrosDeMesa[] miembros ;
    private int contador;
    //Inicializo Atributo p
    public MesaElectoral() {
        NumeroMesa= 0;
        miembros = new MiembrosDeMesa[3];
        contador=0;
    }
    //Constructores
    public MesaElectoral(int NumeroMesa, MiembrosDeMesa[] miembros, int contador) {
        this.NumeroMesa = NumeroMesa;
        this.miembros = miembros;
        this.contador = contador;
    }
    //Getters and Setters 
    public int getNumeroMesa() {
        return NumeroMesa;
    }

    public void setNumeroMesa(int NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }

    public MiembrosDeMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembrosDeMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Metodos
    public void AsignarMiembro(MiembrosDeMesa m) {
        if (contador < miembros.length) {
            this.miembros[contador] = m; 
            contador++;
        } else {
            System.out.println("Mesa llena");
        }
    }
}
