package pizza;


import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Pizza {

	@Id
	private String id;

	@NotNull
	private int size;
	
	private List<String> toppings;

	public String getId() {
		return id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

}
