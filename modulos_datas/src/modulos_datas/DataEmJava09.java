package modulos_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DataEmJava09 {

	public static void main(String[] args) throws ParseException{
		
		LocalDate dataAntiga = LocalDate.of(2020, 8, 15);
		LocalDate dataNova = LocalDate.of(2021, 7, 20);
		
		System.out.println("Data antiga � maior que data nova? " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga � menor data nova? " + dataAntiga.isBefore(dataNova));
		System.out.println("Datas s�o iguais? " +dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Dias nesse per�odo: " + periodo.getDays());
		System.out.println("Meses nesse per�odo: " + periodo.getMonths());
		System.out.println("Anos nesse per�odo: " + periodo.getYears());
		
		System.out.println("Meses total no per�odo: " + periodo.toTotalMonths());
		
		System.out.println("Per�odo: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e "+periodo.getDays()+" dias");
		
	}
	
}
