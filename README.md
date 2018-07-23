# struts2fileupload_demo
利用Struts2实现文件上传<br>
Struts2是通过Common FileUpload文件上传。Common FileUpload通过将HTTP中的数据保存到临时文件夹，然后Struts使用FileUpload拦截器将文件绑定到
Action实例中，从而能够以本地文件的方式操作浏览器上传的文件。<br>
1.具体实现<br>
提示：需添加commons-fileupload1.2.jar和common-io-1.3.2.jar<br>
1）创建upload.jsp，用<s:file>标签将文件上传控件绑定到Action的upload属性<br>
2）创建UploadAction.java<br>
3）创建upload_succ.jsp<br>
2.Action的配置文件<br>
1）配置Action，添加fileUpload拦截器<br>
2）定义资源文件的类型常量<br>
3）添加资源文件输出错误信息<br>
4）Jsp显示错误提示。在上传页面加入<s:fielderror/>标签<br>
3.web.xml配置文件<br>
![image](https://github.com/ericdoomed/struts2fileupload_demo/blob/master/src/pics/01.PNG)
![image](https://github.com/ericdoomed/struts2fileupload_demo/blob/master/src/pics/02.PNG)
