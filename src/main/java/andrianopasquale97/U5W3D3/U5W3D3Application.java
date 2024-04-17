package andrianopasquale97.U5W3D3;

import andrianopasquale97.U5W3D3.esercizio1.Info;
import andrianopasquale97.U5W3D3.esercizio1.InfoAdapter;
import andrianopasquale97.U5W3D3.esercizio1.UserData;
import andrianopasquale97.U5W3D3.esercizio2.Autore;
import andrianopasquale97.U5W3D3.esercizio2.Libro;
import andrianopasquale97.U5W3D3.esercizio2.Pagina;
import andrianopasquale97.U5W3D3.esercizio2.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);
		System.out.println("------------------------ ESERCIZIO 1 --------------------------------");
		Info info = new Info();
		info.setNome("Andrea");
		info.setCognome("Rossi");
		info.setDataDiNascita(new java.util.Date(1997, 11, 11));
		UserData userData = new UserData();
		userData.getData(new InfoAdapter(info));
		        System.out.println(userData.getNomecompleto());
				System.out.println(userData.getEta());
		System.out.println("------------------------ ESERCIZIO 2 --------------------------------");
		Autore autore1 = new Autore("Mario", "Rossi");
		Autore autore2 = new Autore("Anna", "Verdi");

		Pagina pagina1 = new Pagina("Contenuto pagina 1");
		Pagina pagina2 = new Pagina("Contenuto pagina 2");
		Pagina pagina3 = new Pagina("Contenuto pagina 3");

		Sezione sezione1 = new Sezione("Introduzione");
		sezione1.aggiungiElemento(pagina1);
		sezione1.aggiungiElemento(pagina2);

		Sezione sezione2 = new Sezione("Capitolo 1");
		sezione2.aggiungiElemento(pagina3);

		List<Autore> autori = new ArrayList<>();
		autori.add(autore1);
		autori.add(autore2);

		Libro libro = new Libro("Biografia", autori, 19.99);
		libro.aggiungiElemento(sezione1);
		libro.aggiungiElemento(sezione2);

		System.out.println("Stampo il libro:");
		        libro.stampare();
		sezione2.stampare();
		System.out.println("Numero di pagine libro:"+libro.getTitolo()+"= "+libro.numeroPagine());
	}

}
