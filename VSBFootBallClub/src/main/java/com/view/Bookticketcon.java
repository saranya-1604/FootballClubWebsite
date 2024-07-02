package com.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Match;
import com.model.MatchDao;

/**
 * Servlet implementation class Bookticketcon
 */
@WebServlet("/Bookticketcon")
public class Bookticketcon extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age= request.getParameter("age");
//		int age=Integer.parseInt(a);
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String match=request.getParameter("match");
		String matchdate=request.getParameter("matchdate");
		List list=new ArrayList();
		if(name.length()== 0)
			list.add("enter name");
//		if(age<18)
//			list.add("you are under age");
//		if(address.length()== 0)
//			list.add("enter address");
		if(match.length()== 0)
			list.add("enter match");
		
		
		if(!list.isEmpty()) {
			request.setAttribute("errors", list);
			RequestDispatcher rd=request.getRequestDispatcher("BookTicket.jsp");
			rd.forward(request, response);
			return;
		}
		Match m = new Match(name , age , gender,address,match,matchdate);
		MatchDao md = new MatchDao();
		md.storeticketbookingData(m);
		RequestDispatcher rd1 = request.getRequestDispatcher("Acknowledgement.html");
		rd1.forward(request, response);

	}
	

}
