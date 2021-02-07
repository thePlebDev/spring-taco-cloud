package tacos;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data 
public class Taco {
	// should hold all fields to be collected from the form
	
	@NotNull
	@Size(min=5,message="Name must be at least 5 characters long")
	private String name; //used to capture the information from the form
	private String about;
	
	public String name() {
		//used to set the name of the taco 
		return name;
	}
	public String about() {
		return about;
	}
	

}
