package tacos;

import javax.validation.constraints.NotBlank;


import lombok.Data;

@Data
public class Order {
	
	@NotBlank(message="Name is required")
	private String name;
	private String street;
	private String city;
	private String state;
}
