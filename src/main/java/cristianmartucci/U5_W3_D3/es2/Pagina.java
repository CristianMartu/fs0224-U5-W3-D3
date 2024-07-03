package cristianmartucci.U5_W3_D3.es2;

public class Pagina implements ComponenteLibro{

    private int numero;

    public Pagina(int numero){
        this.numero = numero;
    }

    @Override
    public void stampa() {
        System.out.println(numero);
    }

    @Override
    public int getNumeroPagina() {
        return 1;
    }
}
