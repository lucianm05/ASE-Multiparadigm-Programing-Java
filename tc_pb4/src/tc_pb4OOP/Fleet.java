package tc_pb4OOP;

public class Fleet {
	private Car[] cars;
	
	public Fleet(int noCars, int noDays) {
		this.cars = new Car[noCars];
		
		for(int i = 0; i < noCars; i++) {
			Car car = new Car(noDays);
			
			for(int j = 0; j < noDays; j++) {
				float rand = (float)Math.random();
				float km = rand * 50;
				car.setKms(j, km);
			}
			
			this.setCar(i, car);
		}
	}
	
	public void showInfo() {
		for(int i = 0; i < this.cars.length; i++) {
			System.out.println("Masina " + (i + 1) + ":");
			this.cars[i].showInfo();
			System.out.println("");
		}
	}
	
	public void setCar(int index, Car car) {
		this.cars[index] = car;
	}
}
