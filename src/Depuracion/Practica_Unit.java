package Depuracion;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Practica_Unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner entrada=new Scanner(System.in);
		 int num1,num2;
		 char opcion;
		 
		System.out.println("DAME LOS OPERANDOS:");
		System.out.println("");
		System.out.println("DAME UN NUMERO ENTERO (Operando1)");
		num1=entrada.nextInt();
		System.out.println("DAME UN NUMERO ENTERO (Operando2)");
		num2=entrada.nextInt();
		
		System.out.println("LAS OPCIONES QUE PUEDES USAR SON:");
		System.out.println("");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACION");
		System.out.println("4. DIVISIÓN");
		System.out.println("");
		System.out.println("¿QUE OPCION DESEAS ESCOGER?");
		opcion=entrada.next().charAt(0);
		
		operaciones(num1,num2,opcion);
	
	}


		
		
			
		
		// Tenéis que hacer un switch case con cuatro opciones. Para cada una de ellas haréis la suma,                                     
	   //resta, multiplicación y división de dos números. Posteriormente, en clase haremos la clase de test para
	//comprobar el correcto funcionamiento
		public static void operaciones(int num1, int num2, char opcion) {
			// TODO Auto-generated method stub
			
			switch (opcion) {
			case '1' :
				
				System.out.println(" La suma es:  "+(num1+num2));
				
				break;
				
			case '2': 
				System.out.println("La resta  es:  "+(num1-num2));
				break;
				
			case '3' :
				
				System.out.println("La multiplicacion " +(num1*num2));
					break;
					
			case '4':
				
				if (num2!=0) {
					
					System.out.println("La division es :"+(num1/num2));
					
				}else {
					
					System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
				}
				
					break;
			default:
				
				System.out.println("OPCION INCORRECTA");
		break;
			}
			
		}
		
		
		
		
		//Comparar cadenas de caracteres
		
		public static boolean compararNombresPropios(String nombre, int valor) {
			
			String miNombre = "Carlos";
//			System.out.print("Introduce un el nombre de la persona a comparar ");
//			Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
//			String nameO = entradaEscaner.next(); //Invocamos
			
			//Si es par
			if(valor %2 ==0) {
			
				if(nombre.equalsIgnoreCase(miNombre)) {
					
					System.out.println("Los nombres son iguales");
					return true;
					
				}else {
					//.....concatenad el valor pasado al string 'miNombre' con el mensaje "no es el buscado' y lo pintais
					//método .concat()
					System.out.println("Vuelve a probar otra vez, pues, no has acertado con el nombre");
				}
			}else {
				
				System.out.println("No habéis eleido un número par");
			}
			return false;
			
		}
		
		public static void temperaturaAtmosferica(int temperatura, boolean nevando, String destino ) {
			
			if (temperatura > 25) {
			    // Si la temperatura es mayor que 25 ...
			    System.out.println("A la playa!!!");
			    
			} else if (temperatura > 15) {
			    // si es mayor que 15 y no es mayor que 25 ..
			    System.out.println("A la montaña!!!");
			    
			} else if (temperatura < 5 && nevando) {
			    // si es menor que 5 y está nevando y no es mayor que 15 ni mayor que 25
			    System.out.println("A esquiar si está nevando!!!");
			    
			    if(destino.equalsIgnoreCase("Campoo")) {
			    	System.out.println("Nos vamos a la nieve a Cantabria");
			    }else if(destino.equalsIgnoreCase("Baqueira")) {
			    	
			    	System.out.println("Nos vamos a la nieve a Baqueira");
			    }
			    
			} else if (temperatura < 5 && !nevando) {
			    // si es menor que 5 pero no está nevando, no se puede esquiar
			    System.out.println("Habrá que esperar para ir a esquiar");
			    
			} else {
			    // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
			    System.out.println("A descansar... zZz");
			}			
			
			
			
		} 
}
