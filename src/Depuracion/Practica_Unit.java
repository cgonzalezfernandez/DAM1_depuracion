package Depuracion;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Practica_Unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
	
	}


		
		
			
		
		// Ten�is que hacer un switch case con cuatro opciones. Para cada una de ellas har�is la suma,                                     
	   //resta, multiplicaci�n y divisi�n de dos n�meros. Posteriormente, en clase haremos la clase de test para
	//comprobar el correcto funcionamiento
		public static void operaciones(int num1, int num2, char opcion) {
			// TODO Auto-generated method stub
			
			//switch (opcion) {
//			case value:
//				
//				break;
//
//			default:
//				break;
//			}
			
		}
		
		
		
		
		//Comparar cadenas de caracteres
		
		public static boolean compararNombresPropios(String nombre, int valor) {
			
			String miNombre = "Carlos";
//			System.out.print("Introduce un el nombre de la persona a comparar ");
//			Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
//			String nameO = entradaEscaner.next(); //Invocamos
			
			//Si es par
			if(valor %2 ==0) {
			
				if(nombre.equalsIgnoreCase(miNombre)) {
					
					System.out.println("Los nombres son iguales");
					return true;
					
				}else {
					//.....concatenad el valor pasado al string 'miNombre' con el mensaje "no es el buscado' y lo pintais
					//m�todo .concat()
					System.out.println("Vuelve a probar otra vez, pues, no has acertado con el nombre");
				}
			}else {
				
				System.out.println("No hab�is eleido un n�mero par");
			}
			return false;
			
		}
		
		public static void temperaturaAtmosferica(int temperatura, boolean nevando, String destino ) {
			
			if (temperatura > 25) {
			    // Si la temperatura es mayor que 25 ...
			    System.out.println("A la playa!!!");
			    
			} else if (temperatura > 15) {
			    // si es mayor que 15 y no es mayor que 25 ..
			    System.out.println("A la monta�a!!!");
			    
			} else if (temperatura < 5 && nevando) {
			    // si es menor que 5 y est� nevando y no es mayor que 15 ni mayor que 25
			    System.out.println("A esquiar si est� nevando!!!");
			    
			    if(destino.equalsIgnoreCase("Campoo")) {
			    	System.out.println("Nos vamos a la nieve a Cantabria");
			    }else if(destino.equalsIgnoreCase("Baqueira")) {
			    	
			    	System.out.println("Nos vamos a la nieve a Baqueira");
			    }
			    
			} else if (temperatura < 5 && !nevando) {
			    // si es menor que 5 pero no est� nevando, no se puede esquiar
			    System.out.println("Habr� que esperar para ir a esquiar");
			    
			} else {
			    // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
			    System.out.println("A descansar... zZz");
			}			
			
			
			
		} 
}
