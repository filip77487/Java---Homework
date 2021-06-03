package dayThree;

public class Fildzan {
	String colorofFildzan;
	int size;
	String n;
	
	Fildzan(String colorofFildzan, int size, String name) {
		this.colorofFildzan = name + "has color of Fildzan: " + colorofFildzan; 
		this.colorofFildzan = "black";
		this.size = size;
		this.n = name;
		
	}
	public String drink() {
		return this.n + " is drinking coffee from Fildzan";
		
	}
}
