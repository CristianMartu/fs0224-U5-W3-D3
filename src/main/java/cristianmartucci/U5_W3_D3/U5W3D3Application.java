package cristianmartucci.U5_W3_D3;

import cristianmartucci.U5_W3_D3.es1.Info;
import cristianmartucci.U5_W3_D3.es1.InfoAdapter;
import cristianmartucci.U5_W3_D3.es1.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Calendar;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);

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
