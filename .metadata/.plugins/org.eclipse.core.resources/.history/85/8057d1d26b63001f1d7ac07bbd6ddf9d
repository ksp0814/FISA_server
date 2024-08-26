package dev.syntax.step05statemanaging.step01cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 브라우저에서 전달해준 쿠키값을 읽어들이는 서블릿
@WebServlet("/read-cookie")
public class ReadCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		Cookie[] list = req.getCookies(); // 쿠키 취득
		
		for (Cookie cookie : list) {
			out.printf("%s : %s", cookie.getName(), cookie.getValue() + "<br>");
		}

		out.close();
		
	}
	
}
