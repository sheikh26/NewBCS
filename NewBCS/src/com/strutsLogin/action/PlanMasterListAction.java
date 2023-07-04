
package com.strutsLogin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.strutsLogin.delegate.PlanMasterServiceDelegate;
import com.strutsLogin.dto.PlanMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.PlanMasterForm;
import com.strutsLogin.form.PlanMasterListForm;

public class PlanMasterListAction extends BaseAction {


	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		PlanMasterListForm listForm = (PlanMasterListForm) (form);
		List list1 = null;

		SearchCriteria criteria = new SearchCriteria();
		criteria.setOrderBy(listForm.getOrderBy());
		criteria.setAsc(listForm.isAsc());
		
		list1 = PlanMasterServiceDelegate.getList(criteria);

		listForm.setList(list1);
		 request.setAttribute("list1", list1);
		
		System.out.println("list Action=====================return list"+list1.size());

		return mapping.findForward("Success");
	}

	@Override
	public ActionForward submit(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		      PlanMasterDTO dto= null;
		     
		     if("Delete".equals(operation)){
					PlanMasterForm planMasterForm =(PlanMasterForm) form;
					dto = (PlanMasterDTO) planMasterForm.getDTO();
					PlanMasterServiceDelegate.delete(dto);
					
					//After Delete
					PlanMasterListForm listForm = new PlanMasterListForm();
					List list1 = null;

					SearchCriteria criteria = new SearchCriteria();
					criteria.setOrderBy(listForm.getOrderBy());
					criteria.setAsc(listForm.isAsc());

					list1 = PlanMasterServiceDelegate.getList(criteria);

					listForm.setList(list1);
					 request.setAttribute("list1", list1);
				
			}


		return mapping.findForward("Success");
	}

	

	
	
	

}
