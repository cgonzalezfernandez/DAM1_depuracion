package Depuracion;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Practica_Unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2;
		int resultado = 0;
		int opcion;
		System.out.println("Introduce un n�mero");
			num1=entrada.nextInt();
				System.out.println("Introduce otro n�mero");
					num2=entrada.nextInt();
		
					System.out.println("Introduce una opcion: \n"
							+ "1 Suma \n"
							+ "2 Resta \n"
							+ "3 Multiplicaci�n \n"
							+ "4 Divisi�n \n"
							+ "5 Salir");
		
		opcion=entrada.nextInt();
		 
		switch (opcion) {
			case 1:
				resultado= num1+num2;
				break;
			case 2:
				resultado= num1-num2;
				break;
			case 3:
				resultado= num1*num2;
				break;
			case 4:
				if (num2!=0) {
					resultado= num1/num2;
				}else {
				System.out.println("ERROr");
				}
				break;
			default: 
				System.out.println("Opci�n no v�lida");
		}
		System.out.println("El resultado es " + resultado);
	}

		// Ten�is que hacer un switch case con cuatro opciones. Para cada una de ellas har�is la suma,                                     
	   //resta, multiplicaci�n y divisi�n de dos n�meros. Posteriormente, en clase haremos la clase de test para
	//comprobar el correcto funcionamiento
		public static void operaciones(int num1, int num2, int opcion) {
			// TODO Auto-generated method stub
	
			
			
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
