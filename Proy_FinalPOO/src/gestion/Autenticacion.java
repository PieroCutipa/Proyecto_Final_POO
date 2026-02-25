
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import modelo.Operador;

public class Autenticacion {
    
    private Operador operador; 

    public Autenticacion() {
        
        operador = new Operador("admin", "1234");
    }

    public boolean login(String usuario, String contraseña) {
        
        return operador.getUsuario().equals(usuario) &&
                operador.getContraseña().equals(contraseña);
        
    }


}