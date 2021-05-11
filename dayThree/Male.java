package dayThree;

public class Male {
	String colorofHair;
	int weight;
	String n;
	Integer i2 = 24;
	
	Male(String colorofHair, int weight, String name){
	this.colorofHair = name + "has color of hair: " + colorofHair;
	this.colorofHair = "black";
	this.weight = weight;
	this.n = name;
	
	}
	public String sing() {
	return n + " is singing";
}
	public void run() {
		System.out.println("a male with weight: " + weight + " is running");
	}
	
	public Male creatNewMaleObject(String color) {
		Male m1 = new Male(null, 0, null);
		m1.colorofHair = color;
		return m1;
				
	}
}
