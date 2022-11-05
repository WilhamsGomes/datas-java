package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava02 {

public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		Date dataAtualHoje = simpleDateFormat.parse("10/04/2021");
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não venceu ainda!");
		} else {
			System.out.println("Boleto venceu - URGENTE");
		}
		
	}
	
}
