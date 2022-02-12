package com.bibs.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(1, 2));
		
		int[] vetor = {1, 2, 3, 4, 5, 6};
		System.out.println(soma(vetor));
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	
	static int soma(int[] vetor) {
		int total = 0;
		for (int i=0; i<vetor.length;i++) {
			total += vetor[i];
		}
		
		return total;
	}
	
	// Vararg:
	static int soma(Integer... vetor) {
		int total = 0;
		for (int i=0; i<vetor.length;i++) {
			total += vetor[i];
		}
		
		return total;
	}
}

/** 
 * Varargs = recurso da linguagem Java que permite passar
 * infinitos parâmetros para um método sem ter que declarar todos eles.
 */