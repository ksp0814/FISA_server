package dev.syntax.step06forwardredirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class ReqDispatcherServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h3>Dispatcher Servlet 수행 결과</h3>");
		// 파라미터로 다른 서블릿의 URI(/page2)를 지정
		RequestDispatcher dispatcher = req.getRequestDispatcher("/page2");
		// 현재 해당 서블릿이 수행한 별도의 처리 내용을 다른 서블릿에게 전달하기 위해 요청 객체에 처리 내용을 추가
		req.setAttribute("result", "서블릿1의 어떤 처리 결과");
		// 다른 서블릿으로 요청을 실제 포워딩, 포워딩할 때 파라미터에 요청 객체와 응답 객체를 담아서 전달		
		dispatcher.forward(req, resp);
		out.close();
	}
}
