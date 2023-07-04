/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsLogin.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import com.strutsLogin.dto.BaseDTO;
import com.strutsLogin.dto.ExcelFileDTO;
import com.strutsLogin.util.DataUtil;

/**
 *
 * @author Aamir Sheikh
 */
public class FileExcelUploadForm extends BaseForm  {
	private String employeeId;
	private String name;
	private String salary;
	private FormFile file;
	
	public FormFile getFile() {
		return file;
	}
	public void setFile(FormFile file) {
		this.file = file;
	}

	private String message;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public FileExcelUploadForm() {
        super();
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (file.getFileSize() == 0) {
            errors.add("file", new ActionMessage("error.file.required"));
        } else if (!file.getContentType().equals("application/vnd.ms-excel")) {
            errors.add("file", new ActionMessage("error.file.type"));
        }
        /**
         * If the file size is greater than 20kb.
         */
        else if (file.getFileSize() > 20480) {
            errors.add("file", new ActionMessage("error.file.size"));
        }
        return errors;
    }

	@Override
	public void populate(BaseDTO baseDto) {
		// TODO Auto-generated method stub
		ExcelFileDTO excel =(ExcelFileDTO) baseDto;
		this.setEmployeeId(DataUtil.getString(excel.getEmployeeId()));
		this.setName(excel.getName());
		this.setSalary(DataUtil.getString(excel.getSalary()));
	}

	@Override
	public BaseDTO getDTO() {
		// TODO Auto-generated method stub
		ExcelFileDTO excel =new ExcelFileDTO();
		excel.setEmployeeId(DataUtil.getInteger(employeeId));
		excel.setName(name);
		excel.setSalary(DataUtil.getDouble(salary));
		return excel;
	}
}
