package in.harshita.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String s = "Welcome to my page";
	    int i = 10/0;
		return s;
	}

}
