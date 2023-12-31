/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.strutsLogin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.delegate.BusinessPerfActualServiceDelegate;
import com.strutsLogin.dto.BusinessPerfActualDTO;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.BusinessPerfActualForm;
import com.strutsLogin.util.DataUtil;

/**
 * MyEclipse Struts Creation date: 08-08-2006
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/hospital" name="hospitalForm" input="/hospital.jsp"
 *                scope="request" validate="true"
 * @struts.action-forward name="success" path="/success.jsp"
 */
public class BusinessPerfActualAction extends BaseAction {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward submit(ActionMapping mapping,
			BaseForm form, String operation, HttpServletRequest request,
			HttpServletResponse response) {

		BusinessPerfActualForm BusinessPerfActualForm = (BusinessPerfActualForm) form;		
		BusinessPerfActualDTO dto = null;
		if ("Add".equals(operation)) {			
			dto = (BusinessPerfActualDTO) BusinessPerfActualForm.getDTO();			
			BusinessPerfActualServiceDelegate.add(dto);
			
	} else if ("Delete".equals(operation)) {
			dto = (BusinessPerfActualDTO) BusinessPerfActualForm.getDTO();
			BusinessPerfActualServiceDelegate.delete(dto);
			
	} else if ("Update".equals(operation)) {
			
			dto = (BusinessPerfActualDTO) BusinessPerfActualForm.getDTO();
			
			BusinessPerfActualServiceDelegate.update(dto);
	}

		return mapping.findForward("BusinessPerfActualList");
	}

	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		
		BusinessPerfActualForm BusinessPerfActualForm = (BusinessPerfActualForm) form;
		
		if(BusinessPerfActualForm.getBusinessPerfActualId() != null){
			BusinessPerfActualDTO dto = BusinessPerfActualServiceDelegate.get(DataUtil.getInteger(BusinessPerfActualForm.getBusinessPerfActualId()));
			BusinessPerfActualForm.populate(dto);
		}

		return mapping.findForward("Success");

	}

}
