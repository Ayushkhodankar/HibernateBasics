package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;



@WebServlet("/updateuser")
public class UpdateUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fullname=request.getParameter("name");
		System.out.println(fullname);
		RequestDispatcher dispatcher=request.getRequestDispatcher("updatenew.jsp");
		User u=new User(fullname);
		String msg= new UserDao().updateUser(u);
		if(msg.equals(null))
		{
			out.print("<p>not updated</p>");
			dispatcher.include(request, response);
		}else
		{
			out.print("<p>updated</p>");
			dispatcher.include(request, response);
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
