package programa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import entidades.Product;

public class Main {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2024, Month.FEBRUARY, 29);
		
		System.out.println(ld1);
		System.out.println(ld2);
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(9, 40, 50);
		System.out.println(lt1);
		System.out.println(lt2);
		
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(ld2, lt2);
		System.out.println(ldt1);
		System.out.println(ldt2);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld1.format(dtf1));
		System.out.println(ld2.format(dtf1));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH'h'mm'min'");
		System.out.println(lt1.format(dtf2));
		System.out.println(lt2.format(dtf2));
		
		// conversão de strings para LocalDate
		String s1 = "2024-10-10";
		String s2 = "10/10/2024";
		
		LocalDate ld3 = LocalDate.parse(s1);
		LocalDate ld4 = LocalDate.parse(s2, dtf1);
		
		System.out.println(ld3);
		System.out.println(ld4);
		
		// diferença entre datas
		LocalDate dataNasc = LocalDate.of(2004, Month.OCTOBER, 29);
		LocalDate dataAtual = LocalDate.now();
		
		Period diff = Period.between(dataNasc, dataAtual);
		
		System.out.println("Diff Anos = " + diff.getYears());
		System.out.println("Diff Meses = " + diff.getMonths());
		System.out.println("Diff Dias = " + diff.getDays());
		
		// l = long
		Product p1 = new Product (1L, "Notebook", 5000.00, 10);
		System.out.println("Produto p1 = " + p1);
		
		Product p2 = p1;
		System.out.println("Produto p2 = " + p2);
		
		if (p1.equals(p2))
			System.out.println("Produtos iguais");
		else
			System.out.println("Produtos diferentes");
		
		if (p1 == p2)
			System.out.println("Referências iguais");
		else
			System.out.println("Referências diferentes");
		
		// os dois objetos apontam para o mesmo lugar, logo, ao atribuir outro valor a um atributo, o valor dos dois
		// objetos muda pois eles apontam pra mesma referência/objeto
		p2.setName("Desktop");
		System.out.println("Produto p1 = " + p1);
		System.out.println("Produto p2 = " + p2);	
	}
}
