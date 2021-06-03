package dayThree;

public class TestMale {

	public static void main(String[] args) {

		String coh = new String("green");
		int weight = 70;
		
		Male m3 = new Male(coh, weight,"Marko");
		String strl = m3.sing();
		System.out.println(strl);
		Male m4 = m3.creatNewMaleObject("blue");
	
		
		
		
		
		
		
		}

	}


