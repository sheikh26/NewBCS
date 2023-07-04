package com.strutsLogin.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.strutsLogin.delegate.ExcelServiceDelegate;
import com.strutsLogin.dto.ExcelFileDTO;
import com.strutsLogin.exception.BaseException;
import com.strutsLogin.form.BaseForm;
import com.strutsLogin.form.FileExcelUploadForm;

public class UploadFileAction extends BaseAction {

	/* forward name="success" path="" */
	private final static String SUCCESS = "success";



	@Override
	public ActionForward submit(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
			List<ExcelFileDTO>ExcelDTOList=null; 
			System.out.println("\nIn upload fileaction");
			FileExcelUploadForm uploadForm = (FileExcelUploadForm) form;
			System.out.println("\nUpdload Action after creating instance");
			/*FileOutputStream outputStream = null;*/
			FormFile formFile = null;
			System.out.println("\nB4 chkg if operation and value of if operation is "+operation+"\n");
			if("Add".equals(operation))
			{
					try {
						System.out.println("b4 get file");
						formFile = uploadForm.getFile();
						System.out.println("a4tr get file");
						
						ExcelDTOList = Read(formFile);
						
						ExcelServiceDelegate.add(ExcelDTOList);
						
						uploadForm.setMessage("The file " + formFile.getFileName()
						+ " is uploaded successfully.");
						System.out.println("In uplad action successfully");
						return mapping.findForward(SUCCESS);
					}
					catch(BaseException be)
					{
						System.out.println(be.getMessage());
						uploadForm.setMessage("Wrong Input");
					}
				catch(Exception e){
					uploadForm.setMessage("Wrong Input");				
				}
				finally{
					ExcelDTOList=null;
				}
			}
			System.out.println("\n returning from uploadaction fail");
			return mapping.findForward("fail");		
	}

	private List Read(FormFile formFile) throws BaseException {
		System.out.println("In Read method");
		List<ExcelFileDTO>ExcelFileDTO = new ArrayList<ExcelFileDTO>();		
		try {
			InputStream fis = formFile.getInputStream();
			POIFSFileSystem fsFileSystem = new POIFSFileSystem(fis);
			HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
			HSSFSheet hssfSheet = workBook.getSheetAt(0);
			HSSFCell hssfCell;
			Iterator rowIterator = hssfSheet.rowIterator();	
			int i=0;
			while (rowIterator.hasNext()) 
			{	
				
				try {
					if(i==0){
						i++;
						rowIterator.next();
						System.out.println("In if ");
						continue;
						}
					ExcelFileDTO excel=new ExcelFileDTO();				
					HSSFRow hssfRow = (HSSFRow) rowIterator.next();
					
					hssfCell  = hssfRow.getCell(0);				
					excel.setEmployeeId((int)Float.parseFloat(hssfCell.toString()));
					
					hssfCell  = hssfRow.getCell(1);				
					excel.setName(hssfCell.toString());
					
					hssfCell  = hssfRow.getCell(2);
					excel.setSalary(Double.parseDouble(hssfCell.toString()));
					ExcelFileDTO.add(excel);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					throw e;
				}
			}			
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Arises In TestRead");	
			throw new BaseException("The schema of excel file is not correct ");
		}
		System.out.println("Returning 4m read method");
		if(ExcelFileDTO==null)
			System.out.println("null in excelfiledtolist ");
		else
			System.out.println("Not null in excelList");
		return ExcelFileDTO;
	}
	@Override
	public ActionForward display(ActionMapping mapping, BaseForm form,
			String operation, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
}