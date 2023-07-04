package com.strutsLogin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.dto.UserDTO;
import com.strutsLogin.form.UserForm;
import com.strutsLogin.service.UserService;

public class UserInfoAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		UserForm userform = (UserForm)form;
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiii in action");
		String operation=userform.getOperation();
		System.out.println("in actiion getting the operation--------->"+operation);
		UserDTO dto=new UserDTO();
		
		if("Save".equals(operation))
		{
			dto.setName(userform.getName());
			dto.setPassword(userform.getPassword());
	//		UserService.AddUserDTO(dto);
			System.out.println(dto);
			return mapping.findForward("success"); 
		}
		return mapping.findForward("fail");
	}

}
