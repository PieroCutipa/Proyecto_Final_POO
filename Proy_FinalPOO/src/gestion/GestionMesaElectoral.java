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
public class GestionMesaElectoral {
    private MesaElectoral[] mesas;
    private int contadorMesas;
    private final static int MAX=3;
    //Inicializo Atributos
    public GestionMesaElectoral() {
        mesas = new MesaElectoral[MAX];
        contadorMesas = 0;
    }
    
    //Constructores 

    public GestionMesaElectoral(MesaElectoral[] mesas, int contadorMesas) {
        this.mesas = mesas;
        this.contadorMesas = contadorMesas;
    }

    
    
    public void agregarMesa(MesaElectoral nuevaMesa) {
        if (contadorMesas < MAX) {
            mesas[contadorMesas] = nuevaMesa;
            contadorMesas++;
            System.out.println("Mesa agregada al sistema.");
        } else {
            System.out.println("No hay espacio para más mesas.");
        }
    }
    
    public void eliminarMesa(int numeroMesa) {
        for (int i = 0; i < contadorMesas; i++) {
            if (mesas[i].getNumeroMesa() == numeroMesa) {
                for (int j = i; j < contadorMesas - 1; j++) {
                    mesas[j] = mesas[j + 1];
                }
                mesas[contadorMesas - 1] = null;
                contadorMesas--;
                System.out.println("Mesa eliminada.");
                
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void asignarMiembroAMesa(int numeroMesa, MiembrosDeMesa miembro) {
        for (int i = 0; i < contadorMesas; i++) {
            if (mesas[i].getNumeroMesa() == numeroMesa) {
                mesas[i].AsignarMiembro(miembro);
                
            }
        }
        System.out.println("No se encontró la mesa para asignar");
    }
    public void modificarMesa(int numeroBuscado, int nuevoNumero) {
        for (int i = 0; i < contadorMesas; i++) {
        if (mesas[i].getNumeroMesa() == numeroBuscado) {
            mesas[i].setNumeroMesa(nuevoNumero);
            System.out.println("Mesa actualizada.");
            
        }
        }
        System.out.println("Mesa no encontrada.");
    
    }
    
    public void modificarMiembro(String dniBuscado, String nuevoNombre, String nuevoApellido) {
        for (int i = 0; i < contadorMesas; i++) {
            MiembrosDeMesa[] lista = mesas[i].getMiembros();
            for (int j = 0; j < mesas[i].getContador(); j++) {
                if (lista[j].getDni().equals(dniBuscado)) {
                    lista[j].setNombres(nuevoNombre);
                    lista[j].setApellidos(nuevoApellido);
                    System.out.println("Miembro modificado.");
                    
                }
            }
        }
    
    }
    public void eliminarMiembro(String dniBuscado) {
        for (int i = 0; i < contadorMesas; i++) {
            MiembrosDeMesa[] lista = mesas[i].getMiembros();
            for (int j = 0; j < mesas[i].getContador(); j++) {
                if (lista[j].getDni().equals(dniBuscado)) {
                    for (int k = j; k < mesas[i].getContador() - 1; k++) {
                        lista[k] = lista[k + 1];
                    }
                    lista[mesas[i].getContador() - 1] = null;
                    mesas[i].setContador(mesas[i].getContador() - 1);
                    System.out.println("Miembro eliminado.");
                    //return;
                    
                }
            }
        }
    }
}
