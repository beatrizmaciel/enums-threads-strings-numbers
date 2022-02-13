package com.bibs.cursojava.aula65;

public @interface InformaçãoAula {

	String autor();
	int aulaNumero();
	String blog() default "http://bibs.com";
	String site();
	
}
