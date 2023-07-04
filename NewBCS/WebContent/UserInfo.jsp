

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
  <html>
  <head>
    
    
    <title>My JSP 'login.jsp' starting page</title>
    
	
  </head>
  
  <body>
    <font color="#ff00ff">THIS IS&nbsp;USER INFORMATION</font> <br>
    <html:form action="/user" method="Post">
    <table border="1">
    <tr>
    <td>
    USER ID
    </td>
    <td>
    <!-- html:text property="id"-->
    </td>
    </tr>
    <tr>
    <td>
    NAME
    </td>
    <td>
    <html:text property="name"/>
    </td>
    </tr>
    <tr>
    <td>
     PASSWORD
    </td>
    <td>
    <html:text property="password"/>
    </td>
    </tr>
   <tr> <td colspan=2>
    <html:submit property="operation" value="Save"></html:submit>
     
     </td>
     </table><p>
     </p><p></p></html:form>
      </body>
  </html>
