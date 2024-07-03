package cristianmartucci.U5_W3_D3.es2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ComponenteLibro {
    private String titolo;
    private List<ComponenteLibro> sottoElementi;

    public Sezione(String titolo){
        this.titolo = titolo;
        this.sottoElementi = new ArrayList<>();
    }

    public void aggiungi(ComponenteLibro componenteLibro){
        sottoElementi.add(componenteLibro);
    }

    public void rimuovi(ComponenteLibro componenteLibro){
        sottoElementi.remove(componenteLibro);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: "+ titolo);
        for(ComponenteLibro componenteLibro: sottoElementi){
            componenteLibro.stampa();
        }
    }

    @Override
    public int getNumeroPagina() {
        int numeroPagine = 0;
        for (ComponenteLibro componenteLibro: sottoElementi){
            numeroPagine += componenteLibro.getNumeroPagina();
        }
        return numeroPagine;
    }
}
