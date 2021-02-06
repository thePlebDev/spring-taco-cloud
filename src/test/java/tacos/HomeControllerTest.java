package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(Greeting.class) // this is the Web test for the first controller


public class HomeControllerTest {
	
	@Autowired
	private MockMvc mockMvc; // injects the Mock Mvc
	
	@Test
	public void testhomePage() throws Exception{
		mockMvc.perform(get("/"))  // this performs the get call 
		
		.andExpect(status().isOk()) // expects the HTTP 200
		.andExpect(view().name("home")) // expects the home view
		.andExpect(content().string(
				containsString("Welcome to...")));
	}
	
}
