package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava03 {

	public static void main(String[] args) throws ParseException{
		
		Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/
		
		/*Simular que data vem do banco de dados*/
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println("Somando dia: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 5);
		System.out.println("Somando mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		System.out.println("Somando ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}
	
}
