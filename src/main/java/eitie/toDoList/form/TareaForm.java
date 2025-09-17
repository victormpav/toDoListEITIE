package eitie.toDoList.form;

import org.apache.struts.action.ActionForm;

public class TareaForm extends ActionForm {
	
	private static final long serialVersionUID = 3442846809513724379L;
	
	private int ID;
	private String TITULO;
	private String DESCRIPCION;
	
	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getTitulo() {
		return TITULO;
	}
	
	public void setTitulo(String TITULO) {
		this.TITULO = TITULO;
	}
	
	public String getDescripcion() {
		return DESCRIPCION;
	}
	
	public void setDescripcion(String DESCRIPCION) {
		this.DESCRIPCION = DESCRIPCION;
	}	
	
}
