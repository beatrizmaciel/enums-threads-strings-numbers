package com.bibs.cursojava.aula54;

public class TesteEnum {

	public static void main(String[] args) {
		

		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(11, 3, 2022, DiaSemana.SEXTA);
		
	}

}
