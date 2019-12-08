package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		PrintWriter out = res.getWriter();
//		out.println("HI");
//		int square=(int) req.getAttribute("c");
////		PrintWriter out=res.getWriter();
//		out.println("Result is "+square);
		System.out.println("do post");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		int square=(int) req.getAttribute("c");
//		square=square*square;
		PrintWriter out=res.getWriter();
		int square=Integer.parseInt(req.getParameter("c"));
		square=square*square;
		out.println("Result is "+square);

		System.out.println("do get");

	}
}
