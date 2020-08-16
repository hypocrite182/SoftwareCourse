package com.iom.model;

public class CheckingBlackerInfo {

	private String carNum;//���ƺ�
	private String stopName;//ͣ��������
	private String nodeName;//С������
	private String reason;//����ԭ��
	private String addName;//���������
	private String addTime;//���ʱ��

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
