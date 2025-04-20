package com.clases;
import java.util.ArrayList;

public class Algoritmos {
	public static boolean esPar(int num) {
		return ((num % 2)==0);
	}
	
	public static boolean esPrimo(int num) {
		if (num <= 1) return false;
		for (int i=2; i<= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	public static String stringEnReversa(String cadena) {
		String aux ="";
		for (int i=cadena.length()-1; i >= 0; i--) {
			aux = aux+ cadena.charAt(i);
		}
		return aux;
	}
	
	public static boolean esPalindromo(String cadena) {
		String invertido = new StringBuilder(cadena).reverse().toString();
		return cadena.equals(invertido);
	}
	
	public static void secuenciaFizzBuzz(int num) {
		ArrayList<String> secuencia = new ArrayList<>();
		for (int i=1; i<=num; i++) {
			if ((i %15 == 0 )) {
				//aux = aux + " FizzBuzz,";
				//System.out.println("FizzBuzz ");
				secuencia.add("FizzBuzz");
			}
			else if ((i % 3)==0) {
				//aux = aux + " Fizz,";
				//System.out.println("Fizz ");
				secuencia.add("Fizz");
			}
			else if ((i % 5)==0) {
				//aux = aux + " Buzz,";
				//System.out.println("Buzz ");
				secuencia.add("Buzz");
			}
			else
				//aux = aux + " " + i + ",";
				//System.out.println(i + " ");
				secuencia.add(Integer.toString(i));
		}
		System.out.println(secuencia);
	}
}
