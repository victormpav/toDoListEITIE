package eitie.toDoList.dao;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;

import org.junit.Test;

import static org.junit.Assert.*;


public class TareaDAOTest {
	
	@Test
	public void testGetById (){
		TareaDAO TAREADO = TareaDAO.getInstance();
		
		Tarea TAREAESPERADA = new Tarea();
		TAREAESPERADA.setId(0);
		TAREAESPERADA.setTitulo("Tarea 1");
		TAREAESPERADA.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur purus odio, dapibus quis arcu at, tincidunt ornare orci. Phasellus viverra, neque eu sodales ultrices, augue sem tempus nisl, vitae congue arcu orci vitae velit. Duis quis vulputate purus. Donec mattis mi eget orci tristique imperdiet. Etiam id massa metus. Suspendisse.");
				
		Tarea TAREAOBTENIDA= TAREADO.getById(0);
		
		assertEquals(TAREAESPERADA, TAREAOBTENIDA);
	}
	
	@Test
	public void testBorrado (){
		TareaDAO TAREADO = TareaDAO.getInstance();
		
		assertNotEquals(null, TAREADO.getById(0));
		TAREADO.borrar(0);
		assertEquals(null, TAREADO.getById(0));
	}
}
