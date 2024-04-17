package andrianopasquale97.U5W3D3.esercizio1;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Info{
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    public void dataDiNascita (Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
