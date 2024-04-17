package andrianopasquale97.U5W3D3.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autore {
    private String nome;
    private String cognome;

    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

}
