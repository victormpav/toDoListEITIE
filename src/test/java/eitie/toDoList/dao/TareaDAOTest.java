package eitie.toDoList.dao;

import org.junit.Test;
import static org.junit.Assert.*;


public class TareaDAOTest {
	
	@Test
	public void testBorrado (){
		TareaDAO tareaDAO = TareaDAO.getInstance();
		
		assertNotEquals(null, tareaDAO.getById(0));
		tareaDAO.borrar(0);
		assertEquals(null, tareaDAO.getById(0));
		
		
	}
}
