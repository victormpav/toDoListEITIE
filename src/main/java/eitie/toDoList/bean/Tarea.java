package eitie.toDoList.bean;

public class Tarea {
	
	int 	ID;
	String 	TITULO;
	String 	DESCRIPCION;
		
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
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int RESULT = 1;
		RESULT = PRIME * RESULT + ID;
		return RESULT;
	}
	
	@Override
	public boolean equals(Object OBJ) {
		if (this == OBJ)
			return true;
		if (OBJ == null)
			return false;
		if (getClass() != OBJ.getClass())
			return false;
		Tarea OTHER = (Tarea) OBJ;
		if (ID != OTHER.ID)
			return false;
		return true;
	}
	
}

