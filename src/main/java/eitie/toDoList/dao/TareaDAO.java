package eitie.toDoList.dao;


import java.util.ArrayList;
import java.util.Collection;

import eitie.toDoList.bean.Tarea;

public class TareaDAO {
	
	private static TareaDAO INSTANCE = new TareaDAO();
	private int nextId;
	private ArrayList<Tarea> listadoTareas;
	
	
	private TareaDAO() {
		listadoTareas = new ArrayList<Tarea>();
		Tarea tarea = new Tarea();
		
		tarea.setId(0);
		tarea.setTitulo("Tarea 1");
		tarea.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur purus odio, dapibus quis arcu at, tincidunt ornare orci. Phasellus viverra, neque eu sodales ultrices, augue sem tempus nisl, vitae congue arcu orci vitae velit. Duis quis vulputate purus. Donec mattis mi eget orci tristique imperdiet. Etiam id massa metus. Suspendisse.");
		listadoTareas.add(tarea);
		
		tarea = new Tarea();
		tarea.setId(1);
		tarea.setTitulo("Tarea 2");
		tarea.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec fringilla lobortis ultricies. Mauris dictum felis eu posuere ultrices. Curabitur auctor, eros quis malesuada dapibus, quam enim ultrices ligula, vitae porttitor erat leo et mi. Sed a placerat erat, fringilla pretium nunc. Nam commodo libero sit amet turpis ornare, fringilla rhoncus libero lacinia. Curabitur non justo vitae dui blandit euismod. In id enim non tellus consequat malesuada nec ut turpis. Nunc imperdiet est eu elit auctor, vel semper quam scelerisque. Cras pharetra tincidunt lorem eu laoreet. Nunc sollicitudin at nunc non consequat.\n"
										+"Mauris luctus pellentesque mauris non placerat. Suspendisse mattis ante eget ipsum elementum bibendum. Sed in nulla et eros porta gravida. Aenean nec malesuada ligula. Proin sodales felis sapien, eget euismod sem volutpat ut. Vestibulum sit amet viverra lorem, vel tincidunt nisl. Proin suscipit felis quis dui gravida suscipit. Vivamus lobortis, enim sed condimentum aliquam, odio mi pellentesque justo, et.");
		listadoTareas.add(tarea);
		
		tarea = new Tarea();
		tarea.setId(2);
		tarea.setTitulo("Tarea 3");
		tarea.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vehicula molestie diam, in eleifend odio vestibulum at. Phasellus vitae venenatis diam. Donec sed eros sagittis, malesuada sapien nec, placerat velit. Morbi quis rhoncus dui, ut tincidunt erat. Donec egestas nibh eget tellus lobortis consequat. Mauris a placerat tortor. Nunc ultricies felis urna. Suspendisse bibendum elementum viverra. Sed risus metus, posuere at justo a, ultrices fringilla metus. Mauris convallis elit in turpis euismod lobortis. Nam tincidunt varius quam eget consectetur. Etiam varius enim volutpat lacus consectetur, ac semper erat elementum. Aliquam urna ante, blandit quis dolor id, faucibus posuere nisi. Curabitur.");
		listadoTareas.add(tarea);
		
		nextId = 3;
	}
	
	public static TareaDAO getInstance() {
		return INSTANCE;
	}
	
	/**
	  * Obtiene un elemento de la lista de tareas.
	  *
	  * @param id de la tarea a recuperar
	  */
	public Tarea getById(Integer id) {
		Tarea tarea = new Tarea();
		tarea.setId(id);
		int index = listadoTareas.indexOf(tarea);
		if(index==-1) {
			return null;
		}
		else {
			return listadoTareas.get(index);
		}
	}
	
	/**
	  * Obtiene la lista completa de tareas
	  */
	public Collection<Tarea> getAll() {
		return listadoTareas;
	}
	
	/**
	  * Inserta una tarea en la lista
	  *
	  * @param tarea La tarea a insertar
	  */
	public void crear(Tarea tarea) {
		tarea.setId(nextId);
		listadoTareas.add(tarea);
		nextId++;
	}
	
	/**
	  * Borra un elemento de la lista de tareas
	  *
	  * @param id de la tarea a borrar
	  */	public void borrar(Integer id) {
		Tarea tarea = new Tarea();
		tarea.setId(id);
		listadoTareas.remove(tarea);
	}
	
}
