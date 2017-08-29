package com.neu.safety.bean;

public class Safedanger {
	private int id;
	private String daTitle;		//隐患标题
	private String daContent;	//隐患内容
	private String checkDate;	//检查日期
	private String checkType;	//检查类型
	private String troubleType;	//问题类型
	private String resDepart;	//责任部门
	private String imagePath;	//图片路径
	private int daState;		//隐患状态
	private String reportPerson;//报告人
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDaTitle() {
		return daTitle;
	}
	public void setDaTitle(String daTitle) {
		this.daTitle = daTitle;
	}
	public String getDaContent() {
		return daContent;
	}
	public void setDaContent(String daContent) {
		this.daContent = daContent;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public String getTroubleType() {
		return troubleType;
	}
	public void setTroubleType(String troubleType) {
		this.troubleType = troubleType;
	}
	public String getResDepart() {
		return resDepart;
	}
	public void setResDepart(String resDepart) {
		this.resDepart = resDepart;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public int getDaState() {
		return daState;
	}
	public void setDaState(int daState) {
		this.daState = daState;
	}
	public String getReportPerson() {
		return reportPerson;
	}
	public void setReportPerson(String reportPerson) {
		this.reportPerson = reportPerson;
	}
	
}
