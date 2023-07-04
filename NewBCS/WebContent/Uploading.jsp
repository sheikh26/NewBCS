<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@page import="com.strutsLogin.plugins.PreLoadedData"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<head>	
	<title>Welcome To Johnson Controls</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/cssreciaspx.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />	
	<link rel="stylesheet" type="text/css" href="css/style_1.css" />	
</head>
<body>
<body>
        <html:errors />
        <html:form action="fileUploadAction.do" method="post" enctype="multipart/form-data">
            File : <html:file property="file" /> <br/>
            <html:submit property="operation" styleClass="submit" value="Add" />
        </html:form>
    </body>
</body>
</html>