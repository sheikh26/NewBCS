package com.strutsLogin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsLogin.dto.UserDTO;
import com.strutsLogin.form.CheckForm;
import com.strutsLogin.form.UserForm;
import com.strutsLogin.service.UserService;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// created example by Vikas Vasnik
		System.out.println("hiiiiiiiiiiiiiiiiiiiiii in Action");
		CheckForm checkForm=(CheckForm) form;
		//form bean typecasting
		System.out.println("hiiiiiiiiiiiiiiiiiiiiii in Action");
		UserDTO userDTO=new UserDTO();
		//DTO is used for working with Database.
		String operation=checkForm.getOperation();
		
		userDTO.setName(checkForm.getName());
		userDTO.setPassword(checkForm.getPassword());
		
		UserService.authenticate(userDTO);
		//method called from user service
		System.out.println("in Login Action 666666666"+userDTO.getId());
		
		
		return mapping.findForward("success");
		
		//mapping is used for where we send to another jsp in container
		}
	
   
}
// In Struts there is by default execute method when we extend class from Action,
// and basically action is front controller in struts.