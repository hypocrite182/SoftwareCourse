package com.iom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iom.manage.StopManage;
import com.iom.model.BillingRules;

/**
 * Servlet implementation class Servlet_UpdateRule
 */
@WebServlet("/Servlet_UpdateRule")
public class Servlet_UpdateRule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_UpdateRule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String ruleNum = (String) session.getAttribute("ruleNum");
		String ruleName = (String) session.getAttribute("ruleName");
		String ruleType = (String) session.getAttribute("ruleType");
		String chargeType = (String) session.getAttribute("chargeType");
		String chargeRule = (String) session.getAttribute("chargeRule");
		String freeTime = (String) session.getAttribute("freeTime");
		int chargeLimit = (int) session.getAttribute("chargeLimit");
		int usedNum = (int) session.getAttribute("usedNum");
		
		BillingRules rule = new BillingRules(ruleNum,ruleName,ruleType,chargeType,chargeRule,freeTime,chargeLimit,usedNum);
		StopManage.updataRule(rule);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
