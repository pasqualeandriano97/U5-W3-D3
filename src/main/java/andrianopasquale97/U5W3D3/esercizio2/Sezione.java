package andrianopasquale97.U5W3D3.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Componente {
    private String titolo;
    private List<Componente> elementi;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(Componente elemento) {
        elementi.add(elemento);
    }

    @Override
    public int numeroPagine() {
        int numPagine = 0;
        for (Componente elemento : elementi) {
            numPagine += elemento.numeroPagine();
        }
        return numPagine;
    }

    @Override
    public void stampare() {
        System.out.println("Titolo della sezione: " + titolo);
        for (Componente elemento : elementi) {
            elemento.stampare();
        }
    }
}
