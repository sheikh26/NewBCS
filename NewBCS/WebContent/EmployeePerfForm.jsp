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
         <FIELDSET><LEGEND><SPAN style="FONT-WEIGHT: bold; FONT-SIZE: small; FONT-FAMILY: Verdana"> Manage Employee Performance</SPAN></LEGEND>
       
       <html:form  action="/employeePerf" method="Post">

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
			<bean:message key="employeeMaster.managerId"/><font color="red">*</font>
		</td>
		
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="managerId">
					<html:option value="">Select Employee</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.EMPLOYEE_ID%>" />
						</html:select>
						
	<html:errors property="managerId" />
		</td>
		
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.year"/><font color="red">*</font>
		</td>
		<td>
			      <html:select styleClass="cselect"property="year">
                    <html:option value="">Select Year</html:option>
                    <html:option value="2010"> 2010</html:option> 
                    <html:option value="2011"> 2011</html:option> 
                    <html:option value="2012"> 2012</html:option> 
                    <html:option value="2013"> 2013</html:option> 
                    <html:option value="2014"> 2014</html:option> 
                    <html:option value="2015"> 2015</html:option> 
                  
                    </html:select>

		</td>
	</tr> 
	
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="employeeMaster.performance"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="performance"  maxlength="50"/>
	<html:errors property="performance" />
   </td>
	</tr>
	
 
<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
			<tr valign=top><td width="30%">&nbsp;</td>
			<td width="80%" align="left">
			<logic:notEqual value="Edit" property="edit" name="employeePerformanceForm">
					<html:submit property="operation" styleClass="submit" value="Add" />
					<a href="displayEmployeePerfList.do">
					<img src="images/cancel.JPG" width="45" height="22"  border="0" align="top"/>
					</a>
					</logic:notEqual>
					<logic:equal value="Edit" property="edit" name="employeePerformanceForm">
					<html:submit property="operation"  styleClass="submit" value="Update"/>
					<a href="displayEmployeePerfList.do">
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