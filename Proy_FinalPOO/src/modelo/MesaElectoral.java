/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.*;
public class MesaElectoral {

    private int NumeroMesa;
    private MiembrosDeMesa[] miembros;
    private int contador;

    private Candidato[] candidatos;
    private int contadorCandidatos;
    private int votosNulos;
    private int votosBlanco;
    
    public MesaElectoral() {
        NumeroMesa = 0;
        miembros = new MiembrosDeMesa[3];
        contador = 0;

        candidatos = new Candidato[10];
        contadorCandidatos = 0;
        votosNulos = 0;
        votosBlanco = 0;
    }

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

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }
    
    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public int getContadorCandidatos() {
        return contadorCandidatos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }
    
    public void registrarVotoPreferencial(String dni) {
    for (int i = 0; i < contadorCandidatos; i++) {
        if (candidatos[i].getDni().equals(dni)) {
            candidatos[i].sumarVotoPreferencial();
            return;
            }
        }
        System.out.println("Candidato no encontrado");
    }
    
    public int getTotalVotosEmitidos() {
        // Empezamos con los votos manuales
        int total = votosNulos + votosBlanco;

        // Sumamos los votos de los candidatos que existen en el arreglo
        for (int i = 0; i < contadorCandidatos; i++) {
            // IMPORTANTE: Asegúrate que candidatos[i] no sea null
            if (candidatos[i] != null) {
                total = total + candidatos[i].getVotos();
            }
        }
        return total;
    }

    public void AsignarMiembro(MiembrosDeMesa m) {
        if (contador < miembros.length) {
            miembros[contador] = m;
            contador++;
        } else {
            System.out.println("Mesa llena");
        }
    }

    public void agregarCandidato(Candidato c) {
        if (contadorCandidatos < candidatos.length) {
            candidatos[contadorCandidatos] = c;
            contadorCandidatos++;
        } else {
            System.out.println("No se pueden agregar más candidatos");
    }
        }
    
    public int getTotalVotosPreferenciales() {
        int suma = 0;
        for (int i = 0; i < contadorCandidatos; i++) {
            // Suponiendo que tu clase Candidato tiene getVotosPreferenciales
            suma = suma + candidatos[i].getVotosPreferenciales();
        }
        return suma;
    }
    public void registrarVoto(String dni) {
    
        for (int i = 0; i < contadorCandidatos; i++) {

            if (candidatos[i].getDni().equals(dni)) {
                candidatos[i].sumarVoto();
                return;
            }
        }
    
        System.out.println("Candidato no encontrado");
    }

    public void registrarVotoNulo() {
        votosNulos++;
    }
   
    public void registrarVotoBlanco() {
        votosBlanco++;
    }

    
}
