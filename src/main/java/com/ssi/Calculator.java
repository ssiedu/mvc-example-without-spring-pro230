package com.ssi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//Controller

public class Calculator extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//reads the request
		int amount=Integer.parseInt(request.getParameter("t1"));
		int time=Integer.parseInt(request.getParameter("t2"));
		
		//get this request processed by service class.
		InterestService service=new InterestService();
		InterestModel model=service.compute(amount,time);
		
		//storing the model object to session so that view can access it from session
		HttpSession session=request.getSession();
		session.setAttribute("model", model);
		
		//will forward the request to view for presentation
		response.sendRedirect("result.jsp");
		
		
	}

}
