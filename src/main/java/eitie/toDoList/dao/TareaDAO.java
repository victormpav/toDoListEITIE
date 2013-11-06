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
		listadoTareas[0].setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur purus odio, dapibus quis arcu at, tincidunt ornare orci. Phasellus viverra, neque eu sodales ultrices, augue sem tempus nisl, vitae congue arcu orci vitae velit. Duis quis vulputate purus. Donec mattis mi eget orci tristique imperdiet. Etiam id massa metus. Suspendisse.");
		
		listadoTareas[1]= new Tarea();
		listadoTareas[1].setId(1);
		listadoTareas[1].setTitulo("Tarea 2");
		listadoTareas[1].setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec fringilla lobortis ultricies. Mauris dictum felis eu posuere ultrices. Curabitur auctor, eros quis malesuada dapibus, quam enim ultrices ligula, vitae porttitor erat leo et mi. Sed a placerat erat, fringilla pretium nunc. Nam commodo libero sit amet turpis ornare, fringilla rhoncus libero lacinia. Curabitur non justo vitae dui blandit euismod. In id enim non tellus consequat malesuada nec ut turpis. Nunc imperdiet est eu elit auctor, vel semper quam scelerisque. Cras pharetra tincidunt lorem eu laoreet. Nunc sollicitudin at nunc non consequat.\n"
										+"Mauris luctus pellentesque mauris non placerat. Suspendisse mattis ante eget ipsum elementum bibendum. Sed in nulla et eros porta gravida. Aenean nec malesuada ligula. Proin sodales felis sapien, eget euismod sem volutpat ut. Vestibulum sit amet viverra lorem, vel tincidunt nisl. Proin suscipit felis quis dui gravida suscipit. Vivamus lobortis, enim sed condimentum aliquam, odio mi pellentesque justo, et.");
		
		
		listadoTareas[2]= new Tarea();
		listadoTareas[2].setId(2);
		listadoTareas[2].setTitulo("Tarea 3");
		listadoTareas[2].setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vehicula molestie diam, in eleifend odio vestibulum at. Phasellus vitae venenatis diam. Donec sed eros sagittis, malesuada sapien nec, placerat velit. Morbi quis rhoncus dui, ut tincidunt erat. Donec egestas nibh eget tellus lobortis consequat. Mauris a placerat tortor. Nunc ultricies felis urna. Suspendisse bibendum elementum viverra. Sed risus metus, posuere at justo a, ultrices fringilla metus. Mauris convallis elit in turpis euismod lobortis. Nam tincidunt varius quam eget consectetur. Etiam varius enim volutpat lacus consectetur, ac semper erat elementum. Aliquam urna ante, blandit quis dolor id, faucibus posuere nisi. Curabitur.");
			
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
