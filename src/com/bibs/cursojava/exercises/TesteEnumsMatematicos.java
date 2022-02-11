package com.bibs.cursojava.exercises;

public class TesteEnumsMatematicos {

	public static void main(String[] args) {
		
		double x = 2.0;
		double y = 4.0;
		
		for (EnumsMatematicos op : EnumsMatematicos.values()){
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}

}
