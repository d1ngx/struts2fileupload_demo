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
    
    <title>�򵥵��ļ��ϴ�ҳ��</title>
  </head>
  
  <body>
  <%--  ��ȡ������Ϣ  ����������struts��ǩʵ�� ����ʡ��
 <s:fielderror/>
   --%>

  <!--  Ϊ������ļ��ϴ������øñ���enctype����Ϊmultipart/form-data-->
  <s:form action="upload" method="post" enctype="multipart/form-data">
  
    	<s:textfield name="title" label="�ļ�����"/>
    	<s:file name="upload" label="ѡ���ļ�"/>
    	<s:submit value="�ϴ�"/>
  </s:form>
  </body>
</html> 
