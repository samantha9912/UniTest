package com.fca.calidad.unitest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {
	public Calculadora miCalculadora; 

	@Before
	public void setUp() throws Exception {
	  miCalculadora = new Calculadora(); 

	}

	@Test
	public void sumaTest() {
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1, 3);
		double resultadoEsperado = 14;
	
		//Verificacion, comparar resultado con resultado esperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	@Test
	public void sumaPositivosTest() {
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1, 3);
		double resultadoEsperado = 4;
	
		//Verificacion, comparar resultado con resultado esperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	@Test
	public void sumaNegativosTest() {
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-1,-3);
		double resultadoEsperado = -4;
	
		//Verificacion, comparar resultado con resultado esperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	@Test
	public void sumaCeroTest() {
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-10, 0);
		double resultadoEsperado = -10;
	
		//Verificacion, comparar resultado con resultado esperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	@Test
	public void restaTest() {
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.resta(10, 5);
		double resultadoEsperado = 5;
	
		//Verificacion, comparar resultado con resultado esperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
		@Test
		public void divisionPositivos() {
			//Ejercicio, llamada del codigo que vamos a probar
			double resultadoEjecucion = miCalculadora.division(10, 5);
			double resultadoEsperado = 2;
		
			//Verificacion, comparar resultado con resultado esperado
			assertThat(resultadoEjecucion, is(resultadoEsperado));
		}
		@Test(expected = ArithmeticException.class)
		public void divisionCeroTest() {
			//Ejercicio, llamada del codigo que vamos a probar
			double resultadoEjecucion = miCalculadora.division(-10, 0);
			
		}
		@Test
		public void multiplicacionTest() {
			//Ejercicio, llamada del codigo que vamos a probar
			double resultadoEjecucion = miCalculadora.division(10, 5);
			double resultadoEsperado = 2;
		
			//Verificacion, comparar resultado con resultado esperado
			assertThat(resultadoEjecucion, is(resultadoEsperado));
                  }
   
}
