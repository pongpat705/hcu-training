package th.co.hcu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo extends BaseDomain{


	/**
	 * 
	 */
	private static final long serialVersionUID = 3910944767206213642L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long todoId;
	private String title;


	public long getTodoId() {
		return todoId;
	}

	public void setTodoId(long todoId) {
		this.todoId = todoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
