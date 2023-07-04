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





<script type="text/javascript"> 

// Format of StoreDetails()
// Name,Addr1,Addr2,Addr3,Phone,FAX,Email,Webpage
var StoreDetails = [
['Select Business Unit','','','','','','','',''],
['CoEE','Ebit 1','Ebit 2','Ebit 3'],
['Asia','Atw c1','Atwc2','Atwc3']
 //NO COMMA
];
function Setup(TA) {
var str = "<select id='Store' onchange='StoreInfo()'>";
for (var i=0; i<StoreDetails.length; i++) {
str += '<option value="'+StoreDetails[i].join('|')+'">'+StoreDetails[i][0]+'</option>';
}
str +='</select>';
document.write(str);

}
function StoreInfo() {
var sel = document.getElementById('Store').selectedIndex;
var tmp = []; tmp.push(sel);
for (var i=1; i<9; i++) { tmp.push(StoreDetails[sel][i]); }
document.getElementById('metric1Name').value = tmp[1];
document.getElementById('metric2Name').value = tmp[2];
document.getElementById('metric3Name').value = tmp[3];


}
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
           <FIELDSET>   <LEGEND><SPAN style="FONT-WEIGHT: bold; FONT-SIZE: small; FONT-FAMILY: Verdana"> Manage Business Plan</SPAN></LEGEND>
       
       <html:form  action="/businessPerfPlan" onsubmit="CheckForm()">
         
	<center>

		<table width="90%" bgcolor="white" border="0">
		
		 <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
		 	 <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
			<tr>
				<td align="left" width="30%">
			<html:hidden property="buPerfPlanId" />
			<html:hidden property="edit" />

				</td>
				</tr>
	
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.businessUnitId"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<script type="text/javascript">Setup();</script>
		</td>
	</tr>
	
	
	
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.buYear"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:select styleClass="cselect" property="buYear">
                    <html:option value="">Select Year</html:option>
                    <html:option value="2010"> 2010</html:option> 
                    <html:option value="2011"> 2011</html:option> 
                    <html:option value="2012"> 2012</html:option> 
                    <html:option value="2013"> 2013</html:option> 
                    <html:option value="2014"> 2014</html:option> 
                    <html:option value="2015"> 2015</html:option> 
                    </html:select> 
                    
<html:errors property="buYear" />
		</td>
	</tr>
	
	
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric1Name"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text  styleId="metric1Name"  property="metric1Name" styleClass="content2" maxlength="50" readonly="true"></html:text>
			
	
   </td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric1PlanValue"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="metric1PlanValue" />
	<html:errors property="metric1PlanValue" />
   </td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric2Name"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			
		
	        <html:text  styleId="metric2Name"  property="metric2Name"  maxlength="50"readonly="true"></html:text>
   </td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric2PlanValue"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="metric2PlanValue" />
	<html:errors property="metric2PlanValue" />
   </td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric3Name"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			
			
	          <html:text  styleId="metric3Name"  property="metric3Name" styleClass="content2"maxlength="50"readonly="true"></html:text>
   </td>
	</tr>
	
	<tr>
		<td align="left" width="30%">
			<bean:message key="businessPerfPlan.metric3PlanValue"/><font color="red">*</font>
		</td>
		<td align="left" width="80%">
			<html:text property="metric3PlanValue" styleClass="content2"/>
	<html:errors property="metric3PlanValue" />
   </td>
	</tr> 
	
	
	
	<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
	
 

			<tr valign=top><td width="30%">&nbsp;</td>
			<td width="80%" align="left">
			<logic:notEqual value="Edit" property="edit" name="businessPerfPlanForm">
					<html:submit property="operation" styleClass="submit" value="Add" />
					<a href="displayBusinessProc.do">
					<img src="images/cancel.JPG" width="45" height="22"  border="0" align="top"/>
					</a>
					</logic:notEqual>
					<logic:equal value="Edit" property="edit" name="businessPerfPlanForm">
					<html:submit property="operation" styleClass="submit" value="Update"/>
					<a href="displayBusinessProc.do">
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