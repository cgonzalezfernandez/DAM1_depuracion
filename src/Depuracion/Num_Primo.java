package Depuracion;

import java.util.ArrayList;
import java.util.Scanner;

public class Num_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saludar();
		System.out.print("Introduce un n�mero para averiguar si es primo o no ");
		 
		int num = pedir_numero();
		 
		 comprobar_primo(num);
		 
		 int suma = suma(num);
		 System.out.println("Se incrementa el n�mero en 15 unidades"+ ":"+" "+ suma);
	}


		public static int pedir_numero() {
		// TODO Auto-generated method stub
			
			Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
			int num = entradaEscaner.nextInt(); //Invocamos
		    return num;
	}


		public static boolean comprobar_primo(int num) {
			
			int[] divisores =new int[15];
			boolean primoB = true; 
			int posicion=0;
			
			for(int i = 2; i <num; i++) {
				if (num % i == 0) {
					primoB = false;
					//Vamos guardando los divisores en un array
					divisores[posicion]=i;
					posicion++;
					//break;
				}
			}
			if (primoB) {
				System.out.print("El n�mero es primo \n");
			}else {
				System.out.print("El n�mero no es primo \n");
				System.out.printf("Los divisores del n�mero \n");
			}
			for (int i = 0; i < posicion; i++) {
				
				System.out.printf(divisores[i]+"\n");
			}
			return primoB;
		}
			
		
		
		public static int suma(int num) {
			// TODO Auto-generated method stub
			
			return num+15;
		}
		public static void saludar() {
			// TODO Auto-generated method stub
			
			System.out.println("Buenos dias Ceinmark soy Moroni");
		}
		//Hola a los de primero de DAM, suerte con la asignatura---18:51
}
