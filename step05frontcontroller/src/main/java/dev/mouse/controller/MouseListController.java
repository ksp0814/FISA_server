package dev.mouse.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.mouse.data.mouseDAO;
import dev.mouse.db.DBUtil;
import dev.mouse.model.Mouse;


public class MouseListController implements Controller{

		public mouseDAO mouseDAO;
		
		public MouseListController() {
			this.mouseDAO = new mouseDAO();
		}

		@Override
		public void process(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			// MouseDAO.java를 통해 DB에서 Mouse 데이터의 값을 조회해서 받아오기
			List<Mouse> mice = mouseDAO.findAll();
			
			request.setAttribute("mouseList", mice);
			
			// JSP페이지로 포워드
			String url = "/WEB-INF/mouseList.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
			
			response.setStatus(200);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
		}
		
		
	
	
}
