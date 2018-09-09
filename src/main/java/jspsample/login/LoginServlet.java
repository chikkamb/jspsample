package jspsample.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspsample.todos.TodoService;

//flow of the program 
//doGet->login.jsp->form action->doPost->welcome.jsp->prints on browser



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	UserValidationService service= new UserValidationService();
	TodoService service1= new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	takes the name from the input box and prints it on the welcome.jsp page

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean Valid= service.isUserValid(name, password);
		
		if(Valid)
		{
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todo.do");
		}
		else{
			request.setAttribute("errorMessage", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}