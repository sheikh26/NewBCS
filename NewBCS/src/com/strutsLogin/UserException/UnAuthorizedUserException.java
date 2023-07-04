package com.strutsLogin.UserException;

import com.strutsLogin.exception.BaseException;




public class UnAuthorizedUserException extends BaseException {

	public UnAuthorizedUserException() {
		super("login.user.unauthorized");
	}

	public UnAuthorizedUserException(String messageKey) {
		super(messageKey);
	}

}
