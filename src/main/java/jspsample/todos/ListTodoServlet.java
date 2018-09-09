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



@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet {

	TodoService service1= new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", service1.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", service1.retrieveTodos());
		String todo=request.getParameter("todo");
//		service1.addTodo(todo);
		service1.addTodo(new Todo(todo));
		response.sendRedirect("/todo.do");
//		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);

	}


}