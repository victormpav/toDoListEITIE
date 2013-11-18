package eitie.toDoList.action;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import eitie.toDoList.bean.Tarea;
import eitie.toDoList.dao.TareaDAO;

public class BorrarTarea extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Integer tareaId = new Integer(request.getParameter("id"));
		
		TareaDAO tareaDAO = TareaDAO.getInstance();
		tareaDAO.borrar(tareaId);
		
		return mapping.findForward("success");
	}
}
