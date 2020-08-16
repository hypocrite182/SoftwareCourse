package com.iom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iom.manage.StopManage;
import com.iom.model.StopInfo;

/**
 * Servlet implementation class Servlet_UpdateStop
 */
@WebServlet("/Servlet_UpdateStop")
public class Servlet_UpdateStop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_UpdateStop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String stopId = (String) session.getAttribute("stopId");
		String stopName = (String) session.getAttribute("stopName");
 		String worker = (String) session.getAttribute("worker");
		String phoneNum = (String) session.getAttribute("phoneNum");
		String state = (String) session.getAttribute("state");
		String address = (String) session.getAttribute("address");
		String openTime = (String) session.getAttribute("openTime");
		int stopNum = (int) session.getAttribute("stopNum");
		String billingRules = (String) session.getAttribute("billingRules");
		StopInfo stopInfo = new StopInfo(stopId,stopName,worker,phoneNum,state,address,openTime,stopNum,billingRules);
		StopManage.updateStopInfo(stopInfo);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
