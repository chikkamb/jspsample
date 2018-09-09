package jspsample.todos;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	static{
		todos.add(new Todo("Step1"));
		todos.add(new Todo("Step2"));
		todos.add(new Todo("Step3"));
	}

	public List<Todo> retrieveTodos()
	{
		return todos;
	}
	
	public void addTodo(Todo newtodo){
		todos.add(newtodo);
	}

	public void deleteTodo(Todo newtodo){
		todos.remove(newtodo);
	}
}
