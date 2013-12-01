package eitie.toDoList.form;

import org.apache.struts.action.ActionForm;

public class TareaForm extends ActionForm {
	
	private static final long serialVersionUID = 3442846809513724379L;
	
	private int id;
	private String titulo;
	private String descripcion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
}
