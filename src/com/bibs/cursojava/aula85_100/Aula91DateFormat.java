package com.bibs.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class Aula91DateFormat {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
//		Locale.setDefault(new Locale("en", "US"));
		
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); //dd/MM/yyyy
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
//		String data = "12-02-2017 14:25";
//		try {
//			Date dataDate = DateFormat.getInstance().parse(data);
//			System.out.println(dataDate);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
