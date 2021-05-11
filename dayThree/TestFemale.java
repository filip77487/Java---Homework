package dayThree;

public class TestFemale {

	public static void main(String[] args) {

//		Male m1 = new Male();
//		System.out.println(m1);
//		m1 = new Male();
		
		
//		Female f1 = new Male();
		
//		String s1 = "anotonio";
//		String s2 = new String("anotonio");

		String coe = new String("brown");
		int hight = 169;
		
		Female f3 = new Female(coe, hight, "Magdalena");
		String strl = f3.drive();
		System.out.println(strl);
		Female f4 = f3.createNewFemaleObject("green");
		
		
		
		
		
		
}
}
