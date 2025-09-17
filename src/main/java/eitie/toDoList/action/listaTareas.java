package eitie.toDoList.action;

import java.util.Collection;

import org.apache.struts.action.Action;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;

public class listaTareas extends Action {
	public org.apache.struts.action.ActionForward execute(
			org.apache.struts.action.ActionMapping mapping,
			org.apache.struts.action.ActionForm form,
			javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws Exception {
	
		
		TareaDAO TAREADO = TareaDAO.getInstance();
		Collection<Tarea> LISTATAREAS = TAREADO.getAll();
		
		request.setAttribute("listaTareas", LISTATAREAS);
		
		return mapping.findForward("success");
	}
}
