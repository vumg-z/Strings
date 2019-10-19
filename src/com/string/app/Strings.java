package com.string.app;

import java.util.Scanner;

public class Strings {
	
	public static void main(String[] pinchiovni) {
		
		//ingresar una cadena y contar cuantas vocales hay
		
		//ingresar una cadena y poner todas las vocales en mayusculas
		
		String cadena = "";
		
		Scanner input = new Scanner(System.in);
		
		//pedir los datos
			System.out.println("Ingresa una cadena");
			cadena = input.next();
			
			
		//output
			System.out.println(Vocales.contarVocales(cadena));
			System.out.println(Vocales.vocalesMayusculas(cadena));
			
		
	}
}
