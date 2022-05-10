package com.fca.calidad.doubles;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;

public class FakeDAOAlumnoTest {
	
	private FakeMySQLAlumnoDAO dao; 
	private Alumno alumno;
	
	public HashMap<Integer,Alumno> alumnos_db; 
	

	@Before
	public void setUp() throws Exception {
		dao = Mockito.mock(FakeMySQLAlumnoDAO.class);
	    alumnos_db = new HashMap<Integer, Alumno>();
	   
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createAlumnoTest() {
		//int id, String nombre, int edad, String email
		alumno = new Alumno(1,"nombre",15,"email");
		
		
		
		when(dao.addAlumno(any(Alumno.class))).thenAnswer(new Answer<Boolean>(){
			
			
		public Boolean answer(InvocationOnMock invocation)throws Throwable{
		Alumno arg = (Alumno) invocation.getArguments()[0];
		Integer id= arg.getId();
		alumnos_db.put(id, arg);
		return true; 
		}
		});
		
		
		
		//Ejercitar el codigo 
			int oldsize = alumnos_db.size();
		    dao.addAlumno(alumno);
			int newSize = alumnos_db.size();
			
			//verificar
			assertThat(newSize, is(oldsize+1));
		
		}

}
