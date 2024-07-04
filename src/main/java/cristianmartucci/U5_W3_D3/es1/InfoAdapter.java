package cristianmartucci.U5_W3_D3.es1;

import java.util.Calendar;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter (Info info){
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome()+ " " +info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar eta = Calendar.getInstance();
        eta.setTime(info.getDataDiNascita());
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - eta.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < eta.get(Calendar.DAY_OF_YEAR)){
            age--;
        }
        return age;
    }
}
