package com.iom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iom.manage.StopManage;

/**
 * Servlet implementation class Servlet_SelectRule
 */
@WebServlet("/Servlet_SelectRule")
public class Servlet_SelectRule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_SelectRule() {
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
		String freeTime = (String) session.getAttribute("freeTime");
		StopManage.getAllBillingRules(ruleNum, ruleName, ruleType, freeTime);
		//返回前端数据
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
