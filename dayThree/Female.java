package dayThree;

public class Female {
	String colorofEyes;
	String n;
	int height;
	
	
	Female(String colorofEyes, int height, String name) {
		this.colorofEyes = name + "has color of eyes: + "
				+ colorofEyes;
		this.height = height;
		colorofEyes = "blue";
		this.n = name;
		
	}
	
	public String drive() {
		return this.n +  " is driving";
	}
	
	public void sing() {
		System.out.println("a fimale with highr:" + height + " is singing");
		}
	public Female createNewFemaleObject(String color) {
		Female f1 = new Female(null, 0 , null);
		f1.colorofEyes = color;
		return f1;
	}
	
	}





