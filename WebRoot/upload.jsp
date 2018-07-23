<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>简单的文件上传页面</title>
  </head>
  
  <body>
  <%--  获取错误信息  下面表单如果用struts标签实现 可以省略
 <s:fielderror/>
   --%>

  <!--  为了完成文件上传，设置该表单的enctype属性为multipart/form-data-->
  <s:form action="upload" method="post" enctype="multipart/form-data">
  
    	<s:textfield name="title" label="文件标题"/>
    	<s:file name="upload" label="选择文件"/>
    	<s:submit value="上传"/>
  </s:form>
  </body>
</html> 
