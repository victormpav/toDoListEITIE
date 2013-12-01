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
		
		TareaForm tareaForm = (TareaForm) form;
		
		Tarea tarea = new Tarea();
		tarea.setId(tareaForm.getId());
		tarea.setTitulo(tareaForm.getTitulo());
		tarea.setDescripcion(tareaForm.getDescripcion());
		
		TareaDAO tareaDAO = TareaDAO.getInstance();
		tareaDAO.actualizar(tarea);
		
		return mapping.findForward("success");
		
	}
	
}
