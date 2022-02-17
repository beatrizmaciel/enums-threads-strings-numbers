package com.bibs.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.round(4.7)); // arredondar
		System.out.println(Math.round(4.4));
		
		System.out.println(Math.ceil(4.4)); // arredonda pra cima
		System.out.println(Math.ceil(4.5));
		
		System.out.println(Math.floor(4.4)); // arredonda pra baixo
		System.out.println(Math.floor(4.4));
		
		System.out.println(Math.random()); // número aleatório
		System.out.println(Math.round(Math.random() * 10)); // arredonda um número aleatório
		
		System.out.println(Math.sin(Math.toRadians(30))); // seno
		System.out.println(Math.cos(Math.toRadians(1))); // cosseno
		
		System.out.println(Math.tan(Math.toRadians(45))); // tan = tangente


	}

}
