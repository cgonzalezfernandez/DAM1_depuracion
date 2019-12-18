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
import junit.framework.TestCase;

public class Num_PrimoTest {
	Num_Primo prim;

	 @Before
	 public void setUp() {
		 prim = new Num_Primo();
	 }

	
	@Test
	public void primos() {
		
		boolean primo = prim.comprobar_primo(11);
		//Assert.assertTrue(primo);
		
		
	}
	@Test
	public void pedir_numero() {
		
		prim.pedir_numero();
		//Assert.assertTrue(true);
		
		
	}
	@Test
	public void no_primos() {
		
		boolean primo = prim.comprobar_primo(25);
//		Assert.assertFalse(primo);
		
		
	}
		
	@Test
	public void primos_suma() {
		
		int s = prim.suma(20);
		Assert.assertEquals(35, s);
	}
	
	@Test
	public void compararNombres() {
		
		Assert.assertTrue(prim.compararNombres());
		
	}
		

}
