package homeworkEleven;

import java.util.Iterator;

public class TestCar {

	public static void main(String[] args) {
		
		RuleTurs[] rt = new RuleTurs[6];
		RuleTurs rt1 = new RuleTurs() {
		};
		ICar c1 = rt1;
		
		rt[0] = rt[1] = rt[2] = rt[3] = rt[4] = rt[5] = rt1;
		
		for (RuleTurs ruleTurs : rt) {
			System.out.println("how much is costing this ticket: " + ruleTurs.costOfDriving());
			System.out.println("how many seats there are: " + ruleTurs.getNumberOfEmptyseats(0));
			System.out.println("what is the max speed: " + ruleTurs.drive());
			ruleTurs.color();
		}
		
		ICar[] cars = new ICar[4];
		System.out.println("what color they are: "+ c1.color());
		
			
		}
		
			
		}
		

		

	


