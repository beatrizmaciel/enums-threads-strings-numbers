package com.bibs.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		// % indica o tipo de dado. %s para String
		System.out.printf("%s", "Olá, Mundo");
		System.out.println();
		// % uppercase
		System.out.printf("%S", "Olá, Mundo");
		// %n , pular linha
		System.out.printf("%n");
		// %c, caracteres
		System.out.printf("%c", 'o');
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println();
		
		// %f , ponto flutuante
		double pontoFlutuante = 3.146423;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		// adicionando (4) casas decimais:
		System.out.printf("%.4f", pontoFlutuante);
		System.out.println();
		
		String olaMundo = "Olá, Mundo";
		// %9... adicionando caracteres
		System.out.printf("%20s", olaMundo);
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo);
		
		System.out.printf("%n");
		System.out.printf("%+d", valor);
		
		System.out.printf("%n");
		// configura a quantidade de números. saída: 000000123456789
		System.out.printf("%015d", valor);
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {100, 12.35, 4324.1, 4, 54};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}

}
