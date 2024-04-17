package andrianopasquale97.U5W3D3.esercizio2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Libro implements Componente {
    private String titolo;
    private List<Autore> autori;
    private double prezzo;
    private List<Componente> elementi;

    public Libro(String titolo, List<Autore> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(Componente elemento) {
        elementi.add(elemento);
    }

    @Override
    public int numeroPagine() {
        int numPagine = 0;
        for (Object elemento : elementi) {
            if (elemento instanceof Pagina) {
                numPagine++;
            } else if (elemento instanceof Sezione) {
                numPagine += ((Sezione) elemento).numeroPagine();
            }
        }
        return numPagine;
    }
    @Override
    public void stampare() {
        System.out.println("Titolo del libro: " + titolo);
        System.out.println("Autori:");
        for (Autore autore : autori) {
            System.out.println("- " + autore.getNome() + " " + autore.getCognome());
        }
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Contenuto del libro:");
        for (Componente elemento : elementi) {
            elemento.stampare();
        }
    }
}
