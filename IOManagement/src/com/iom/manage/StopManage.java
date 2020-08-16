package com.iom.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iom.db.db_getConnect;
import com.iom.model.BillingRules;
import com.iom.model.StopInfo;

public class StopManage {
	
	//获取临时停车场信息
	public static List<StopInfo> getAllStopInfo(){
		List<StopInfo> stopList = new ArrayList<StopInfo>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from StopInfo";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				StopInfo stop = new StopInfo();
				stop.setStopId(rs.getString("stopId"));
				stop.setAddress(rs.getString("address"));
				stop.setPhoneNum(rs.getString("phoneNum"));
				stop.setOpenTime(rs.getString("openTime"));
				stop.setStopName(rs.getString("stopName"));
				stop.setStopNum(rs.getInt("stopNum"));
				stop.setWorker(rs.getString("worker"));
				stop.setState(rs.getInt("state"));
				stop.setBillingRules(rs.getString("billingRules"));
				
				stopList.add(stop);
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stopList;
	}
	
	//按条件查询停车场信息
	public static List<StopInfo> getAllStopInfo(String stopId,String stopName,String worker,String state){
		List<StopInfo> stopList = new ArrayList<StopInfo>();
		
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "select * from StopInfo where stopId=? or stopName=? or worker=? or state=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, stopId);
			pstm.setString(2, stopName);
			pstm.setString(3, worker);
			pstm.setInt(4, state);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				StopInfo stop = new StopInfo();
				stop.setStopId(rs.getString("stopId"));
				stop.setAddress(rs.getString("address"));
				stop.setPhoneNum(rs.getString("phoneNum"));
				stop.setOpenTime(rs.getString("openTime"));
				stop.setStopName(rs.getString("stopName"));
				stop.setStopNum(rs.getInt("stopNum"));
				stop.setWorker(rs.getString("worker"));
				stop.setState(rs.getInt("state"));
				stop.setBillingRules(rs.getString("billingRules"));
				
				stopList.add(stop);
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stopList;
	}
	
	//新增停车场信息
	public static void insertStopInfo(StopInfo stopInfo) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql = "insert into StopInfo values(?,?,?,?,?,?,?,?,?)";
		try {
			Connection con =  db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, stopInfo.getStopId());
			pstm.setString(2, stopInfo.getStopName());
			pstm.setString(3, stopInfo.getWorker());
			pstm.setString(4, stopInfo.getPhoneNum());
			pstm.setInt(5, stopInfo.getState());
			pstm.setString(6, stopInfo.getAddress());
			pstm.setString(7, stopInfo.getOpenTime());
			pstm.setInt(8, stopInfo.getStopNum());
			pstm.setString(9, stopInfo.getBillingRules());
			pstm.execute();
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//修改停车场信息
	public static void updateStopInfo(StopInfo newinfo) {
		deleteStopInfo(newinfo.getStopId());
		insertStopInfo(newinfo);
	}
	
	//删除停车场信息
	public static void deleteStopInfo(String  stopId) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql  = "delete from StopInfo where stopId=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, stopId);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取计费规则
	public static List<BillingRules> getAllBillingRules() {
		List<BillingRules> ruleList = new ArrayList<BillingRules>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql  = "select * from BillingRules";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				BillingRules rule = new BillingRules();
				rule.setRuleNum(rs.getString("ruleNum"));
				rule.setRuleName(rs.getString("ruleName"));
				rule.setRuleType(rs.getString("ruleType"));
				rule.setChargeType(rs.getString("chargeType"));
				rule.setChargeRule(rs.getString("chargeRule"));
				rule.setFreeTime(rs.getString("freeTime"));
				rule.setChargeLimit(rs.getInt("chargeLimit"));
				rule.setUsedNum(rs.getInt("usedNum"));
				
				ruleList.add(rule);
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ruleList;
		
	}
	
	//按条件查询计费规则
	public static List<BillingRules> getAllBillingRules(String ruleNum,String ruleName,String ruleType,String freeTime) {
		List<BillingRules> ruleList = new ArrayList<BillingRules>();
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql  = "select * from BillingRules where ruleNum=? or ruleName=? or ruleType=? or freeTime=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, ruleNum);
			pstm.setString(2, ruleName);
			pstm.setString(3, ruleType);
			pstm.setString(4, freeTime);
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				BillingRules rule = new BillingRules();
				rule.setRuleNum(rs.getString("ruleNum"));
				rule.setRuleName(rs.getString("ruleName"));
				rule.setRuleType(rs.getString("ruleType"));
				rule.setChargeType(rs.getString("chargeType"));
				rule.setChargeRule(rs.getString("chargeRule"));
				rule.setFreeTime(rs.getString("freeTime"));
				rule.setChargeLimit(rs.getInt("chargeLimit"));
				rule.setUsedNum(rs.getInt("usedNum"));
				
				ruleList.add(rule);
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruleList;
	}
	
	//新增计费规则
	public static void insertRule(BillingRules rule) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql  ="insert into BillingRules values(?,?,?,?,?,?,?,?)";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, rule.getRuleNum());
			pstm.setString(2, rule.getRuleName());
			pstm.setString(3, rule.getRuleType());
			pstm.setString(4, rule.getChargeType());
			pstm.setString(5, rule.getChargeRule());
			pstm.setString(6, rule.getFreeTime());
			pstm.setInt(7, rule.getChargeLimit());
			pstm.setInt(8, rule.getUsedNum());
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//修改计费规则
	public static void updataRule(BillingRules newRule) {
		deleteRule(newRule.getRuleNum());
		insertRule(newRule);
	}
	
	//删除计费规则
	public static void deleteRule(String ruleNum) {
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		String sql  ="delete from BillingRules where ruleNum=?";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, ruleNum);
			pstm.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
