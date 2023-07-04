<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@page import="com.strutsLogin.plugins.PreLoadedData"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page import="java.util.List"%>
<%@page import="com.strutsLogin.dto.MonthlyCalDTO"%>
<head>


<title>Welcome To Johnson Controls</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style_1.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="css/IFL.css" />
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
        
          <h2>Manage OAIP Monthly</h2>
       <html:form  action="/oaipList" method="get">

		<table width="100%" bgcolor="white" border="0">
			<tr>
				<th colspan="1" align="center">
					<h3>
						
					</h3>

				</th>
			</tr>
			
			<tr>
		<td align="left" width="30%">
			<bean:message key="displayOaipList.businessUnitId" />
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
		<td>
			<bean:message key="displayOaipList.year"/>
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
		<td>
			<bean:message key="displayOaipList.month"/>
		</td>
		<td>
			 <html:select styleClass="cselect"property="month">
			<html:option value="">Select Month</html:option> 
                    <html:option value="1"> Jan</html:option> 
                    <html:option value="2"> Feb</html:option> 
                    <html:option value="3"> Mar</html:option > 
                    <html:option value="4" > Apr</html:option > 
                    <html:option value="5" > May</html:option > 
                    <html:option value="6" > Jun</html:option > 
                    <html:option value="7" > Jul</html:option > 
                    <html:option value="8" > Aug</html:option > 
                    <html:option value="9" > Sep</html:option > 
                    <html:option value="10" > Oct</html:option > 
                    <html:option value="11" > Nov</html:option > 
                    <html:option value="12" > Dec</html:option >
                  </html:select>
			
	<html:submit property="operation" value="OK" />
   </td>
	</tr>
 

			<tr valign=top>
			<td colspan=2 class="bottomCell" align="center">
			
					
					
				</td>
			</tr>
			
			
			
		</table>
		
		</html:form>
		
		<%
	List<MonthlyCalDTO> list1 = (List) request.getAttribute("list1");
	
	
%>
 <FIELDSET>   <LEGEND><SPAN style="FONT-WEIGHT: bold; FONT-SIZE: small; FONT-FAMILY: Verdana">OAIP Monthly</SPAN></LEGEND>
       
            <html:form  action="/oaipList" method="post">
            
		
		<table  width="100%"  cellpadding="1" cellspacing="1" 
			class="common_table_class1; " style="padding-top:15px;" >
		
			<tr>
			<td>
		<display:table id="data" name="list1" requestURI="/oaipList.do" 
					pagesize="5" class="common_table_class_caption"  cellpadding="0" cellspacing="0"  style="width:650px;" export="true" >
				
									<td>
			</td>
			
			<tr>
			
			
			</tr>
			<td>
			<html:text property="empId"  />
			</td>
			<td>
			   	<display:column   title="Global Id" property="empId" >
				</display:column>
			</td>
				
				
			  <td>
			   	<display:column   title="Employee Name" property="empName" >
				</display:column>
			</td>
			 
			
			<td>
			   	<display:column   title="Base Salary (INR)" property="baseSalary" >
				</display:column>
			</td>
			
			
			<td>
			   	<display:column   title="Leverage" property="gradeName" >
				</display:column>
			</td>
			
			<td>
			   	<display:column   title="Leverage %" property="leveragePerc" >
				</display:column>
			</td>
			<td>
			   	<display:column   title="OAIP" property="oaip" >
				</display:column>
			</td>
			
		   	<display:setProperty name="export.pdf" value="false" />
			 <display:setProperty name="export.excel.filename" value="OaipCalculation.xls"/>
          
			
			
		</display:table>
		</td>
		</tr>
		<tr valign=top>
			<td colspan=2 class="bottomCell" align="center">
			
		 
			
			
		 
		 
			</td>

	</tr>
	
	</table>
	
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