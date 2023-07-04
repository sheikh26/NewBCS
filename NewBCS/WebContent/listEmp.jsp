<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<html>
<head>
    <title>display data from the table using jsp</title>
</head>
<body>
<h2 align="center">Data from the table 'Employee' of database 'OAIP'</h2>





<% 

String connectionUrl = "jdbc:sqlserver://CSHEIKAR:1433;" +
"databaseName=OAIP";

// Declare the JDBC objects.
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
	try {
		// Establish the connection.
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    		con = DriverManager.getConnection(connectionUrl,"sa","root");
    
    		// Create and execute an SQL statement that returns some data.
    		String SQL = "SELECT * FROM EmpMasterTbl";
    		stmt = con.createStatement();
    		rs = stmt.executeQuery(SQL);
    
    		// Iterate through the data in the result set and display it.
    		
	
	%>

<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;" align="center">
<%
    while (rs.next()) {
    %>
    <TR>
        <TD><%=rs.getString(1)%></TD>
        <TD><%=rs.getInt(2)%></TD>
        <TD><%=rs.getString(3)%></TD>
        <TD><%=rs.getString(4)%></TD>
        <TD><%=rs.getInt(5)%></TD>
        <TD><%=rs.getString(6)%></TD>
        <TD><%=rs.getInt(7)%></TD>
        <TD><%=rs.getInt(8)%></TD>
        <TD><%=rs.getString(9)%></TD>
        <TD><%=rs.getString(10)%></TD>
        <TD><%=rs.getString(11)%></TD>
        <TD><%=rs.getInt(12)%></TD>
        <TD><%=rs.getInt(13)%></TD>
        <TD><%=rs.getInt(14)%></TD>
        <TD><%=rs.getInt(15)%></TD>
        <TD><%=rs.getInt(16)%></TD>
        <TD><%=rs.getString(17)%></TD>
        
              </TR>
    <%} %>
    
    <%
    rs.close();
    stmt.close();
    con.close();
   
	}  catch (Exception e) {
		%>
   
    
        <%
                
            }
        %>
    </TABLE><TABLE align="center">
        <TR>
            <TD><FORM ACTION="welcome_to_database_query.jsp" method="get" >
            <button type="submit"><-- back</button></TD>
        </TR>
    </TABLE>

</body>
</html>