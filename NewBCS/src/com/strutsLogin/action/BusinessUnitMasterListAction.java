/*
 * Generated by Nenosystems Generator Struts
 */

package com.strutsLogin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.delegate.BusinessUnitMasterServiceDelegate;
import com.strutsLogin.delegate.EmployeeMasterServiceDelegate;
import com.strutsLogin.dto.BusinessUnitMasterDTO;
import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.BusinessUnitMasterForm;
import com.strutsLogin.form.BusinessUnitMasterListForm;
import com.strutsLogin.form.EmployeeMasterForm;
import com.strutsLogin.form.EmployeeMasterListForm;



public class BusinessUnitMasterListAction extends BaseAction {


	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		BusinessUnitMasterListForm listForm = (BusinessUnitMasterListForm) (form);
		List list1 = null;

		SearchCriteria criteria = new SearchCriteria();
		criteria.setOrderBy(listForm.getOrderBy());
		criteria.setAsc(listForm.isAsc());

		list1 = BusinessUnitMasterServiceDelegate.getList(criteria);

		listForm.setList(list1);

		 request.setAttribute("list1", list1);
		
		return mapping.findForward("Success");
	}

	@Override
	public ActionForward submit(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {

		 BusinessUnitMasterDTO dto= null;
	     
	     if("Delete".equals(operation)){
				BusinessUnitMasterForm businessUnitMasterForm =(BusinessUnitMasterForm) form;
				dto = (BusinessUnitMasterDTO) businessUnitMasterForm.getDTO();
				BusinessUnitMasterServiceDelegate.delete(dto);
		//		addActionError("Addition Format is not available. Kindly contact the system administrator.");
				//After Delete
				BusinessUnitMasterListForm listForm = new BusinessUnitMasterListForm();
				List list1 = null;

				SearchCriteria criteria = new SearchCriteria();
				criteria.setOrderBy(listForm.getOrderBy());
				criteria.setAsc(listForm.isAsc());

				list1 = BusinessUnitMasterServiceDelegate.getList(criteria);

				listForm.setList(list1);
				 request.setAttribute("list1", list1);
			
		}


	return mapping.findForward("Success");
}

}
