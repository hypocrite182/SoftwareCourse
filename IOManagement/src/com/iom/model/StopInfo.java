package com.iom.model;

public class StopInfo {

	private String stopId;//停车场
	private String stopName;//停车场名字
	private String worker;//值班人
	private String phoneNum;//电话号码
	private String state;//状态
	private String address;//地址
	private String openTime;//开放时间
	private int stopNum;//车位数量
	private String billingRules;//收费规则
	
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
