package com.iom.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.iom.db.db_getConnect;
import com.iom.model.CarInfo;

public class InvestigateManege {

	// 查询车辆信息
	public static List<CarInfo> SelectCarInfo(String carNum, String carType, String isBlacker) {
		List<CarInfo> carList = new ArrayList<CarInfo>();
		db_getConnect.username = "zsc";
		db_getConnect.password = "123456";
		String sql = "select CarRegisterInfo.carNum,registPro,carType,userName,phoneNum from CarRegisterInfo,CarAccessRecord,BlackerInfo where CarRegisterInfo.carNum=CarAccessRecord.carNum and CarRegisterInfo.carNum=BlackerInfo.carNum";
		String carPro = "select * from CarRegisterInfo where carNum=?";
		String allCharge = "select sum(charge) from CarAccessRecord where carNum=?";
		String accessNum = "select count(*) from CarAccessRecord where carNum=?";
		String blacker = "select * from BlackerInfo where carNum=?";
		String lastAccess = "select * from CarAccessRecord where carNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return carList;
	}
}
