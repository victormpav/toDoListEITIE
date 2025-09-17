package eitie.toDoList.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;
import eitie.toDoList.form.TareaForm;

public class EditarTarea extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		TareaForm TAREAFORM = (TareaForm) form;
		
		Tarea TAREA = new Tarea();
		TAREA.setId(TAREAFORM.getId());
		TAREA.setTitulo(TAREAFORM.getTitulo());
		TAREA.setDescripcion(TAREAFORM.getDescripcion());
		
		TareaDAO TAREADO = TareaDAO.getInstance();
		TAREADO.actualizar(TAREA);
		
		return mapping.findForward("success");
		
	}
	
}
