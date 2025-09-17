package eitie.toDoList.dao;


import java.util.ArrayList;
import java.util.Collection;

import eitie.toDoList.bean.Tarea;

public class TareaDAO {
	
	private static TareaDAO INSTANCE = new TareaDAO();
	private int NEXTID;
	private ArrayList<Tarea> LISTADOTAREAS;
	
	
	private TareaDAO() {
		LISTADOTAREAS = new ArrayList<Tarea>();
		Tarea TAREA = new Tarea();
		
		TAREA.setId(0);
		TAREA.setTitulo("Tarea 1");
		TAREA.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur purus odio, dapibus quis arcu at, tincidunt ornare orci. Phasellus viverra, neque eu sodales ultrices, augue sem tempus nisl, vitae congue arcu orci vitae velit. Duis quis vulputate purus. Donec mattis mi eget orci tristique imperdiet. Etiam id massa metus. Suspendisse.");
		LISTADOTAREAS.add(TAREA);
		
		TAREA = new Tarea();
		TAREA.setId(1);
		TAREA.setTitulo("Tarea 2");
		TAREA.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec fringilla lobortis ultricies. Mauris dictum felis eu posuere ultrices. Curabitur auctor, eros quis malesuada dapibus, quam enim ultrices ligula, vitae porttitor erat leo et mi. Sed a placerat erat, fringilla pretium nunc. Nam commodo libero sit amet turpis ornare, fringilla rhoncus libero lacinia. Curabitur non justo vitae dui blandit euismod. In id enim non tellus consequat malesuada nec ut turpis. Nunc imperdiet est eu elit auctor, vel semper quam scelerisque. Cras pharetra tincidunt lorem eu laoreet. Nunc sollicitudin at nunc non consequat.\n"
										+"Mauris luctus pellentesque mauris non placerat. Suspendisse mattis ante eget ipsum elementum bibendum. Sed in nulla et eros porta gravida. Aenean nec malesuada ligula. Proin sodales felis sapien, eget euismod sem volutpat ut. Vestibulum sit amet viverra lorem, vel tincidunt nisl. Proin suscipit felis quis dui gravida suscipit. Vivamus lobortis, enim sed condimentum aliquam, odio mi pellentesque justo, et.");
		LISTADOTAREAS.add(TAREA);
		
		TAREA = new Tarea();
		TAREA.setId(2);
		TAREA.setTitulo("Tarea 3");
		TAREA.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vehicula molestie diam, in eleifend odio vestibulum at. Phasellus vitae venenatis diam. Donec sed eros sagittis, malesuada sapien nec, placerat velit. Morbi quis rhoncus dui, ut tincidunt erat. Donec egestas nibh eget tellus lobortis consequat. Mauris a placerat tortor. Nunc ultricies felis urna. Suspendisse bibendum elementum viverra. Sed risus metus, posuere at justo a, ultrices fringilla metus. Mauris convallis elit in turpis euismod lobortis. Nam tincidunt varius quam eget consectetur. Etiam varius enim volutpat lacus consectetur, ac semper erat elementum. Aliquam urna ante, blandit quis dolor id, faucibus posuere nisi. Curabitur.");
		LISTADOTAREAS.add(TAREA);
		
		NEXTID = 3;
	}
	
	public static TareaDAO getInstance() {
		return INSTANCE;
	}
	
	/**
	  * Obtiene un elemento de la lista de tareas.
	  *
	  * @param id de la tarea a recuperar
	  */
	public Tarea getById(Integer ID) {
		Tarea TAREA = new Tarea();
		TAREA.setId(ID);
		int INDEX = LISTADOTAREAS.indexOf(TAREA);
		if(INDEX==-1) {
			return null;
		}
		else {
			return LISTADOTAREAS.get(INDEX);
		}
	}
	
	/**
	  * Obtiene la lista completa de tareas
	  */
	public Collection<Tarea> getAll() {
		return LISTADOTAREAS;
	}
	
	/**
	  * Inserta una tarea en la lista
	  *
	  * @param tarea La tarea a insertar
	  */
	public void crear(Tarea TAREA) {
		TAREA.setId(NEXTID);
		LISTADOTAREAS.add(TAREA);
		NEXTID++;
	}
	
	/**
	  * Actualiza una tarea en la lista
	  *
	  * @param tarea La tarea a actualizar
	  */
	public void actualizar(Tarea TAREA) {
		int INDEX = LISTADOTAREAS.indexOf(TAREA);
		Tarea TAREAOLD = LISTADOTAREAS.get(INDEX);
		TAREAOLD.setTitulo(TAREA.getTitulo());
		TAREAOLD.setDescripcion(TAREA.getDescripcion());
	}
	
	/**
	  * Borra un elemento de la lista de tareas
	  *
	  * @param id de la tarea a borrar
	  */	public void borrar(Integer ID) {
		Tarea TAREA = new Tarea();
		TAREA.setId(ID);
		LISTADOTAREAS.remove(TAREA);
	}
	
}
