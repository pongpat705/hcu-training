package th.co.hcu.component;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class StartUp {

	
	private Map<String, Object> params;
	
	@PostConstruct
	public void setUp() {
		
		params = new HashMap<>();
		
		String param1 = "This is Param created in Component";
		
		params.put("PARAM_1", param1);
	}

	public Map<String, Object> getParams() {
		return params;
	}

}
