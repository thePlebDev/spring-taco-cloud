package tacos;

import lombok.Data;

@Data 
public class Taco {
	
	private String name; //used to capture the information from the form
	
	public void setName(String name) {
		//used to set the name of the taco 
		this.name = name;
	}
	

}
