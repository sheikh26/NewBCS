<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@page import="com.strutsLogin.plugins.PreLoadedData"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<head>


<title>Welcome To Johnson Controls</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style_1.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="css/cssreciaspx.css" /> 
<!--<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>-->

<script language="javascript" type="text/javascript" src="js/datetimepicker.js">
</script>



</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
       
      </div>
      <div class="searchform">
        
      </div>
      
      
      
      
      <div class="clr"></div>
    </div>
  </div>
  
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
         <FIELDSET><LEGEND><SPAN style="FONT-WEIGHT: bold; FONT-SIZE: small; FONT-FAMILY: Verdana"> Manage Employee</SPAN></LEGEND>
       
       <html:form  action="/employeeMaster" method="Post">

	<center>

		<table width="90%" bgcolor="white" border="0">
		
		 <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
		 	 <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
			<tr>
				<td align="left" width="30%"><html:hidden property="empId" />
			    <td align="left" width="30%"><html:hidden property="edit" />
			    </td>
			    </tr>

				
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.peopleSoftId"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="peopleSoftId"  maxlength="50"/>
	<html:errors property="peopleSoftId" />
	
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.firstName"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="firstName"  maxlength="50"/>
	<html:errors property="firstName" />
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.lastName"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="lastName"  maxlength="100"/>
	<html:errors property="lastName" />
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.country"/><font color="red">*</font>
		</td>
		
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="country">
					<html:option value="">Select Country</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.COUNTRY_LIST%>" />
						</html:select>
						
	<html:errors property="country" />
		</td>
		
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.businessUnitId" /><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="businessUnitId">
					<html:option value="">Select Business Unit</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.BUSINESS_UNIT_ID%>" />
						</html:select>
						<html:errors property="businessUnitId" />
		</td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.planId"/><font color="red">*</font>
		</td>
		
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="planId">
					<html:option value="">Select Plan</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.PLAN_LIST%>" />
						</html:select>
						<html:errors property="planId" />
		</td>
		
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.levarageGrade"/><font color="red">*</font>
		</td>
		
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="levarageGrade">
					<html:option value="">Select Leverage</html:option>
					
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.LEVARAGE_LIST%>"/>
				</html:select>
				<html:errors property="levarageGrade" />
							 
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.baseSalaryAnnual"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="baseSalaryAnnual"  maxlength="50"/>
	<html:errors property="baseSalaryAnnual" />
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.managerId"/><font color="red">*</font>
		</td>
		
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="managerId">
					<html:option value="">Select Manager Name</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.EMPLOYEE_ID%>" />
						</html:select>
						<html:errors property="managerId" />
		</td>
		
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.designation"/>
		</td>
		<td align="left" width="80%">
			<html:text property="designation"  maxlength="50"/>
	<html:errors property="designation" />
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.dateOfJoin"/><font color="red">*</font>
		</td>
		
   <td align="left" width="80%">
   <html:text styleId="dateOfJoin" property="dateOfJoin"  maxlength="50">
   </html:text>
	  		<a href="javascript:NewCal('dateOfJoin','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfJoin" />
   </td>
	</tr> 
	
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.dateOfEnroll"/>
		</td>
		<td align="left" width="80%">
			<html:text styleId="dateOfEnroll" property="dateOfEnroll" maxlength="50">
			</html:text>
	  		<a href="javascript:NewCal('dateOfEnroll','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfEnroll" />
	
   </td>
	</tr>
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.dateOfExit"/>
		</td>
		<td align="left" width="80%">
			<html:text styleId="dateOfExit" property="dateOfExit"  maxlength="50">
			</html:text>
	  		<a href="javascript:NewCal('dateOfExit','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfExit" />
	
	
   </td>
	</tr>
 
<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
			<tr valign=top><td width="30%">&nbsp;</td>
			<td width="80%" align="left">
			<logic:notEqual value="Edit" property="edit" name="employeeMasterForm">
					<html:submit property="operation" styleClass="submit" value="Add" />
					<a href="displayEmployeeMasterList.do">
					<img src="images/cancel.JPG" width="45" height="22"  border="0" align="top"/>
					</a>
					</logic:notEqual>
					<logic:equal value="Edit" property="edit" name="employeeMasterForm">
					<html:submit property="operation"  styleClass="submit" value="Update"/>
					<a href="displayEmployeeMasterList.do">
					<img src="images/cancel.JPG" width="45" height="22"  border="0" align="top"/>
					</a>
				</logic:equal>
				</td>
			</tr>
			
			
			
		</table>
	</center> 
</html:form>
          </FIELDSET>
          <div class="clr"></div>
          <div class="clr"></div>
        </div>
        
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star">Manage Activities</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
          
            <jsp:include page="include.jsp"></jsp:include>
          </ul>
        </div>
        
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">&copy; Copyright <a href="#">Johnson Controls, CoEE</a>, India</p>
     
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>