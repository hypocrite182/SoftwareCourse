package com.iom.model;

public class CarInfo {
	private String carNum;//���ƺ�
	private String carPro;//�Ƿ�Ǽ�
	private int carType;//��������
	private String userName;//��������
	private String phoneNum;//�绰����
	private int accessNum;//��������
	private int allCharge;//�ܹ���������
	private int isBlacker;//�Ƿ������
	private String lastAccess;//���һ�ν���С��ʱ��

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}
	
	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getRegistPro() {
		return carPro;
	}

	public void setRegistPro(String carPro) {
		this.carPro = carPro;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAccessNum() {
		return accessNum;
	}

	public void setAccessNum(int accessNum) {
		this.accessNum = accessNum;
	}

	public int getAllCharge() {
		return allCharge;
	}

	public void setAllCharge(int allCharge) {
		this.allCharge = allCharge;
	}

	public int getIsBlacker() {
		return isBlacker;
	}

	public void setIsBlacker(int isBlacker) {
		this.isBlacker = isBlacker;
	}

	public String getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
	}

}
