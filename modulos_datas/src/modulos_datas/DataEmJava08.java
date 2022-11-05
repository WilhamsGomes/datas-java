package modulos_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DataEmJava08 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		
		Instant inicio = Instant.now();
		System.out.println("Antes do sleep");
		Thread.sleep(2000);
		System.out.println("Depois do sleep");
		Instant iFinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em horas: " + duracao.toHours());
		
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		
		
		
	}
	
}
