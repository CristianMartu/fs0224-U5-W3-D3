package cristianmartucci.U5_W3_D3.es3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerEs3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------Es3-----------------------");

        Generale generale = new Generale();
        Colonnello colonnello = new Colonnello();
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        capitano.doCheck(3500);

    }
}
