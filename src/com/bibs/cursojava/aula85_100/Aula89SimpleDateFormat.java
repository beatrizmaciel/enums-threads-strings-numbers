package com.bibs.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss z Z");
	
		
		Calendar data = new GregorianCalendar(2010, 2, 20, 12, 32, 22); // para instanciar uma data específica
		
		System.out.println(sdf.format(data.getTime()));
		System.out.println(sdf1.format(data.getTime()));
		System.out.println(sdf2.format(data.getTime()));
		System.out.println(sdf3.format(data.getTime()));
		
		Date hoje = new Date();
		String d = sdf.format(hoje);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		try {
			Date minhaDataEmDate = sdf4.parse(minhaData);
			System.out.println(minhaDataEmDate);
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
