
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.List"%>
<%@page import="com.strutsLogin.dto.BusinessUnitMasterDTO"%>
 


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">

</script>

<title>Welcome To Johnson Controls</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="css/IFL.css" />
<link rel="stylesheet" type="text/css" href="css/style_1.css"/>
<!--<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/IFL.css" />-->


<script LANGUAGE="JavaScript">
<!--
function confirmPost()
{
var agree=confirm("Are you sure you want to delete?");
if (agree)
return true ;
else
return false ;
}
// -->
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
      <h2>Manage Business Unit</h2>
      
      
      
<html:form action="/businessUnitMasterList" method="Post">

<%
	List<BusinessUnitMasterDTO> list1 = (List) request.getAttribute("list1");
	
%>
<br/>
<a  href="displayBusinessUnitMaster.do">Add a New Record</a>
<br/>


<table  width="650px"  height="" cellpadding="" cellspacing="">
		
			<tr>
			<td>
		<display:table id="row" name="list1" requestURI="/displayBusinessUnitMasterList.do" 
					pagesize="5" class="common_table_class_caption"  cellpadding="1" cellspacing="1"  style="width:100%;border:none;" export="flase">
				
									<td>
	
				
				
				
					
			  
			  <td>	
			  	<display:column   title="Update" media="html">
			  	<a style="color: #f47920;" href="displayBusinessUnitMaster.do?edit=Edit&operation=Update&businessUnitId=<c:out  value="${row.businessUnitId}"/>">
			  	<img width="15" height="15" src="images/update.png" border="0" />
				</a>
				</display:column>
			  </td>
			  
				
				
				
				
			 
			 <td>
			   	<display:column   title="Business Unit Name" property="businessUnitName" sortable="false">
				</display:column>
			</td>
			 
			  
		</display:table>
			

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
