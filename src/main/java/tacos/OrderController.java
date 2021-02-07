package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

import tacos.Order;

@Slf4j
@Controller
@RequestMapping("/orders") // will handle requests from /order
public class OrderController {
	
	@GetMapping("/current")// will handle requests from /order/current
	public String orderForm(Model model) {
		model.addAttribute("order", new Order()); // gets exposed to the view 
		return "orderForm"; //this is the template called orderForm
	}
	
	@PostMapping
	public String processOrder(Order order) {
		log.info("Order submitted: " + order);
		System.out.println("order -->" + order);
		return "redirect:/";
	}
	

}
