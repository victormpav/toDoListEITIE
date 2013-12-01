package eitie.toDoList.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;

public class CrearTarea extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Tarea tarea = new Tarea();
		tarea.setTitulo(request.getParameter("titulo"));
		tarea.setDescripcion(request.getParameter("descripcion"));
		
		TareaDAO tareaDAO = TareaDAO.getInstance();
		tareaDAO.crear(tarea);
		
		return mapping.findForward("success");
		
	}

}
