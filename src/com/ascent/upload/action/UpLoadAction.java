package com.ascent.upload.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpLoadAction extends ActionSupport {
	//�����ֶ�
	private String title;
	
	//�ϴ��ļ������ֶ�  ��File���ͷ�װ
	private File upload;
	//struts2��Ҫ�����ļ��ֶ�+FileName�� +ContentType�������ֶ�����װ�ļ������ļ�����
	private String uploadFileName;
	private String uploadContentType;
	
	//����·�����ԣ������Ե�ֵ����ͨ�������ļ������ã��Ӷ���̬ע��
	private String savePath;
	
	
	//��������ע��ķ���
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	//�����ϴ��ļ��ı���·��
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
		//�Է��������ļ������ַ��ԭ�ļ�����  �����ϴ��ļ������
		FileOutputStream fos = new FileOutputStream(this.getSavePath()+"\\"+this.getUploadFileName());
		
		//���ϴ��ļ�����һ���ļ��ϴ���
		FileInputStream fis = new FileInputStream(this.getUpload());
		
		//���ϴ��ļ�������д�������
		byte [] buffer = new byte[1024];
		int len=0;
		while((len=fis.read(buffer))>0){
			fos.write(buffer, 0, len);
		}
		System.out.println("�����ϴ������ļ�-----------------------");
		return SUCCESS;
	}
	
} 
