package com.subrutin.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/halo")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Halo Servlet";
		String docType ="<!DOCTYPE html>";
	    out.println(docType+"<html><head><title>"
	    		+ title
	    		+ "</title></head>"
	    		+ "<body>Halo ini servlet 4</body></html>");

	}

}
