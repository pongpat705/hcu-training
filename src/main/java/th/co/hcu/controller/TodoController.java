package th.co.hcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.hcu.entity.Todo;
import th.co.hcu.repos.TodoRepository;

@Controller
public class TodoController {
	
	@Autowired
	private TodoRepository todoRepos;

	@RequestMapping("/index")
	public String index(Model model) {
		
		List<Todo> result = todoRepos.findAll();
		
		model.addAttribute("TODO_LIST", result);
		
		model.addAttribute("hello", "hello This is TODO List");
		
		return "index";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST )
	public String add(Model model, @ModelAttribute Todo todo) {
		
		todoRepos.save(todo);
		
		return "redirect:/index";
	}
}
