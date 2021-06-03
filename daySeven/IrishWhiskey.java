package daySeven;

import daySix.testinstanceof.AlcoholicDrink;
import daySix.testinstanceof.Drink;
import daySix.testinstanceof.Wuiskey;

public class IrishWhiskey extends Wuiskey {

	public static void main(String[] args) {
		
		
		IrishWhiskey i1 = new IrishWhiskey();
		System.out.println(i1.isAlcoholic());
		
		
		Wuiskey w1 = i1;
		System.out.println(Wuiskey.brand);
		testObject(i1);
		
		
		Object o1 = i1;
		System.out.println(o1.hashCode());
		testObject(o1);
		
		
		 
	
	}	
			
		private static void testObject(Object o1) {
			
			System.out.println(o1 instanceof IrishWhiskey);
			System.out.println(o1 instanceof Wuiskey);
			System.out.println(o1 instanceof AlcoholicDrink);
			System.out.println(o1 instanceof Drink);
			System.out.println(o1 instanceof Object);
		
		
		}
		}
		
		
		
		




	
