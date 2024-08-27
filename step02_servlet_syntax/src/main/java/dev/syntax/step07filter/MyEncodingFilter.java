package dev.syntax.step07filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 직접 만든 인터페이스를 구현하여 직접 만든 커스텀 필터
// 서블릿 요청을 수행하기 전에 먼저 인코딩 처리 수행
@WebFilter(filterName = "utf-8filter", urlPatterns = "/")
public class MyEncodingFilter implements Filter{ 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() 호출 전");
		
		request.setCharacterEncoding("UTF-8");
		
		// A. 다음 필터가 존재할 경우 필터 체인에게 다음 필터를 수행하도록 전달
		// B. 현재 필터가 마지막 필터일 경우, 서블릿이 자신의 처리를 수행하도록 전달
		chain.doFilter(request, response);
		
		System.out.println("doFilter() 호출 후");
		
	}
}
