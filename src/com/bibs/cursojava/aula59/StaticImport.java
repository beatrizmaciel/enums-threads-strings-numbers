package com.bibs.cursojava.aula59;

import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow(a, b)); // elevado
		
		System.out.println(Math.sqrt(c)); // raiz quadrada
	
		System.out.println(pow(a,b));
		
		System.out.println(sqrt(c));
	}

}

/**
 * Todos os métodos da classe Math são estáticos, porque não 
 * precisamos instanciar eles.
 */