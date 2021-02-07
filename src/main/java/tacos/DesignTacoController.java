package tacos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

import tacos.Ingredient;
import tacos.Greeting;
import tacos.Ingredient.Type;


@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	@GetMapping //specifies this will handle a get request to the design end-point 
	public String showDesign(Model model) {
		model.addAttribute("design",new Taco()); // exposes taco to view with design key
				return "design"; 
	}
	
	@PostMapping //this means that any post requests made to /design are handled here
	public String processDesign(Taco design) {
		//the fields of the form should be bound to the taco object
		//save the taco name. This will be done in chapter 3
		log.info("processing design: " + design);
		System.out.println("design --> " + design.about());
		
		return "redirect:/orders/current"; // should redirect to this path 
	}

}
