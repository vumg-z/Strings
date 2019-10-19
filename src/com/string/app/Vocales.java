package com.string.app;

public class Vocales extends Strings {
	
	public static int contarVocales(String cad ) {
		
		int nVocales = 0;
		
		for(int index = 0; index<cad.length(); index++) {
			switch(cad.charAt(index)) {
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
	
}
