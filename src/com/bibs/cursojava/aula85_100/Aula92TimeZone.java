package com.bibs.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for(String fuso : fusos) {
//			System.out.println(fuso);
//		}
		
		// configurar um fuso horario:
		TimeZone tzIran = TimeZone.getTimeZone("Iran");
		
		System.out.println(tzIran.getDisplayName());
		System.out.println(tzIran.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraIran = Calendar.getInstance(tzIran);
		System.out.println(agoraIran.getTimeZone());
		System.out.println(sdf.format(agoraIran.getTime()));
		
		agoraIran.add(Calendar.HOUR_OF_DAY, tzIran.getOffset(System.currentTimeMillis()) / 1000 / 60 / 60);
	}

}
