package com.strutsLogin.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.strutsLogin.UserException.UserNotFoundException;
import com.strutsLogin.dto.UserDTO;
import com.strutsLogin.form.CheckForm;
import com.strutsLogin.form.UserForm;
import com.strutsLogin.service.UserService;

public class LoginAction extends Action {

	@Override
	public ActionForward execute
	(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// created example by Vikas Vasnik
		CheckForm checkForm=(CheckForm) form;
		UserDTO userDTO = new UserDTO();
		//ActionForward forward = null;
		try {
			String operation=checkForm.getOperation();
			//form bean typecasting
			System.out.println("hiiiiiiiiiiiiiiiiiiiiii in Action");
			
			//DTO is used for working with Database.
			if("Login".equals(operation)){
		//		String chkId=checkForm.getId();
		//	userDTO.setId(Integer.valueOf(chkId));	
			userDTO.setName(checkForm.getName());
			userDTO.setPassword(checkForm.getPassword());
			System.out.println("hiiiiiiiiiiiiiiiiiiiiii in Action"+userDTO.getId());
			UserService.authenticate(userDTO);
			//method called from user service
			System.out.println("in Login Action 666666666"+userDTO.getId());
			}
		} catch (UserNotFoundException e) {
			ActionMessages errors = new ActionMessages();
			ActionMessage message;
			message = new ActionMessage("login.invalid.user");
			errors.add("invalid", message);
			this.saveErrors(request, errors);
			e.printStackTrace();
			return mapping.findForward("Login");

		}
		
		return mapping.findForward("success");
		
		//mapping is used for where we send to another jsp in container
		}
	
	
	
   
}
// In Struts there is by default execute method when we extend class from Action,
// and basically action is front controller in struts.