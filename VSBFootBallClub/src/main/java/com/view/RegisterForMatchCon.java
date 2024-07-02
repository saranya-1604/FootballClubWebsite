package com.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Match;
import com.model.MatchDao;

/**
 * Servlet implementation class RegisterForMatchCon
 */
@WebServlet("/RegisterForMatchCon")
public class RegisterForMatchCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name").trim();
		String age = request.getParameter("age").trim();
		String title = request.getParameter("title").trim();
		String place = request.getParameter("place").trim();
		String dt = request.getParameter("date").trim();

		ArrayList<String> list = new ArrayList<>();
		if(name.length()==0) {
			list.add("Enter name field");
		}
		if(title.length()==0) {
			list.add("Enter title field");
		}
		if(place.length()==0) {
			list.add("Enter place field");
		}

		if(!list.isEmpty()) {
			request.setAttribute("errors" , list);
			RequestDispatcher rd = request.getRequestDispatcher("/RegisterForMatch");
			rd.forward(request, response);
			return;
		}


	Match m = new Match(name,age,title,place,dt);
		MatchDao md = new MatchDao();
		md.storeData(m);
		RequestDispatcher rd1 = request.getRequestDispatcher("Acknowledgement.html");
		rd1.forward(request, response);


	}

}
