package com.iom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iom.manage.CarRegisterManage;
import com.iom.model.CarRegisterInfo;

/**
 * Servlet implementation class Servlet_RegistCar
 */
@WebServlet("/Servlet_RegistCar")
public class Servlet_RegistCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_RegistCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String nodeName = (String) session.getAttribute("nodeName");
		int state = (int) session.getAttribute("state");
		String registPro = (String) session.getAttribute("registPro");
		String userName = (String) session.getAttribute("userName");
		int floorNum = (int) session.getAttribute("floorNum");
		int roomNum = (int) session.getAttribute("roomNum");
		String phoneNum = (String) session.getAttribute("phoneNum");
		int chargeType = (int) session.getAttribute("chargeType");
		int charge = (int) session.getAttribute("charge");
		int carType = (int) session.getAttribute("carType");
		int useLimit = (int) session.getAttribute("useLimit");
		String carNum = (String) session.getAttribute("carNum");
		String effectImmediate = (String) session.getAttribute("effectImmediate");
		String beginTime = (String) session.getAttribute("beginTime");
		String endTime = (String) session.getAttribute("endTime");
		String isAllday = (String) session.getAttribute("isAllday");
		String usageTime = (String) session.getAttribute("usageTime");
		String explain = (String) session.getAttribute("explain");
		
		CarRegisterInfo regist = new CarRegisterInfo(nodeName, state, registPro, userName, floorNum, roomNum, phoneNum,
				chargeType, charge, carType, useLimit, carNum, effectImmediate, beginTime, endTime, isAllday, usageTime, explain);
		CarRegisterManage.insertRegistInfo(regist);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
