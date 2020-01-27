package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Depuracion.Num_Primo;
import Depuracion.Practica_Unit;
import junit.framework.TestCase;

public class Practica_UnitTest {
	Practica_Unit prac;

	 @Before
	 public void setUp() {
		 
		 prac=new Practica_Unit();
		 
	 }

	
	@Test
	public void sumar() {
		prac.operaciones(1, 1, '1');
		
		
		
	}
	@Test
	public void restar() {
		
		prac.operaciones(1, 3, '2');
		
		
	}
	@Test
	public void multiplicar() {
		
		prac.operaciones(3, 5, '3');
		
		
	}
	@Test
	public void division() {
		
		prac.operaciones(2, 4, '4');
		
	}

	
		

}
