package modulos_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DataEmJava09 {

	public static void main(String[] args) throws ParseException{
		
		LocalDate dataAntiga = LocalDate.of(2020, 8, 15);
		LocalDate dataNova = LocalDate.of(2021, 7, 20);
		
		System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é menor data nova? " + dataAntiga.isBefore(dataNova));
		System.out.println("Datas são iguais? " +dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Dias nesse período: " + periodo.getDays());
		System.out.println("Meses nesse período: " + periodo.getMonths());
		System.out.println("Anos nesse período: " + periodo.getYears());
		
		System.out.println("Meses total no período: " + periodo.toTotalMonths());
		
		System.out.println("Período: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e "+periodo.getDays()+" dias");
		
	}
	
}
