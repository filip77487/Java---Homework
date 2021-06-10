package homeworkEleven;

public abstract  class RuleTurs
 implements ICar, ITaxiCar, IBus {

	@Override
	public int drive() {
		// TODO Auto-generated method stub
		return 135;
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public int getTotalNumber(int numberOfPeople) {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getNumberOfEmptyseats(int i) {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int costOfDriving() {
		// TODO Auto-generated method stub
		return 100;
	}


	
}
