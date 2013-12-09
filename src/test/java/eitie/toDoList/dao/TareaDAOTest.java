package eitie.toDoList.dao;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;

import org.junit.Test;

import static org.junit.Assert.*;


public class TareaDAOTest {
	
	@Test
	public void testGetById (){
		TareaDAO tareaDAO = TareaDAO.getInstance();
		
		Tarea tareaEsperada = new Tarea();
		tareaEsperada.setId(0);
		tareaEsperada.setTitulo("Tarea 1");
		tareaEsperada.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur purus odio, dapibus quis arcu at, tincidunt ornare orci. Phasellus viverra, neque eu sodales ultrices, augue sem tempus nisl, vitae congue arcu orci vitae velit. Duis quis vulputate purus. Donec mattis mi eget orci tristique imperdiet. Etiam id massa metus. Suspendisse.");
				
		Tarea tareaObtenida= tareaDAO.getById(0);
		
		assertEquals(tareaEsperada, tareaObtenida);
	}
	
	@Test
	public void testBorrado (){
		TareaDAO tareaDAO = TareaDAO.getInstance();
		
		assertNotEquals(null, tareaDAO.getById(0));
		tareaDAO.borrar(0);
		assertEquals(null, tareaDAO.getById(0));
	}
}
