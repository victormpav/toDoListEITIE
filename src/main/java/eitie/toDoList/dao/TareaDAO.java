package eitie.toDoList.dao;


import java.util.ArrayList;
import java.util.Collection;

import eitie.toDoList.bean.Tarea;

public class TareaDAO {
	private Tarea listadoTareas[]= new Tarea[20];
	
	public TareaDAO() {
		listadoTareas[0]= new Tarea();
		listadoTareas[0].setId(0);
		listadoTareas[0].setTitulo("Tarea 1");
		listadoTareas[0].setDescripcion("Primera tarea de prueba");
		
		listadoTareas[1]= new Tarea();
		listadoTareas[1].setId(1);
		listadoTareas[1].setTitulo("Tarea 2");
		listadoTareas[1].setDescripcion("Segunda tarea de prueba");
	}
	
	public Tarea getById (Integer id) {
		return listadoTareas[id];
	}
	
	public Collection<Tarea> getAll () {
		Collection<Tarea> listado = new ArrayList<Tarea>();
		
		for (int i=0; i<listadoTareas.length; i++)
		{
			if (listadoTareas[i]!=null) 
				listado.add(listadoTareas[i]);
		}
		
		return listado;
	}
}
