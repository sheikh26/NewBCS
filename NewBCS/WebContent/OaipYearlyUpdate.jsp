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
        <h1></h1>
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
          <h2> Employee Form</h2>
       <html:form  action="/employeeMaster">

	<center>

		<table width=100% bgcolor="white" border="0">
			<tr>
				<th colspan="2" align="center">
					<h3>
						Employee Form
					</h3>

				</th>
			</tr>
			<html:hidden property="empId" />
			<html:hidden property="edit" />

				
	<tr>
		<td>
			<bean:message key="employeeMaster.peopleSoftId"/>
		</td>
		<td>
			<html:text property="peopleSoftId" />
	<html:errors property="peopleSoftId" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.firstName"/>
		</td>
		<td>
			<html:text property="firstName" />
	<html:errors property="firstName" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.lastName"/>
		</td>
		<td>
			<html:text property="lastName" />
	<html:errors property="lastName" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.country"/>
		</td>
		
		<td>
			<html:select property="country">
					<html:option value="">----------SELECT----------</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.COUNTRY_LIST%>" />
						</html:select>
						
	<html:errors property="country" />
		</td>
		
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.planId"/>
		</td>
		
		<td>
			<html:select property="planId">
					<html:option value="">----------SELECT----------</html:option>
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.PLAN_LIST%>" />
						</html:select>
						<html:errors property="planId" />
		</td>
		
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.peopleSoftJobGrade"/>
		</td>
		<td>
			<html:text property="peopleSoftJobGrade" />
	<html:errors property="peopleSoftJobGrade" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.levarageGrade"/>
		</td>
		
		<td>
			<html:select property="levarageGrade">
					<html:option value="">----------SELECT----------</html:option>
					
					<html:options property="key" labelProperty="value"
						collection="<%=PreLoadedData.LEVARAGE_LIST%>"/>
				</html:select>
				<html:errors property="levarageGrade" />
							 
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.baseSalaryAnnual"/>
		</td>
		<td>
			<html:text property="baseSalaryAnnual" />
	<html:errors property="baseSalaryAnnual" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.managerId"/>
		</td>
		<td>
			<html:text property="managerId" />
	<html:errors property="managerId" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.designation"/>
		</td>
		<td>
			<html:text property="designation" />
	<html:errors property="designation" />
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.dateOfJoin"/>
		</td>
		
   <td>
   <html:text styleId="dateOfJoin" property="dateOfJoin"  size="17" >
   </html:text>
	  		<a href="javascript:NewCal('dateOfJoin','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfJoin" />
   </td>
	</tr> 
	
	
	<tr>
		<td>
			<bean:message key="employeeMaster.dateOfEnroll"/>
		</td>
		<td>
			<html:text styleId="dateOfEnroll" property="dateOfEnroll" size="17">
			</html:text>
	  		<a href="javascript:NewCal('dateOfEnroll','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfEnroll" />
	
   </td>
	</tr>
	<tr>
		<td>
			<bean:message key="employeeMaster.dateOfExit"/>
		</td>
		<td>
			<html:text styleId="dateOfExit" property="dateOfExit" size="17" >
			</html:text>
	  		<a href="javascript:NewCal('dateOfExit','ddmmmyyyy')">
	  		<img src="images/cal.gif" width="16" height="16" border="0"/></a>
	  		<html:errors property="dateOfExit" />
	
	
   </td>
	</tr>
 

			<tr valign=top>
			<td colspan=2 class="bottomCell" align="center">
			<logic:notEqual value="Edit" property="edit" name="employeeMasterForm">
					<html:submit property="operation" value="Add" />
					</logic:notEqual>
					<logic:equal value="Edit" property="edit" name="employeeMasterForm">
					<html:submit property="operation" value="Update"/>
				</logic:equal>
				</td>
			</tr>
			
			
			
		</table>
	</center>
</html:form>
          
          <div class="clr"></div>
          <div class="clr"></div>
        </div>
        
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star">Activities</h2>
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