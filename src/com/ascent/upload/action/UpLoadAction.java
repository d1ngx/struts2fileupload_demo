package com.ascent.upload.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpLoadAction extends ActionSupport {
	//标题字段
	private String title;
	
	//上传文件属性字段  用File类型封装
	private File upload;
	//struts2中要求定义文件字段+FileName和 +ContentType的两个字段来封装文件名和文件类型
	private String uploadFileName;
	private String uploadContentType;
	
	//保存路径属性，该属性的值可以通过配置文件来设置，从而动态注入
	private String savePath;
	
	
	//接受依赖注入的方法
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	//返回上传文件的保存路径
	@SuppressWarnings("deprecation")
	public String getSavePath() throws Exception{
		return ServletActionContext.getRequest().getRealPath(savePath);
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public String execute() throws Exception{
		//以服务器的文件保存地址和原文件的名  建立上传文件输出流
		FileOutputStream fos = new FileOutputStream(this.getSavePath()+"\\"+this.getUploadFileName());
		
		//以上传文件建立一个文件上传流
		FileInputStream fis = new FileInputStream(this.getUpload());
		
		//将上传文件的内容写入服务器
		byte [] buffer = new byte[1024];
		int len=0;
		while((len=fis.read(buffer))>0){
			fos.write(buffer, 0, len);
		}
		System.out.println("结束上传单个文件-----------------------");
		return SUCCESS;
	}
	
} 
