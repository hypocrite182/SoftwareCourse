package com.iom.model;

public class CarInfo {
	private String carNum;//车牌号
	private String carPro;//是否登记
	private int carType;//车辆类型
	private String userName;//车主名字
	private String phoneNum;//电话号码
	private int accessNum;//进出次数
	private int allCharge;//总共产生费用
	private int isBlacker;//是否黑名单
	private String lastAccess;//最后一次进入小区时间

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
