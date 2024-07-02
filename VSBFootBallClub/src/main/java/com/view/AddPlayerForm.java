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
//import com.model.Match;
//import com.model.MatchDao;

/**
 * Servlet implementation class AddPlayerForm
 */
@WebServlet("/AddPlayerForm")
public class AddPlayerForm extends HttpServlet {
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
     out.println("input[type='text'], input[type='file'] { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 3px; }");
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
		out.println("<h2> Add Player Details </h2>");
		out.println("<form action='AddPlayerCon'  method='post' enctype='multipart/form-data' >");
		out.println("name <input type='text' name='name' > <br><br> ");
		out.println("age <input type='text' name='age' > <br><br> ");
		out.println("Profile <input type='file' name='profile' > <br><br> ");
		out.println("<input type='submit' value='Submit' > ");
		out.println("</form> </body> </html> ");

	}



	

}
