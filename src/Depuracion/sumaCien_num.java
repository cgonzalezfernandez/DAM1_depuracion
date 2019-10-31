package Depuracion;

import java.util.ArrayList;
import java.util.Scanner;

public class sumaCien_num {

	public static void main(String[] args) {
        
        //Creo un array
        int[] numeros=new int[100];
         
        //Declaro las variables necesarias
        int suma=0;
        double media;
         
        //Recorro el array, asigno números y sumo
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        //Calculo la media y muestro la suma y la meda
        System.out.println("La suma es "+suma);
         
        media=(double)suma/numeros.length;
         
        System.out.println("La media es "+media);
         
    }
     
}
