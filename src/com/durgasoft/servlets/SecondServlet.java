package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("sname");
		String sid=request.getParameter("sid");
		String saddr=request.getParameter("saddr");
		String sage=request.getParameter("sage");
		out.println("<html><body bgcolor='lightyellow'>");
		out.println("<center><b><br><br>");
		out.println("Student Details Are...");
		out.println("<br><br>");
		out.println("Student Name....."+sname+"<br><br>");
		out.println("Student Id....."+sid+"<br><br>");
		out.println("Student Address....."+saddr+"<br><br>");
		 }
		}


