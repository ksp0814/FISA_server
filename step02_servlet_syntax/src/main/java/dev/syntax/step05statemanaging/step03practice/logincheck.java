package dev.syntax.step05statemanaging.step03practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.syntax.step05statemanaging.step03practice.data.loginDAO;

@WebServlet("/logincheck")
public class logincheck extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 요청 파라미터로부터 user_id와 password를 가져옵니다.
        String user_id = req.getParameter("user_id");
        String password = req.getParameter("password");

        // loginDAO 인스턴스를 생성합니다.
        loginDAO dao = new loginDAO();

        // 데이터베이스에 해당 user_id가 존재하는지 확인합니다.
        if (dao.isUserIdExists(user_id)) {
            // user_id가 존재할 경우, 추가적으로 비밀번호 확인 등의 작업을 수행할 수 있습니다.
            // 여기서는 간단히 존재 여부만 확인합니다.
            resp.getWriter().write("로그인 성공: 아이디가 존재합니다.");
        } else {
            // user_id가 존재하지 않는 경우
            resp.getWriter().write("로그인 실패: 아이디가 존재하지 않습니다.");
        }
    }
}
