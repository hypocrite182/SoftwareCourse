package com.iom.model;

public class CarAccessRecord {
	private String recordNum;//������¼���
	private String carNum;//���ƺ�
	private String stopName;//ͣ��������
	private String entryNodeName;//����С������
	private String netryTime;//����С��ʱ��
	private String carPro;//�Ƿ�Ǽ�
	private int carType;//��������
	private String Watchman;//ֵ����
	private String exitNodeName;//ʻ��С������
	private String exitTime;//ʻ��С��ʱ��
	private String charge;//����
	private String parkingTime;//ͣ��

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}
	
	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(String parkingTime) {
		this.parkingTime = parkingTime;
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

	public String getEntryNodeName() {
		return entryNodeName;
	}

	public void setEntryNodeName(String entryNodeName) {
		this.entryNodeName = entryNodeName;
	}

	public String getNetryTime() {
		return netryTime;
	}

	public void setNetryTime(String netryTime) {
		this.netryTime = netryTime;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}
	
	public String getCarPro() {
		return carPro;
	}

	public void setCarPro(String carPro) {
		this.carPro = carPro;
	}

	public String getWatchman() {
		return Watchman;
	}

	public void setWatchman(String watchman) {
		Watchman = watchman;
	}

	public String getExitNodeName() {
		return exitNodeName;
	}

	public void setExitNodeName(String exitNodeName) {
		this.exitNodeName = exitNodeName;
	}

	public String getExitTime() {
		return exitTime;
	}

	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
	}
}
