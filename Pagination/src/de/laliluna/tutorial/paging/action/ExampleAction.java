package de.laliluna.tutorial.paging.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import de.laliluna.tutorial.object.TestList;

public class ExampleAction extends Action {

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) {

		int maxEntriesPerPage = 3;

		int page = 1;
		try{
			page = Integer.parseInt(request.getParameter("page"));
		}catch(NumberFormatException e){}

		int offset = maxEntriesPerPage * (page - 1);	

		request.setAttribute("testList", new TestList(offset, maxEntriesPerPage));

		return mapping.findForward("example");
	}

}