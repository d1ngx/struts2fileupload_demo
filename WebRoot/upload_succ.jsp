<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
	<title>上传成功页面</title>
	</head>
	<body>
		上传成功！<br>
		文件标题：<s:property value="title"/><br>
		文件为：<img src="<s:property value="'upload/'+uploadFileName"/>"/>
	</body>
</html> 
