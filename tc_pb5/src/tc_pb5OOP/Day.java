package tc_pb5OOP;

public class Day {
	private int id;
	private int[] times;
	
	public Day(int id) {
		this.id = id;
		this.times = new int[] {};
	}
	
	public void showInfo() {
		System.out.println("Ziua " + (this.id + 1));
		
		for(int i = 0; i < this.times.length; i++) {
			System.out.println("Masina " + (i + 1) + " a stat " + this.times[i] + " minute");
		}
		System.out.println("Min: " + this.getMin());
		System.out.println("Max: " + this.getMax());
		System.out.println("");
	}
	
	public void setTimes(int[] t) {
		this.times = t;
	}
	
	public void setTime(int index, int minutes) {
		this.times[index] = minutes;
	}
	
	public int[] getTimes() {
		return this.times;
	}
	
	public int getTime(int index) {
		return this.times[index];
	}
	
	public int getMin() {
		int min = this.times[0];
		
		for(int i = 0; i < this.times.length; i++) {
			if(this.times[i] < min) {
				min = this.times[i];
			}
		}
		
		return min;
	}
	
	public int getMax() {
		int max = this.times[0];
		
		for(int i = 0; i < this.times.length; i++) {
			if(this.times[i] > max) {
				max = this.times[i];
			}
		}
		
		return max;
	}
}
