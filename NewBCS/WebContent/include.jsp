<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page import="java.util.List"%>
<%@page import="com.strutsLogin.dto.EmployeeMasterDTO"%>
<head>


<title>Welcome To Johnson Controls</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<link href="css/thickbox.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="css/IFL.css" />
<!--<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>-->

<script language="javascript" type="text/javascript" src="js/datetimepicker.js">
</script>



</head>
<body>

            <li><a href="displayBusinessUnitMasterList.do">Business Unit</a></li>
            <li><a href="displayCountryMasterList.do">Country</a></li>
            <li><a href="displayLavarageList.do">Leverage</a></li>
             <li><a href="displayPlanMasterList.do">Plan</a></li>
            <li><a href="displayEmployeeMasterList.do">Employee</a></li>
            
           
            <li><a href="displayBusinessProc.do">Business Performance Plan</a></li>
            <li><a href="displayBusinessActualProc.do">Business Performance Actual</a></li>
            <li><a href="displayEmployeePerfProc.do">Employee Performance </a></li>
            <li><a href="displayOaipList.do">Monthly OAIP Calculation</a></li>
            <li><a href="displayOaipListYearly.do">Yearly OAIP Calculation</a></li>
            <li><a href="UploadFile.jsp">Upload File</a></li>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <li><a href="Login.jsp"><b>Log Out</b></a></li>
            
</body>
</html>