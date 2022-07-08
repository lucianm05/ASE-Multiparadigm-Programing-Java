package tc_pb5OOP;

public class ParkingLot {
	private int id;
	private Day[] days;
	
	public ParkingLot(int id, int noDays) {
		this.id = id;
		this.days = new Day[noDays];
	}
	
	public void showInfo() {
		System.out.println("Loc parcare " + (this.id + 1));
		
		for(int i = 0; i < this.days.length; i++) {
			this.days[i].showInfo();
		}
		
		System.out.println("Min pe 5 zile loc parcare " + (this.id + 1) + ": " + this.getMin());
		System.out.println("Min pe 5 zile loc parcare " + (this.id + 1) + ": " + this.getMax());
		System.out.println("");
	}
	
	public void setDay(int index, Day day) {
		this.days[index] = day;
	}
	
	public Day getDay(int index) {
		return this.days[index];
	}
	
	public int getMin() {
		int min = this.days[0].getMin();
		
		for(int i = 0; i < this.days.length; i++) {
			int minZi = this.days[i].getMin();
			
			if(minZi < min) {
				min = minZi;
			}
		}
		
		return min;
	}
	
	public int getMax() {
		int max = this.days[0].getMax();
		
		for(int i = 0; i < this.days.length; i++) {
			int maxZi = this.days[i].getMax();
			
			if(maxZi > max) {
				max = maxZi;
			}
		}
		
		return max;
	}
	
}
