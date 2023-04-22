package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;


@WebServlet("/ayush")
public class InsertUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("name");
		
		User u=new User(name);
		String msg=new UserDao().insert(u);
		if(!msg.equals(null))
		{
			out.print("<br/><br/><br/><p style='color:'green''>USer Added Successfully</p>");

			request.getRequestDispatcher("index.jsp").include(request, response);
		}else
		{
			out.print("<br/><br/><br/><p style='color:'red''>please do not leave column empty</p>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		
		}
		
		
	}

}
