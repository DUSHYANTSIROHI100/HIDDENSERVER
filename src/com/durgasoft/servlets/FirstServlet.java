package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
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
		out.println("<html><body bgcolor='lightyellow'>");
		out.println("<center><b><br><br>");
		out.println("Welcome to Student Application");
		out.println("<br><br>");
		out.println("<form method='POST' action='./second'>");
		out.println("<input type='hidden' name=sname value='"+sname+"'>");
		out.println("<input type='hidden' name=sid value='"+sid+"'>");
		out.println("<input type='hidden' name=saddr value='"+saddr+"'>");
		out.println("<br><br>");
		out.println("Student Age:");
		out.println("<input type='text' name='sage'>");
		out.println("<br><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form></b></center></body></html>");
	}
}