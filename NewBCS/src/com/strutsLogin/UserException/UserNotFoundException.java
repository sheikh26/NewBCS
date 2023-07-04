package com.strutsLogin.UserException;

import com.strutsLogin.exception.BaseException;






public class UserNotFoundException extends BaseException {

	public UserNotFoundException() {
		super("login.invalid.user");

	}

	public UserNotFoundException(String messageKey) {
		super(messageKey);

	}
}
