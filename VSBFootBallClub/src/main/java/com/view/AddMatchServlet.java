package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( "/AddMatch" )
public class AddMatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
	ArrayList<String> list = (ArrayList<String>) request.getAttribute("errors");
	 out.println("<html>");
     out.println("<head>");
     out.println("<style>");
     out.println("body { font-family: Arial, sans-serif; background-color: #f2f2f2; margin: 50px; }");
     out.println("h2 { color: #333; }");
     out.println("form { background-color: #fff; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
     out.println("input[type='text'], input[type='datetime'] { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 3px; }");
     out.println("input[type='submit'] { background-color: #4CAF50; color: white; border: none; padding: 10px 20px; cursor: pointer; border-radius: 3px; }");
     out.println("input[type='submit']:hover { background-color: #45a049; }");
     out.println("ul { list-style-type: none; padding: 0; }");
     out.println("li { color: red; }");
     out.println("</style>");
     out.println("</head>");
     out.println("<body>");
		 if (list != null) {
	            Iterator<String> itr = list.iterator();
	            out.println("<ul>");
	            while (itr.hasNext()) {
	                out.println("<li>" + itr.next() + "</li>");
	            }
	            out.println("</ul>");
	        }

		out.println("<html>");
		out.println("<body>");
		out.println("<h2> Add Match Details </h2>");
		out.println("<form action='AddMatchCon'  method='post' >");
		out.println("Title <input type='text' name='title' > <br><br> ");
		out.println("Place <input type='text' name='place' > <br><br> ");
		out.println("Match Date <input type='datetime' name='date' > <br><br> ");
		out.println("<input type='submit' value='Submit' > ");
		out.println("</form> </body> </html> ");

	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
