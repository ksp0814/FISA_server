package dev.syntax.step01helloservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 1. 서블릿이란?
 * 서버에서 실행되는 자바 프로그램
 * 
 * 2. 작성 방법
 * 2-1. HttpServlet을 확장(extends)
 * 	-> HTTP 요청에 따른 처리 로직이 구현되어 있기 때문에
 * 
 * 2-2. 요청에 따른 처리 로직 작성
 * -> HttpServlet 클래스에 구현된 메서드를 오버라이딩
 * GET요청이면 -> doGet() 오버라이딩
 * POST -> doPost()..
 * 
 * 큰 틀에서 GET 요청인지, POST 요청인지 구분 후 각각의 로직 작성
 */
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("SecondServlet!!");
	}
	 
}
