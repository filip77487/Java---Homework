package dayThree;

import dayThree.Eartling;

public class Eartling {
	private String color = "white";
	private int age;
	public Eartling(String c, int a) {
		color = c;
		age = a;
	}
		
	public Eartling() {
	}
	
	 public String getColor() {
		 return color;
	}

	 public void setColor(String color) {
		 if (color != null) {
		 color = color.trim().toLowerCase();
		 if (!color.equalsIgnoreCase("white")
				 && !color.equalsIgnoreCase("black") 
				 && !color.equalsIgnoreCase("yellow")
				 && !color.equalsIgnoreCase("green")
				 && !color.equalsIgnoreCase("red")
				 && !color.equalsIgnoreCase("brown")) {
			 System.out.println("unsuported color:" + color);
		 } else {
			 System.out.println("set color to: " + color);
			 this.color = color;
		 }
		 } else {
			 System.out.println("color can't be null");
		 }
	}
	 
	public int getAge() {
		return age;
	}
	
	void setAge(int age) {
		if (age < 150 && age >= 0) {
			System.out.println("all good, set age to: ");
		this.age = age;
	}	else {
		System.out.println("age should be between 0 and 150. age: " + age);
	}
	}

	int eat(int initCalories) {
		 Eartling e3 = Eartling();
		int maxCalories = 1000;
		int remainingCalories = 0;
		System.out.println("initial calories: " + initCalories);
		
		if (initCalories <= maxCalories) {
			System.out.println("i have itten calories: " + initCalories);
		} else {
			System.out.println("i have itten calories: " + maxCalories);
			remainingCalories = initCalories - maxCalories;
		}
		return remainingCalories;
		
	}
	 
	 private Eartling Eartling() {
		// TODO Auto-generated method stub
		return null;
	}

	int eat(String vegableType) {
		 return 22;
		  }
	 double eat() {
		 return 22;
		 
	 }

}
