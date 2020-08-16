package com.iom.model;

public class CarRegisterInfo {
	
	private String nodeName;//С������
	private int state;//״̬
	private String registPro;//�Ǽ�����
	private String userName;//��������
	private int floorNum;//ҵ������������ס����
	private int roomNum;//���ƺ�
	private String phoneNum;//�绰����
	private int chargeType;//�ɷ�����
	private int charge;//����
	private int carType;//��������
	private int useLimit;//ʹ������
	private String carNum;//���ƺ�
	private String effectImmediate;//�Ƿ�������Ч
	private String beginTime;//��Чʱ��
	private String endTime;//ʧЧʱ��
	private String isAllday;//�Ƿ�ȫ�����
	private String usageTime;//����ʱ��
//	private String useSection;
	private String explain;//˵��
	
	public CarRegisterInfo(String nodeName, int state, String registPro, String userName, int floorNum, int roomNum,
			String phoneNum, int chargeType, int charge, int carType, int useLimit, String carNum,
			String effectImmediate, String beginTime, String endTime, String isAllday, String usageTime,
			String explain) {
		this.nodeName = nodeName;
		this.state = state;
		this.registPro = registPro;
		this.userName = userName;
		this.floorNum = floorNum;
		this.roomNum = roomNum;
		this.phoneNum = phoneNum;
		this.chargeType = chargeType;
		this.charge = charge;
		this.carType = carType;
		this.useLimit = useLimit;
		this.carNum = carNum;
		this.effectImmediate = effectImmediate;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.isAllday = isAllday;
		this.usageTime = usageTime;
		this.explain = explain;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getRegistPro() {
		return registPro;
	}
	public void setRegistPro(String registPro) {
		this.registPro = registPro;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getChargeType() {
		return chargeType;
	}
	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public int getUseLimit() {
		return useLimit;
	}
	public void setUseLimit(int useLimit) {
		this.useLimit = useLimit;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getEffectImmediate() {
		return effectImmediate;
	}
	public void setEffectImmediate(String effectImmediate) {
		this.effectImmediate = effectImmediate;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getIsAllday() {
		return isAllday;
	}
	public void setAllday(String isAllday) {
		this.isAllday = isAllday;
	}
	public String getUsageTime() {
		return usageTime;
	}
	public void setUsageTime(String usageTime) {
		this.usageTime = usageTime;
	}
	public String isUseSection() {
		return useSection;
	}
	public void setUseSection(String useSection) {
		this.useSection = useSection;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	
	
}
