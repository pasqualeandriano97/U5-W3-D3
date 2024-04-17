package andrianopasquale97.U5W3D3.esercizio1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
public class InfoAdapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return LocalDate.now().getYear()-info.getDataDiNascita().getYear();
    }
}
