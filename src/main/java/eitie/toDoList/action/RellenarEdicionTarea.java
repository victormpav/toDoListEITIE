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

public class RellenarEdicionTarea extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Integer TAREAID = new Integer(request.getParameter("id"));
		
		TareaDAO TAREADO = TareaDAO.getInstance();
		Tarea TAREA = TAREADO.getById(TAREAID);
		
		TareaForm TAREAFORM = (TareaForm) form;
		TAREAFORM.setId(TAREA.getId());
		TAREAFORM.setTitulo(TAREA.getTitulo());
		TAREAFORM.setDescripcion(TAREA.getDescripcion());
		
		return mapping.findForward("success");
		
	}
	
}
