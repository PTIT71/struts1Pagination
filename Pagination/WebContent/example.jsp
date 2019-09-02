<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Simple paging with struts tags. </h3>

<table border="1">
<tr>
	<td><b>ID</b></td>
	<td><b>Name</b></td>
	<td><b>City</b></td>
	<td><b>Phone</b></td>
</tr>
<%-- Iteration over the list --%>
<logic:iterate name="testList" property="listByOffsetAndLength" id="var">
<tr>
	<td><bean:write name="var" property="id" /></td>
	<td><bean:write name="var" property="name" /></td>
	<td><bean:write name="var" property="city" /></td>
	<td><bean:write name="var" property="phone" /></td>
</tr>
</logic:iterate>				
<tr>
	<td colspan="4"> 
	<logic:iterate name="testList" property="pages" id="varpage">
		<html:link action="/example" paramName="varpage" paramId="page">
			<bean:write name="varpage" />
		</html:link>
	</logic:iterate>
	</td>
</tr>
</table>
</body>
</html>