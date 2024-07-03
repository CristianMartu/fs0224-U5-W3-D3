package cristianmartucci.U5_W3_D3.Es2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Libro libro = new Libro();
        libro.aggiungiAutore("Cristian Martucci");
        libro.aggiungiAutore("Davide Abbadessa");
        libro.aggiungiAutore("Alessio Vulpinari");
        libro.setPrezzo(29.33);

        Pagina pagina1 = new Pagina(1);
        Pagina pagina2 = new Pagina(2);

        Sezione sezione1 = new Sezione("Sezione 1");
        Sezione sezione2 = new Sezione("Sezione 2");

        sezione1.aggiungi(pagina1);
        sezione2.aggiungi(pagina2);
        sezione2.aggiungi(sezione1);

        libro.aggiungiComponente(sezione2);
        libro.stampa();
        System.out.println(libro.getNumeroPagina());
        System.out.println(libro.getPrezzo());
    }
}
