package modulos_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava10 {

	public static void main(String[] args) throws ParseException{
		
		LocalDate dataBase = LocalDate.parse("2022-10-28");
		
		/* System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: " +(dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusMonths(5)));
		
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		System.out.println("Menos 1 mês: " + (dataBase = dataBase.minusMonths(1)));*/
		
		for (int data = 1; data <= 12; data++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Parcela Nº " +data+" - "+dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		
	}
	
}
