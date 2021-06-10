package homeworkEleven;

public abstract interface IBus extends ITaxiCar, ICar {
	
	@Override
	 default String color() {
				return "";
	}

	public abstract int getTotalNumber(int numberOfPeople);
}
