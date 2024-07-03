package cristianmartucci.U5_W3_D3.es2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Libro {
    private List<ComponenteLibro> contenuto;
    private List<String> autori;
    private double prezzo;

    public Libro() {
        this.contenuto = new ArrayList<>();
        this.autori = new ArrayList<>();
    }

    public void aggiungiAutore(String autore){
        autori.add(autore);
    }

    public void rimuoviAutore(String autore){
        autori.remove(autore);
    }

    public void aggiungiComponente(ComponenteLibro componenteLibro){
        contenuto.add(componenteLibro);
    }

    public void rimuoviComponente(ComponenteLibro componenteLibro){
        contenuto.remove(componenteLibro);
    }

    public void stampa(){
        System.out.println("Libro");
        for (String autore: autori){
            System.out.println(autore);
        }
        for(ComponenteLibro componenteLibro: contenuto){
            componenteLibro.stampa();
        }
    }

    public int getNumeroPagina(){
        int numeroPagine = 0;
        for (ComponenteLibro componenteLibro: contenuto){
            numeroPagine += componenteLibro.getNumeroPagina();
        }
        return numeroPagine;
    }
}
