package com.clases;

public class Aplicacion {
	public static void main (String args []) {
	//Demostracion del método estatico esPar()
		int num1 = 14;
		if (Algoritmos.esPar(num1)) {
			System.out.println("El numero "+num1+" es par.");
		}
		else
			System.out.println("El numero "+num1+" no es par.");
		
	//Demostracion del método estático esPrimo()
		
		int num2 = 11;
		if (Algoritmos.esPrimo(num2)) {
			System.out.println("El numero "+num2+" es primo.");			
		}
		else
			System.out.println("El numero "+num2+" no es primo.");
	
	//Demostracion del método estático stringEnReversa()
		
		String cadena1 = "odnuM aloH";
		String reverso  = Algoritmos.stringEnReversa(cadena1);
		System.out.println(reverso);
		
	//Demostracion del método estático esPalindromo()
		
		String cadena2 = "aibofobia";
		if (Algoritmos.esPalindromo(cadena2))
			System.out.println("El string "+cadena2+" es palindromo.");
		else
			System.out.println("El string "+cadena2+" no es palindromo.");
	
	//Demostración del método estático secuenciaFizzBuzz()
		
		int num3 = 50;
		Algoritmos.secuenciaFizzBuzz(num3);
	
	}
}
