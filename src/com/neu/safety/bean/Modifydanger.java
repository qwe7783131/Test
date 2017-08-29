package com.neu.safety.bean;

public class Modifydanger {
	private int id;
	private String modDetail;	//整改情况
	private String modPerson;	//隐患内容
	private String modImagePath;	//图片路径
	private String modDate;	//检查日期
	private int daId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModDetail() {
		return modDetail;
	}
	public void setModDetail(String modDetail) {
		this.modDetail = modDetail;
	}
	public String getModPerson() {
		return modPerson;
	}
	public void setModPerson(String modPerson) {
		this.modPerson = modPerson;
	}
	public String getModImagePath() {
		return modImagePath;
	}
	public void setModImagePath(String modImagePath) {
		this.modImagePath = modImagePath;
	}
	public String getModDate() {
		return modDate;
	}
	public void setModDate(String modDate) {
		this.modDate = modDate;
	}
	public int getDaId() {
		return daId;
	}
	public void setDaId(int daId) {
		this.daId = daId;
	}
	
	
}
