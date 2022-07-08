package tc_pb2OOP;

public class Week {
	private int id;
	private Day[] days = new Day[7];
	
	public Week(int i) {
		this.id = i;
	}
	
	public Week(int i, Day[] d) {
		super();
		this.days = d;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Day[] getDays() {
		return this.days;
	}
	
	public Day getDay(int id) {
		return this.days[id];
	}
	
	public void setDay(Day d, int index) {
		this.days[index] = d;
	}
}
