package jspsample.todos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspsample.todos.TodoService;

//flow of the program 
//doGet->login.jsp->form action->doPost->welcome.jsp->prints on browser



@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

	TodoService service1= new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service1.deleteTodo(new Todo(request.getParameter("todo")));
		response.sendRedirect("/list-todo.do");
	}

}