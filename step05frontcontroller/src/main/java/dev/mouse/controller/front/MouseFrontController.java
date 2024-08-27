package dev.mouse.controller.front;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.mouse.controller.Controller;
import dev.mouse.controller.MouseInsertController;
import dev.mouse.controller.MouseListController;

@WebServlet("/mouse-api/*")
public class MouseFrontController extends HttpServlet{

	
	
	// String - 세부 URI	주소, Controller - 개별 역할을 수행할 컨트롤러들
	private Map<String, Controller> controllerMap = new HashMap();
	
	
	
	
	public MouseFrontController() {
		controllerMap.put("/mice", new MouseListController());
		controllerMap.put("/mice/add", new MouseInsertController());
	}




	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 대부분의 컨트롤러에서 수행되는 공통 처리 수행
		request.setCharacterEncoding("UTF-8");
		
		// 사용자의 요청 URI값을 확인
		String path = request.getPathInfo();
		System.out.println(path);
		
		// URI별 특정 요청을 수행할 개별 컨트롤러 불러오기
		Controller controller = controllerMap.get(path);
		
		// 실제 개별 컨트롤러에게 요청을 처리하도록 호출
		controller.process(request, response);
	}

	
}
