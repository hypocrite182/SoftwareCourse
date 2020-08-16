package com.iom.model;

public class CheckingBlackerInfo {

	private String carNum;//车牌号
	private String stopName;//停车场名字
	private String nodeName;//小区名字
	private String reason;//拉黑原因
	private String addName;//添加人姓名
	private String addTime;//添加时间

	public CheckingBlackerInfo(String carNum, String stopName, String nodeName, String reason, String addName,
			String addTime) {
		super();
		this.carNum = carNum;
		this.stopName = stopName;
		this.nodeName = nodeName;
		this.reason = reason;
		this.addName = addName;
		this.addTime = addTime;
	}
	
	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		nodeName = nodeName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
}
