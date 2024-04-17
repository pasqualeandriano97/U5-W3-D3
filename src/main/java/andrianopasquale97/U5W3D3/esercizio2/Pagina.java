package andrianopasquale97.U5W3D3.esercizio2;

public class Pagina implements Componente {
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public int numeroPagine() {
        return 1;
    }

    @Override
    public void stampare() {
        System.out.println("Contenuto della pagina:");
        System.out.println(contenuto);
    }
}
