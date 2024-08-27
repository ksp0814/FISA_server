package dev.mouse.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.mouse.data.mouseDAO;
import dev.mouse.model.Mouse;

public class MouseInsertController implements Controller {

	private mouseDAO mouseDAO;

	public MouseInsertController() {
		this.mouseDAO = new mouseDAO();
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 브라우저에서 전달받은 입력값 추출
				String name = request.getParameter("name");
				String country= request.getParameter("country");
				String address = request.getParameter("address");
				// 2. 등록 처리 메서드 호출

				Mouse mouse = new Mouse(name,country,address);
				mouseDAO.add(mouse);
				
				// 포워드 방식
//				String path = "/mouse-api/mice";
//				RequestDispatcher dispatcher = request.getRequestDispatcher(path);
//				dispatcher.forward(request, response);
				String path = request.getContextPath() + "/mouse-api/mice";
				response.sendRedirect(path);
	}
}










