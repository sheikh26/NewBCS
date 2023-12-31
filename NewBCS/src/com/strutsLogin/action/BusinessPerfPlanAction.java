/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.strutsLogin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.delegate.BusinessPerfPlanServiceDelegate;
import com.strutsLogin.dto.BusinessPerfPlanDTO;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.BusinessPerfPlanForm;
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
public class BusinessPerfPlanAction extends BaseAction {
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

		BusinessPerfPlanForm BusinessPerfPlanForm = (BusinessPerfPlanForm) form;

		
		BusinessPerfPlanDTO dto = null;

		if ("Add".equals(operation)) {
			
			dto = (BusinessPerfPlanDTO) BusinessPerfPlanForm.getDTO();
			String checkvalue=BusinessPerfPlanForm.getMetric1Name();
			if(checkvalue.equals("Ebit 1")){
				dto.setBusinessUnitId(1);
				
			}else {
				dto.setBusinessUnitId(2);
			}
			BusinessPerfPlanServiceDelegate.add(dto);
			
	} else if ("Delete".equals(operation)) {
			dto = (BusinessPerfPlanDTO) BusinessPerfPlanForm.getDTO();
			BusinessPerfPlanServiceDelegate.delete(dto);
			
	} else if ("Update".equals(operation)) {
			
			dto = (BusinessPerfPlanDTO) BusinessPerfPlanForm.getDTO();
			
			BusinessPerfPlanServiceDelegate.update(dto);
	}

		return mapping.findForward("BusinessPerfPlanList");
	}

	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		
		BusinessPerfPlanForm BusinessPerfPlanForm = (BusinessPerfPlanForm) form;
		
		if(BusinessPerfPlanForm.getBuPerfPlanId() != null){
			BusinessPerfPlanDTO dto = BusinessPerfPlanServiceDelegate.get(DataUtil.getInteger(BusinessPerfPlanForm.getBuPerfPlanId()));
			BusinessPerfPlanForm.populate(dto);
		}

		return mapping.findForward("Success");

	}

}
