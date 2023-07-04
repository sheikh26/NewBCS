
<%@page import="java.util.List"%>
<%@page import="com.strutsLogin.dto.PlanMasterDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 


<html xmlns="http://www.w3.org/1999/xhtml">
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
<script type="text/javascript">
function confirmPost() {
  if (confirm('Are you sure for Delete Records!')) {
     dosomething();
    //or return true;
  }
  else {
    return false;
  }
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
<%-- @page import="com.strutsLogin.plugin.PreLoadedData" --%>

<div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <h2>Manage Plan</h2>
          <p class="infopost"></p>
        <html:form action="/planMasterList" method="Post">




<%
	List<PlanMasterDTO> list1 = (List) request.getAttribute("list1");
	
%>
<a  href="displayPlanMaster.do">Add a New Record
</a>

<table  width="100%"   cellpadding="1" cellspacing="1" 
			class="common_table_class1; " >
		
			<tr>
			<td>
		<display:table id="row" name="list1" requestURI="/displayPlanMasterList.do" 
					pagesize="5" class="common_table_class_caption"  cellpadding="0" cellspacing="0"  style="width:650px;" >
				
				<td>	
			  	<display:column   title="Update" media="html">
			  	<a style="color: #f47920;" href="displayPlanMaster.do?edit=Edit&operation=Update&planId=<c:out  value="${row.planId}"/>">
			  	<img width="15" height="15" src="images/update.png" border="0"/>
				</a>
				</display:column>
			  </td>
			  
			
				<td>	
			  	<display:column   title="Delete" media="html">
			  	<a style="color: #f47920;" href="planMasterList.do?operation=Delete&planId=<c:out  value="${row.planId}"/>">
			  	<img width="15" height="15" src="images/delete.png" border="0" onclick="return confirmPost()"/>
				</a>
				</display:column>
			  </td>
				
				<td>	
			  	<display:column   title="Plan Name"  property="planName">
			  
				</display:column>
			  </td>
			  
			  <td>
			   	<display:column   title="Business Unit 1(%)" property="businessUnit1Perf" >
				</display:column>
			</td>
			 <td>
			   	<display:column   title="BU1 Metric1(%)" property="businessUnit1Mertic1Perf" >
				</display:column>
			</td>
			 <td>
			   	<display:column   title="BU1 Metric2(%)" property="businessUnit1Mertic2Perf" >
				</display:column>
			</td>
			 <td>
			   	<display:column   title="BU1 Metric3(%)" property="businessUnit1Mertic3Perf" >
				</display:column>
			</td>
			 <td>
			   	<display:column   title="Business Unit 2(%)" property="businessUnit2Perf" >
				</display:column>
			</td>
			  <td>
			   	<display:column   title="BU2 Metric1(%)" property="businessUnit2Mertic1Perf" >
				</display:column>
			</td>
			 
			  <td>
			   	<display:column   title="BU2 Metric2(%)" property="businessUnit2Mertic2Perf" >
				</display:column>
			</td>
			
			<td>
			   	<display:column   title="BU2 Metric3(%)" property="businessUnit2Mertic3Perf" >
				</display:column>
			</td>
					
		
		</display:table>
			</td>

	</tr>
	
	</table>






</html:form>
          
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





<!--  Below should go in Tiles -->	
</body>
</html>
