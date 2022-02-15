package com.bibs.cursojava.aula72;

public class TiqueTaque {
	
	boolean tique;
	
	synchronized void tique(boolean estaExecutando) {
		
		if(!estaExecutando) {
			tique = true;
			notify();
			return;
		}
		
		System.out.print("Tique ");
		
		tique = true;
		
		notify();
		
		while(tique) {
			try {
				// o método wait() precisa de um try/catch
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void taque(boolean estaExecutando) {
		
		if(!estaExecutando) {
			tique = false;
			notify();
			return;
		}
		
		System.out.println("Taque ");
		
		tique = false;
		
		notify();
		
		while(!tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * O notify() e o wait() servem para sincronizar as threads
 * */
