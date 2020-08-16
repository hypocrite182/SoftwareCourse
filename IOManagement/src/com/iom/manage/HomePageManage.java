package com.iom.manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePageManage {
	
	public List<String> getNode() {
		List<String> nodeList = new ArrayList<String>();
		
		return nodeList;
	}
	
	public int getIoNum() {
		int num=0;
		
		return num;
	}

	public int getCharged() {
		int charged=0;
		
		return charged;
	}
	
	public int getWaitForCharged() {
		int charged=0;
		
		return charged;
	}
	
	public Map<String, Integer> getRemainStops() {
		int allStops = 0;
		int remainStops = 0;
		int usedStops = 0;
		Map<String, Integer> stop = new HashMap<String, Integer>();
		stop.put("allStops",allStops);
		stop.put("remainStops",remainStops);
		stop.put("usedStops",usedStops);
		return stop;
	}
	
	public List<Integer> getDailyIncome() {
		List<Integer> income = new ArrayList<Integer>();
		
		return income;
	}
	
	public List<Integer> getDailyUsedStops() {
		List<Integer> usedStops = new ArrayList<Integer>();
		
		return usedStops;
	}
	
	public List<Integer> getDailyCarNum() {
		List<Integer> ioCarNum = new ArrayList<Integer>();
		
		return ioCarNum;
	}
	
	public boolean getNodeState() {
		boolean state = true;
		
		return state;
	}
}
