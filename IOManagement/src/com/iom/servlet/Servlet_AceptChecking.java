package com.iom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iom.manage.CarAccessManage;
import com.iom.model.BlackerInfo;

/**
 * Servlet implementation class Servlet_AceptChecking
 */
@WebServlet("/Servlet_AceptChecking")
public class Servlet_AceptChecking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_AceptChecking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String carNum = (String) session.getAttribute("carNum");
		String stopName = (String) session.getAttribute("stopName");
		String nodeName = (String) session.getAttribute("nodeName");
		String reason = (String) session.getAttribute("reason");
		String addName = (String) session.getAttribute("addName");
		String addTime = (String) session.getAttribute("addTime");
		String reviewerName = (String) session.getAttribute("reviewerName");
		String reviewTime = (String) session.getAttribute("reviewTime");
		String state = (String) session.getAttribute("state");
		BlackerInfo blacker = new BlackerInfo(carNum,stopName,nodeName,reason,addName,addTime,reviewerName,reviewTime,state);
		CarAccessManage.insertBlacker(blacker);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
