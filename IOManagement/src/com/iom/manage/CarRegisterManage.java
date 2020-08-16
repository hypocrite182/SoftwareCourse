package com.iom.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iom.db.db_getConnect;
import com.iom.model.CarRegisterInfo;

public class CarRegisterManage {
	
	//获取全部已登记车辆信息
	public static List<CarRegisterInfo> getAllRegistedCar() {
		List<CarRegisterInfo> registList = new ArrayList<CarRegisterInfo>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from CarRegisterInfo";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				CarRegisterInfo regist = new CarRegisterInfo();
				regist.setNodeName(rs.getString("nodeName"));
				regist.setState(rs.getInt("state"));
				regist.setRegistPro(rs.getString("registPro"));
				regist.setUserName(rs.getString("userName"));
				regist.setFloorNum(rs.getInt("floorNum"));
				regist.setRoomNum(rs.getInt("roomNum"));
				regist.setPhoneNum(rs.getString("phoneNum"));
				regist.setChargeType(rs.getInt("chargeType"));
				regist.setCharge(rs.getInt("charge"));
				regist.setCarType(rs.getInt("carType"));
				regist.setUseLimit(rs.getInt("useLimit"));
				regist.setCarNum(rs.getString("carNum"));
				regist.setBeginTime(rs.getString("beginTime"));
				regist.setEndTime(rs.getString("endTime"));
				regist.setUsageTime(rs.getString("usageTime"));
				regist.setExplain(rs.getString("explain"));
				
				registList.add(regist);
				
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registList;
	}
	
	//按条件查询已登记车辆信息
	public static List<CarRegisterInfo> getRegistedCar(String nodeName,String registPro,String userName,String carNum) {
		List<CarRegisterInfo> registList = new ArrayList<CarRegisterInfo>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select distinct * from CarRegisterInfo where nodeName=? or registPro=? or userName=? or carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				CarRegisterInfo regist = new CarRegisterInfo();
				regist.setNodeName(rs.getString("nodeName"));
				regist.setState(rs.getInt("state"));
				regist.setRegistPro(rs.getString("registPro"));
				regist.setUserName(rs.getString("userName"));
				regist.setFloorNum(rs.getInt("floorNum"));
				regist.setRoomNum(rs.getInt("roomNum"));
				regist.setPhoneNum(rs.getString("phoneNum"));
				regist.setChargeType(rs.getInt("chargeType"));
				regist.setCharge(rs.getInt("charge"));
				regist.setCarType(rs.getInt("carType"));
				regist.setUseLimit(rs.getInt("useLimit"));
				regist.setCarNum(rs.getString("carNum"));
				regist.setBeginTime(rs.getString("beginTime"));
				regist.setEndTime(rs.getString("endTime"));
				regist.setUsageTime(rs.getString("usageTime"));
				regist.setExplain(rs.getString("explain"));
				
				registList.add(regist);
				
			}
			con.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registList;
	}
	
	//新增车辆登记登记
	public static void insertRegistInfo(CarRegisterInfo carInfo) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "insert into CarRegisterInfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, carInfo.getNodeName());
			pstm.setInt(2, carInfo.getState());
			pstm.setString(3, carInfo.getRegistPro());
			pstm.setString(4, carInfo.getUserName());
			pstm.setInt(5, carInfo.getFloorNum());
			pstm.setInt(6, carInfo.getRoomNum());
			pstm.setString(7, carInfo.getPhoneNum());
			pstm.setInt(8, carInfo.getChargeType());
			pstm.setInt(9, carInfo.getCharge());
			pstm.setInt(10, carInfo.getCarType());
			pstm.setInt(11, carInfo.getUseLimit());
			pstm.setString(12, carInfo.getCarNum());
			if(carInfo.getEffectImmediate().equals("1")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
				pstm.setString(13, sdf.format(new Date()));
			}
			else {
				pstm.setString(13, carInfo.getBeginTime());

			}
			pstm.setString(14, carInfo.getEndTime());
			if(carInfo.getIsAllday().equals("1")) {
				pstm.setString(15, "00:00~23:59");
			}
			else {
				pstm.setString(15, carInfo.getUsageTime());
			}
			pstm.setString(16, carInfo.getExplain());
			
			pstm.execute();
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//删除车辆登记信息
	public static void deleteRegistInfo(String nodeName,String carNum) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "delete from CarRegisterInfo where nodeName=? and carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, nodeName);
			pstm.setString(2, carNum);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//修改已登记车辆信息
	public static void updateRegistInfo(CarRegisterInfo newinfo) {
		deleteRegistInfo(newinfo.getNodeName(), newinfo.getCarNum());
		insertRegistInfo(newinfo);
	}
}
