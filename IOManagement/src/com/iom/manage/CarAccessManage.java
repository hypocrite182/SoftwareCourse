package com.iom.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iom.db.db_getConnect;
import com.iom.model.BlackerInfo;
import com.iom.model.CarAccessRecord;
import com.iom.model.CheckingBlackerInfo;

public class CarAccessManage {
	
	//��ȡȫ������������¼
	public static List<CarAccessRecord> getAllRecord(){
		List<CarAccessRecord> recordList = new ArrayList<CarAccessRecord>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from CarAccessRecord";
		
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				CarAccessRecord record = new CarAccessRecord();
				record.setRecordNum(rs.getString("recordNum"));
				record.setCarNum(rs.getString("carNum"));
				record.setCarType(rs.getInt("carType"));
				record.setCharge(rs.getString("charge"));
				record.setEntryNodeName(rs.getString("entryNodeName"));
				record.setNetryTime(rs.getString("netryTime"));
				record.setExitNodeName(rs.getString("exitNodeName"));
				record.setExitTime(rs.getString("exitTime"));
				record.setParkingTime(rs.getString("parkingTime"));
				record.setStopName(rs.getString("stopName"));
				record.setWatchman(rs.getString("watchman"));
				
				recordList.add(record);
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return recordList;
	}
	
	//��������ѯ����������¼
	public static List<CarAccessRecord> getAllRecord(String carNum){
		List<CarAccessRecord> recordList = new ArrayList<CarAccessRecord>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from CarAccessRecord where carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, carNum);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				CarAccessRecord record = new CarAccessRecord();
				record.setRecordNum(rs.getString("recordNum"));
				record.setCarNum(rs.getString("carNum"));
				record.setCarType(rs.getInt("carType"));
				record.setCharge(rs.getString("charge"));
				record.setEntryNodeName(rs.getString("entryNodeName"));
				record.setNetryTime(rs.getString("netryTime"));
				record.setExitNodeName(rs.getString("exitNodeName"));
				record.setExitTime(rs.getString("exitTime"));
				record.setParkingTime(rs.getString("parkingTime"));
				record.setStopName(rs.getString("stopName"));
				record.setWatchman(rs.getString("watchman"));
				
				recordList.add(record);
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return recordList;
	}
	
	//ɾ������������¼
	public static void deleteRecord(String recordNum) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "delete from CarAccessRecord where recordNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, recordNum);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ��������������
	public static List<BlackerInfo> getBlackList(){
		List<BlackerInfo> blackList = new ArrayList<BlackerInfo>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from BlackerInfo";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				BlackerInfo black = new BlackerInfo();
				black.setNodeName(rs.getString("nodeName"));
				black.setCarNum(rs.getString("carNum"));
				black.setAddName(rs.getString("addName"));
				black.setAddTime(rs.getString("addTime"));
				black.setReason(rs.getString("reason"));
				black.setReviewerName(rs.getString("reviewerName"));
				black.setReviewTime(rs.getString("reviewTime"));
				black.setState(rs.getInt("state"));
				black.setStopName(rs.getString("stopName"));
				
				blackList.add(black);
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blackList;
	}
	
	//���복����������˺�����
	public static void insertCheckingBlacker(CheckingBlackerInfo newBlacker) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql ="insert into CheckingBlackerInfo values(?,?,?,?,?,?)";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, newBlacker.getCarNum());
			pstm.setString(2, newBlacker.getStopName());
			pstm.setString(3, newBlacker.getNodeName());
			pstm.setString(4, newBlacker.getReason());
			pstm.setString(5, newBlacker.getAddTime());
			pstm.setString(6, newBlacker.getAddName());
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�������ͨ��������
	public static void insertBlacker(BlackerInfo blacker) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql ="insert into BlackerInfo values(?,?,?,?,?,?,?,?,?)";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, blacker.getCarNum());
			pstm.setString(2, blacker.getStopName());
			pstm.setString(3, blacker.getNodeName());
			pstm.setString(4, blacker.getReason());
			pstm.setString(5, blacker.getAddTime());
			pstm.setString(6, blacker.getAddName());
			pstm.setString(7, blacker.getReviewTime());
			pstm.setString(8, blacker.getReviewerName());
			pstm.setInt(9, blacker.getState());
			pstm.execute();
			con.close();
			deleteCheckingBlacker(blacker.getCarNum());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//����Ѵ����Ӵ���������Ƴ�
	public static void deleteCheckingBlacker(String carNum) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql ="delete from CheckingBlackerInfo where carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, carNum);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�Ƴ�������
	public static void deleteBlacker(String carNum) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql ="delete from BlackerInfo where carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, carNum);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
