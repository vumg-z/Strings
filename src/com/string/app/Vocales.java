package com.string.app;

public class Vocales extends Strings {
	
	public static int contarVocales(String cadena ) {
		
		int nVocales = 0;
		
		for(int index = 0; index<cadena.length(); index++) {
			switch(cadena.charAt(index)) {
				case 'a':case 'e':case 'i':case 'o':case 'u':
					nVocales++;
			}
			}
		
		return nVocales;
	}
	
	public static char[] vocalesMayusculas(String cadena) {
		
			char[] arreglo = cadena.toCharArray();
			char letra;
			
			for(int i = 0; i<arreglo.length; i++) {
				letra = arreglo[i];
				switch(letra) {
					case 'a': arreglo[i] = 'A'; break;
					case 'e': arreglo[i] = 'E'; break;
					case 'i': arreglo[i] = 'I'; break;
					case 'o': arreglo[i] = 'O'; break;
					case 'u': arreglo[i] = 'U'; break;
				}
				}
			
		return arreglo; 
	}
	
	public static char[] vocalesEliminar(String cadena) {
		
		char arreglo[] = cadena.toCharArray();
		
		char letra;
		
		for(int i = 0; i<arreglo.length; i++) {
			letra = arreglo[i];
			switch(letra) {
				case 'a': arreglo[i] = ' '; break;
				case 'e': arreglo[i] = ' '; break;
				case 'i': arreglo[i] = ' '; break;
				case 'o': arreglo[i] = ' '; break;
				case 'u': arreglo[i] = ' '; break;
			}
			}
		
		return arreglo;
	}
	

	
}
