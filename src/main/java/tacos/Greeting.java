package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Greeting {
	
	@GetMapping("/")
	public String home() {
		return "home"; // this corresponds to a template called home.html
	}
}
