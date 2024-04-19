package in.harshita.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.harshita.exception.UserException;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{uid}")
	public String getUserId(@PathVariable("uid") Integer uid) {
		if(uid>100) {
			return "Good to go";
		}
		else 
			throw new UserException("Invalid Id");
	}
	
	

}
