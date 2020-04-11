package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ReadServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	String uName=req.getParameter("uname");
	long phNo=Long.parseLong(req.getParameter("phno"));
	res.sendRedirect("http://localhost:8084/TestApp2/dis?uname="+uName+"&phno="+phNo);
	}
	}
