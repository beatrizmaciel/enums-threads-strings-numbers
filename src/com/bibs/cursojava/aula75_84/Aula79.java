package com.bibs.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('x')); // retorna -1 (negativo)
		System.out.println(banana.indexOf('a')); // retorna o índice 1
		System.out.println(banana.indexOf('b')); // retorna o índice 0
		
		System.out.println(banana.indexOf(ana)); // começa no índice 1
		
		System.out.println(banana.lastIndexOf('a')); // último índice de 'a'
		System.out.println(banana.lastIndexOf(ana)); // retorna o índice 3
		
		System.out.println(banana.contains(ana)); // true
		System.out.println(banana.contains("ceu")); // false
		

	}

}
