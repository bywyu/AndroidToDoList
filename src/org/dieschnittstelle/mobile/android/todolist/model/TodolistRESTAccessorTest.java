package org.dieschnittstelle.mobile.android.todolist.model;

import java.util.List;

import org.jboss.resteasy.client.ProxyFactory;

/**
 * this class accesses the rest webapp *from outside* using a separate java
 * process, and thus exemplifies how resteasy may be used in android. 
 * 
 * @author kreutel
 * 
 */
public class TodolistRESTAccessorTest {

	public static void callWebapp() {

		try {

			// obtain a proxy implementation of the java interface that handles
			// the http traffic and data conversion
			ITodolistRESTAccessor restaccessor = ProxyFactory.create(
					ITodolistRESTAccessor.class,
					"http://10.0.2.2:8080/TodolistWebapp");
			System.out
					.println("created accessor for calling the rest interface: "
							+ restaccessor);

			// obtain all todos
			List<Todo> alltodos = restaccessor.readAllTodos();
			System.out.println("read all todos: " + alltodos);

			// we iterate over the todolist and try to access each element
			// separately via the rest interface using the readTodo method
			// note that this only makes sense for mere testing purposes!!!
			for (Todo todofromlist : alltodos) {
				Todo singletodo = restaccessor.readTodo(todofromlist.getName());
				System.out.println("read todo for name "
						+ todofromlist.getName() + ": " + singletodo);
			}

		} catch (Exception e) {
			System.out.println("got exception: " + e);
			e.printStackTrace();
		}

	}

}
