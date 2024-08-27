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
@WebServlet("/mice/add")
public class MouseInsertServlet extends HttpServlet {

	private mouseDAO mouseDAO;

	public MouseInsertServlet() {
		this.mouseDAO = new mouseDAO();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 브라우저에서 전달받은 입력값 추출
		String name = request.getParameter("name");
		String country= request.getParameter("country");
		String address = request.getParameter("address");
		// 2. 등록 처리 메서드 호출

		Mouse mouse = new Mouse(name,country,address);
		mouseDAO.add(mouse);
		
		// 3. 메인 페이지로 리다이렉트
		//response.sendRedirect("/step03servletpractice/hello");
		//response.sendRedirect("/step03servletpractice/hello");
		// contextpath - 프로젝트명(step03servletpractice());
		// -> localhost:8080/step03servletpractice가 되는 것
		//localhost:8080/step03servletpractice(/) -> 디폴트로 index.html 실행
		
		// 포워드 방식
		String path = "/mice";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}










