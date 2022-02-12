package com.bibs.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		// tipos primitivos
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 1000;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'w';

		// classes que empacotam (wrappers) tipos primitivos:
		
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(false);
		Character b = new Character('y');
		Integer num13 = new Integer("10000");
		Double num14 = new Double("3.45");
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		int num16 = Integer.parseInt("10000");
		double num17 = Double.parseDouble("3.455");
		
		System.out.println(num17);
		
		// transforma um tipo inteiro primitivo em uma instancia da classe Integer:
		Integer num18 = Integer.valueOf(1343);
		
		System.out.println(num9.equals(num13));
		
	}

}

/**
 * Wrappers são classes do Java e não comparamos instâncias de classes
 * utilizando operadores ==, mas sim o método .equals (linha 42)
 * */
