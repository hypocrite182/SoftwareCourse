package com.iom.model;

public class StopInfo {

	private String stopId;//ͣ����
	private String stopName;//ͣ��������
	private String worker;//ֵ����
	private String phoneNum;//�绰����
	private String state;//״̬
	private String address;//��ַ
	private String openTime;//����ʱ��
	private int stopNum;//��λ����
	private String billingRules;//�շѹ���
	
	public StopInfo(String stopId, String stopName, String worker, String phoneNum, String state, String address,
			String openTime, int stopNum, String billingRules) {
		super();
		this.stopId = stopId;
		this.stopName = stopName;
		this.worker = worker;
		this.phoneNum = phoneNum;
		this.state = state;
		this.address = address;
		this.openTime = openTime;
		this.stopNum = stopNum;
		this.billingRules = billingRules;
	}
	
	public String getStopId() {
		return stopId;
	}
	public void setStopId(String stopId) {
		this.stopId = stopId;
	}
	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public int getStopNum() {
		return stopNum;
	}
	public void setStopNum(int stopNum) {
		this.stopNum = stopNum;
	}
	public String getBillingRules() {
		return billingRules;
	}
	public void setBillingRules(String billingRules) {
		this.billingRules = billingRules;
	}
	
}
