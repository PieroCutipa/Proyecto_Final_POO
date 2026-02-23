/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import modelo.Operador;

public class Autenticacion {

    private Operador[] operadores;
    private int contador;

    public Autenticacion() {
        operadores = new Operador[5];
        contador = 0;
        operadores[contador++] = new Operador("admin", "1234");
    }

    public void agregarOperador(Operador op) {
        if (contador < operadores.length) {
            operadores[contador++] = op;
        } else {
            System.out.println("No se pueden agregar más operadores");
        }
    }
    public boolean login(String usuario, String contraseña) {

        for (int i = 0; i < contador; i++) {
            if (operadores[i].getUsuario().equals(usuario) &&
                operadores[i].getContraseña().equals(contraseña)) {
                return true;
            }
        }

        return false;
    }
}