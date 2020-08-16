package com.iom.model;

public class BillingRules {
	
	private String ruleNum;//计费规则编号
	private String ruleName;//计费规则名
	private String ruleType;//计费规则类型
	private String chargeType;//收费类型
	private String chargeRule;//收费类型
	private String freeTime;//免费时长
	private int chargeLimit;//费用上限
	private int usedNum;//使用数量
	
	public String getRuleNum() {
		return ruleNum;
	}
	public void setRuleNum(String ruleNum) {
		this.ruleNum = ruleNum;
	}
	public BillingRules(String ruleNum, String ruleName, String ruleType, String chargeType, String chargeRule,
			String freeTime, int chargeLimit, int usedNum) {
		this.ruleNum = ruleNum;
		this.ruleName = ruleName;
		this.ruleType = ruleType;
		this.chargeType = chargeType;
		this.chargeRule = chargeRule;
		this.freeTime = freeTime;
		this.chargeLimit = chargeLimit;
		this.usedNum = usedNum;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getChargeRule() {
		return chargeRule;
	}
	public void setChargeRule(String chargeRule) {
		this.chargeRule = chargeRule;
	}
	public String getFreeTime() {
		return freeTime;
	}
	public void setFreeTime(String freeTime) {
		this.freeTime = freeTime;
	}
	public int getChargeLimit() {
		return chargeLimit;
	}
	public void setChargeLimit(int chargeLimit) {
		this.chargeLimit = chargeLimit;
	}
	public int getUsedNum() {
		return usedNum;
	}
	public void setUsedNum(int usedNum) {
		this.usedNum = usedNum;
	}
	
}
