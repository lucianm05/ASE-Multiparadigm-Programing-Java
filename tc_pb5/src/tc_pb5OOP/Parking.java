package tc_pb5OOP;

public class Parking {
	private ParkingLot[] lots;
	
	public Parking(int noLots, int noDays, int minuteMonitorizate, int maxMinute) {
		this.lots = new ParkingLot[noLots];
		
		this.generateLots(noLots, noDays, minuteMonitorizate, maxMinute);
	}
	
	private void generateLots(int noLots, int noDays, int minuteMonitorizate, int maxMinute) {
		for(int i = 0; i < noLots; i++) {
			ParkingLot lot = new ParkingLot(i, noDays);
			
			for(int j = 0; j < noDays; j++) {
				Day day = new Day(j);
				int total = 0;
				
				while(total < minuteMonitorizate) {
					float rand = (float)Math.random();
					int randMinute = (int)(rand * maxMinute);
					int minute = randMinute > 0 ? randMinute : 1;
					int[] newOrePerLoc = new int[day.getTimes().length + 1];
					
					for(int k = 0; k < day.getTimes().length; k++) {
						newOrePerLoc[k] = day.getTime(k);
					}
					
					int minuteRamase = minuteMonitorizate - (total + minute);
					
					if(minuteRamase > 0) {
						newOrePerLoc[newOrePerLoc.length - 1] = minute;
						day.setTimes(newOrePerLoc);
						total += minute;
					} else {
						int diff = minuteMonitorizate - total;
				
						newOrePerLoc[newOrePerLoc.length - 1] = diff;
						day.setTimes(newOrePerLoc);
						total += diff;
					}
				}
				
				lot.setDay(j, day);
			}
			
			this.setLot(i, lot);
		}
	}
	
	public void showInfo() {
		for(int i = 0; i < this.lots.length; i++) {
			this.lots[i].showInfo();
		}
	}
	
	public void setLot(int index, ParkingLot lot) {
		this.lots[index] = lot;
	}
	
	public ParkingLot getLot(int index) {
		return this.lots[index];
	}
}
