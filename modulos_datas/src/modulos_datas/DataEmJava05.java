package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava05 {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("28/10/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela Nº "+parcela+" - Data vencimento: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
	
}
