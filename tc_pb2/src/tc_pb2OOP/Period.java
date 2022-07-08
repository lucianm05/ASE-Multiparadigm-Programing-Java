package tc_pb2OOP;

import tc_pb2Utils.Utils;

public class Period {
	private Week[] weeks;
	private int leastMins;
	private int mostMins;
	
	public Period(Week[] w) {
		this.weeks = w;
	}
	
	public Period(int[][] w) {
		// To demonstrate that there can be more than one day with most/least mins
//		w[0][0] = 1;
//		w[0][1] = 1;
//		w[0][2] = 999;
//		w[0][3] = 999;
//		w[1][0] = 999;
		
		this.weeks = new Week[w.length];
		this.leastMins = w[0][0];
		this.mostMins = w[0][0];
		
		for(int i = 0; i < w.length; i++) {
			Week week = new Week(i);
			
			for(int j = 0; j < 7; j++) {
				Day day = new Day(j, w[i][j]);
				
				week.setDay(day, j);
				
				if(day.getMins() < this.leastMins) {
					this.leastMins = day.getMins();
				}
				
				if(day.getMins() > this.mostMins) {
					this.mostMins = day.getMins();
				}
			}
			
			this.weeks[i] = week;
		}
	}
	
	private Day getCurrDay(int i, int j) {
		return this.weeks[i].getDay(j);
	}
	
	private int[] getMinsDays(int equalTo) {
		int[] minsDays = new int[] {};
		
		for(int i = 0; i < this.weeks.length; i++) {
			for(int j = 0; j < 7; j++) {
				
				Day currDay = this.getCurrDay(i, j);
				
				if(currDay.getMins() == equalTo) {
					minsDays = Utils.getNewArray(minsDays, (i * 7 + j + 1));
				}
			}
		}
		
		return minsDays;
	}
	
	public Week[] getWeeks() {
		return this.weeks;
	}
	
	public Week getWeek(int id) {
		return this.weeks[id];
	}
	
	public void showInfo() {
		for(int i = 0; i < this.weeks.length; i++) {
			System.out.println("Saptamana " + (i + 1));
			
			for(int j = 0; j < 7; j++) {
				System.out.print("ziua " + (j + 1) + ": " + this.weeks[i].getDay(j).getMins() + " min, ");
			}
			
			System.out.println("");
		}
	}
	
	public int getLeastMins() {
		return this.leastMins;
	}
	
	public int getMostMins() {
		return this.mostMins;
	}
	
	public int[] getLeastMinsDays() {
		return this.getMinsDays(this.getLeastMins());
	}
	
	public int[] getMostMinsDays() {
		return this.getMinsDays(this.getMostMins());
	}
	
}
