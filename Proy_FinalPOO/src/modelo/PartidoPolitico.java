/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Average
 */
public class PartidoPolitico {
    private String nombrePartido;
    private String sigla;
    private String logo;
    private String representanteLegal;

    public PartidoPolitico() {
        nombrePartido="";
        sigla="";
        logo="";
        representanteLegal="";
    }

    public PartidoPolitico(String nombrePartido, String sigla, String logo, String representanteLegal) {
        this.nombrePartido = nombrePartido;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "PartidoPolitico{" 
                + "nombrePartido=" + nombrePartido 
                + ", sigla=" + sigla 
                + ", logo=" + logo 
                + ", representanteLegal=" + representanteLegal + '}';
    }
}
