package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataEmJava04 {

	public static void main(String[] args) throws ParseException {
		
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-10-01"), LocalDate.now());
		System.out.println("Diferença de dias: " + dias);
		
	}
	
}
