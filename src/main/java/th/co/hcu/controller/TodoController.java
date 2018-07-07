package th.co.hcu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import th.co.hcu.beans.ApiResponse;
import th.co.hcu.entity.Todo;
import th.co.hcu.repos.TodoRepository;

@RestController
@RequestMapping("/api")
public class TodoController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TodoRepository todoRepos;
	
	@RequestMapping(value="/todo-list", method=RequestMethod.GET)
	public ResponseEntity<ApiResponse<List<Todo>>> findAllTodo(HttpServletRequest req, HttpServletResponse resp){
		log.info("findAllTodo by ip {}",req.getRemoteAddr());
		
		List<Todo> result = todoRepos.findAll();
		ApiResponse<List<Todo>> response = new ApiResponse<>();
		response.setCode("00");
		response.setData(result);
		
		if(result.isEmpty()) {
			response.setCode("99");
			response.setMessage("data not found!");
		}
		
		return new ResponseEntity<ApiResponse<List<Todo>>>(response, HttpStatus.OK);
	}
}
