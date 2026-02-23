
package modelo;

public class RegistroVoto {
    private Candidato candidato;
    private int votosTotalesCandidato;
    private int votosPreferenciales;

    public RegistroVoto() {
    votosTotalesCandidato=0;
    votosPreferenciales=0;
    }
    
    public RegistroVoto(Candidato candidato, int votosTotalesCandidato, int votosPreferenciales) {
        this.candidato = candidato;
        this.votosTotalesCandidato = votosTotalesCandidato;
        this.votosPreferenciales = votosPreferenciales;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVotosTotalesCandidato() {
        return votosTotalesCandidato;
    }

    public void setVotosTotalesCandidato(int votosTotalesCandidato) {
        this.votosTotalesCandidato = votosTotalesCandidato;
    }

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public void setVotosPreferenciales(int votosPreferenciales) {
        this.votosPreferenciales = votosPreferenciales;
    }
    
    //suma de votos
    public void registrarVotos(int votos,int preferenciales){
        votosTotalesCandidato=votosTotalesCandidato+votos;
        votosPreferenciales=votosPreferenciales+preferenciales;
    }
    public void corregirVotos(int votosCorrectos, int preferencialesCorrectos){
        this.votosTotalesCandidato = votosCorrectos;
        this.votosPreferenciales = preferencialesCorrectos;
    }
}
