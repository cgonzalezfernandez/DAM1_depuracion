package test;

import org.junit.Before;
import org.junit.Test;

import Depuracion.Practica_Unit;

public class Test2 {
	
Practica_Unit prac;

@Before
public void setUp() {
	 prac = new Practica_Unit();
}

@Test
public void comprobarsuma() {
	
	prac.operaciones(1, 2, '1');
	
	
}

@Test
public void comprobarresta() {
	
	prac.operaciones(1, 2, '2');
	
	
}

@Test
public void comprobarmultiplicacion() {
	
	prac.operaciones(5, 2, '3');
	
}

@Test
public void comprobardivisioncero() {
	
	prac.operaciones(1, 0, '4');
	
	
}

@Test
public void comprobardivision() {
	
	prac.operaciones(8, 2, '4');
	
	
}

@Test
public void comprobaropciondiferente() {
	
	prac.operaciones(2, 2, '6');
	
	
}


}
