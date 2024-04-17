package andrianopasquale97.U5W3D3.esercizio1;

import lombok.Getter;

@Getter
public class UserData {
    private String nomecompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomecompleto = ds.getNomeCompleto ();
        eta = ds.getEta(); }

}
