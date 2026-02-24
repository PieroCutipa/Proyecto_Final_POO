
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



public class Operador {

    private String usuario;
    private String contraseña;
    

        public Operador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
}