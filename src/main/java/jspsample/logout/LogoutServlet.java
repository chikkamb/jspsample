package jspsample.logout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspsample.login.UserValidationService;
import jspsample.todos.TodoService;

//flow of the program 
//doGet->login.jsp->form action->doPost->welcome.jsp->prints on browser



@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

}