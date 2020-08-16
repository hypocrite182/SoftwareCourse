package com.iom.model;

public class BlackerInfo {

	private String carNum;//���ƺ�
	private String stopName;//ͣ��������
	private String nodeName;//С������
	private String reason;//����ԭ��
	private String addName;//���������
	private String addTime;//���ʱ��
	private String reviewerName;//���������
	private String reviewTime;//���ʱ��
	private String state; //״̬
	
	public BlackerInfo(String carNum, String stopName, String nodeName, String reason, String addName, String addTime,
			String reviewerName, String reviewTime, String state) {
		this.carNum = carNum;
		this.stopName = stopName;
		this.nodeName = nodeName;
		this.reason = reason;
		this.addName = addName;
		this.addTime = addTime;
		this.reviewerName = reviewerName;
		this.reviewTime = reviewTime;
		this.state = state;
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
		this.nodeName = nodeName;
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
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public String getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
