package cristianmartucci.U5_W3_D3.es1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class RunnerEs1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------Es1-----------------------");
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        System.out.println(info);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.APRIL, 2);
        info.setDataDiNascita(calendar.getTime());

        System.out.println(info);

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
