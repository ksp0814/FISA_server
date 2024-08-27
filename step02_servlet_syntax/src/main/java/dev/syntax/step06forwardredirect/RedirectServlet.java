package dev.syntax.step06forwardredirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other-site")
public class RedirectServlet extends HttpServlet {

	// localhost:8080/other-site?url=naver
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getParameter("url");
		
		// 외부 사이트일 필요는 없고 개별 서블릿들이 가진 자체 url(@WebServlet) 도 가능 
		if (url.equals("naver")) {
			resp.sendRedirect("http://www.naver.com"); // 브라우저에게 직접 다시 요청하도록 지정
		} else {
			resp.sendRedirect("http://www.google.com");
		}
	}
	
}
