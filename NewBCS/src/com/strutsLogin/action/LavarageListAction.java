

package com.strutsLogin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.form.EmployeeMasterForm;
import com.strutsLogin.form.EmployeeMasterListForm;
import com.strutsLogin.form.LavarageForm;
import com.strutsLogin.form.LavarageListForm; 
import com.strutsLogin.delegate.EmployeeMasterServiceDelegate;
import com.strutsLogin.delegate.LavarageServiceDelegate;
import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.dto.LavarageDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.form.BaseForm;



public class LavarageListAction extends BaseAction {


	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		LavarageListForm listForm = (LavarageListForm) (form);
		List list1 = null;

		SearchCriteria criteria = new SearchCriteria();
		criteria.setOrderBy(listForm.getOrderBy());
		criteria.setAsc(listForm.isAsc());

		list1 = LavarageServiceDelegate.getList(criteria);

		listForm.setList(list1);
		
		 request.setAttribute("list1", list1);
		 
		 System.out.println("List in laverage =========================="+list1.size());

		return mapping.findForward("Success");
	}

	@Override
	public ActionForward submit(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {

		//     EmployeeMasterListForm listForm = (EmployeeMasterListForm) (form);
		     LavarageDTO dto= null;
		     
		     if("Delete".equals(operation)){
					LavarageForm lavarageForm =(LavarageForm) form;
					dto = (LavarageDTO) lavarageForm.getDTO();
					LavarageServiceDelegate.delete(dto);
					
					//After Delete
					LavarageListForm listForm = new LavarageListForm();
					List list1 = null;

					SearchCriteria criteria = new SearchCriteria();
					criteria.setOrderBy(listForm.getOrderBy());
					criteria.setAsc(listForm.isAsc());

					list1 = LavarageServiceDelegate.getList(criteria);

					listForm.setList(list1);
					 request.setAttribute("list1", list1);
				
			}


		return mapping.findForward("Success");
	}

}
