package org.dieschnittstelle.mobile.android.todolist.model;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/todolist")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public interface ITodolistRESTAccessor {

	/**
	 * access all todos
	 * 
	 * @return
	 */
	@GET
	public List<Todo> readAllTodos();

	/**
	 * access a todo passing its name (note that the actual term project
	 * implementation should rather work with numeric ids for identifying todos)
	 * 
	 * @param name
	 * @return
	 */
	@GET
	@Path("/{todoName}")
	public Todo readTodo(@PathParam("todoName") String name);

}
