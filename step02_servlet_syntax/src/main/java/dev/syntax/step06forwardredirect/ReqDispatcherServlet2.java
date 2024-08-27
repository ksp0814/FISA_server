 package dev.syntax.step06forwardredirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class ReqDispatcherServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h3>Dispatcher Servlet2 수행 결과</h3>");
		// 첫 번째 서블릿에서 전달받은 값 확인
		System.out.println("첫 번째 서블릿에게 전달받은 값: " + req.getAttribute("result"));
		out.close();
	}
}
