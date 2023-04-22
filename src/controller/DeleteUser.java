package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.*;


@WebServlet("/deleteuser")
public class DeleteUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String d=request.getParameter("id");
		System.out.println("value"+d);
		
		boolean b=new UserDao().deleteUser(d);
				
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
		
		if(b=true)
		{out.print("<br/><br/><br/><p style='color:'green''>Username deleted Successfully</p>");
		response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("index.jsp");
		}
		}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
