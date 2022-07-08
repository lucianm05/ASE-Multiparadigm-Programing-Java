package tc_pb5OOP;

public class ProgMainOOP {
	public static void main(String[] args) {
		int n = 3; // nr locuri masini
		int zm = 5; // zile monitorizate
		int minuteMonitorizate = 1440;
		int maxMinute = 720;
		
		Parking parking = new Parking(n, zm, minuteMonitorizate, maxMinute);
		
		parking.showInfo();
	}
}
