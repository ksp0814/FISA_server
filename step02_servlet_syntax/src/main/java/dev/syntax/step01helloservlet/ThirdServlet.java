package dev.syntax.step01helloservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 2. Annotation(@) 기반 맵핑
 * XML을 통한 관리 방식의 번거로움
 * 추상화되고 직관적인 Annotation으로 간소화
 * 
 * @WebServlet 
 * ref. https://javaee.github.io/javaee-spec/javadocs/javax/servlet/annotation/WebServlet.html
 * 
 */
@WebServlet(name = "MyThirdServlet", urlPatterns = "/servlets/thirdservlet")
/*
 * web.xml의 아래 설정과 동일함 
 * <servlet-name> MyThirdServlet </servlet-name>
 * <url-pattern> /servlets/thirdservlet </url-pattern>
 */
public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello Second Servlet!");
	}
	
}
