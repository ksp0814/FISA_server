package dev.syntax.step03httprequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// GET:localhost:8080/first-request-servlet으로 요청이 왔을 때 동작시킬 서블릿
@WebServlet("/first-request-servlet")
public class FirstHttpRequestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request);
		System.out.println(response);
		
		// 응답 객체를 통해 응답 헤더의 값을 세팅
		response.setContentType("text/html"); // 응답할 컨텐츠의 타입은 text/html 형식이라고 응답 헤더에 추가
		// Content-Type: "text/html"
		response.setCharacterEncoding("UTF-8"); // 인코딩 타입은 UTF-8
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<head>");
		out.println("<title>Request Information Example</title>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<h3>요청 메시지에 담긴 정보 확인</h3>");
		
		// Header 메시지에 담긴 정보 추출
		out.println("Context Path : " + request.getContextPath() + "<br/>");
		out.println("Request URL : " + request.getRequestURL() + "<br/>");
		out.println("Request URI : " + request.getRequestURI() + "<br/>");
		out.println("Server Port : " + request.getServerPort() + "<br/>");
		out.println("Request Protocol : " + request.getProtocol() + "<br/>");
		out.println("Request METHOD: " + request.getMethod() + "<br/>");
		out.println("Query String : " + request.getQueryString() + "<br/>");// http://localhost:8080/step10newsyntax/first-request-servlet?name=jerry&age=15
		out.println("Parameter(name) : " + request.getParameter("name") + "<br/>");
		out.println("Parameter(age) : " + request.getParameter("age") + "<br/>");
		
		out.println("</body>");
        out.println("</html>");
        
        // 
		out.close();
		
	}
	
}









