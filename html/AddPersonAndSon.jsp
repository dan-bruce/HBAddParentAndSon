<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>add Parent and Son </title>
</head>

<body>
<s:form action="add.action" method="post">
    <s:textfield name="name" label="name: "/>
    <s:textfield name="gender" label="gender:"/>
    <s:textfield name="sonName" label= "Son Name:"/>
    <s:textfield name="sonAge" label="Son Age:"/>
    <s:submit value="submit"/>
</s:form>
</body>
</html>
