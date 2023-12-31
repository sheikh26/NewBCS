/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.strutsLogin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.delegate.EmployeeMasterServiceDelegate;
import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.EmployeeMasterForm;
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
public class OaipYearlyAction extends BaseAction {
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

		EmployeeMasterForm EmployeeMasterForm = (EmployeeMasterForm) form;

		
		EmployeeMasterDTO dto = null;

		if ("Add".equals(operation)) {
			
			dto = (EmployeeMasterDTO) EmployeeMasterForm.getDTO();
			
			EmployeeMasterServiceDelegate.add(dto);
			
	} else if ("Delete".equals(operation)) {
			dto = (EmployeeMasterDTO) EmployeeMasterForm.getDTO();
			EmployeeMasterServiceDelegate.delete(dto);
			
	} 
	
	else if ("Update".equals(operation)) {
			
			dto = (EmployeeMasterDTO) EmployeeMasterForm.getDTO();
			
			EmployeeMasterServiceDelegate.update(dto);
	}

		return mapping.findForward("EmployeeMasterList");
	}

	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		
		EmployeeMasterForm EmployeeMasterForm = (EmployeeMasterForm) form;
		
		if(EmployeeMasterForm.getEmpId() != null){
			EmployeeMasterDTO dto = EmployeeMasterServiceDelegate.get(DataUtil.getInteger(EmployeeMasterForm.getEmpId()));
			EmployeeMasterForm.populate(dto);
		}

		return mapping.findForward("Success");

	}

}
