package dayThree;

public class testHuman {

	public static void main(String[] args) {
		Eartling eartling1 = new Eartling("yellow", 25);
		System.out.println(eartling1.getColor());
		System.out.println(eartling1.getAge());
		eartling1.setAge(256);
		System.out.println(eartling1.getAge());
		

		eartling1.setAge(-1);
		eartling1.setAge(260);
		eartling1.setAge(110);
		
		eartling1.setColor("White");
		eartling1.setColor("Orange");
		eartling1.setColor("WhItE");
		eartling1.setColor("football");
		eartling1.setColor("White ");
		eartling1.setColor(" White");
		
		eartling1.setColor(null);
		
//		int result1;
//		int result2;
//		System.out.println(eartling1.age);
//		System.out.println(eartling1.color);
//		System.out.println(eartling1);
//		
//	
//		result1 = eartling1.eat(680);
//		System.out.println(result1);
//		result2 = eartling1.eat(1050);
//		System.out.println(result2);
//		
//		int result3 = eartling1.eat("345");
//		int result4 = eartling1.eat("");
//		double result5 = eartling1.eat();
		
	}
}
