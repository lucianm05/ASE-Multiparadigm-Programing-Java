package tc_pb2OOP;

import tc_pb2Utils.Utils;

public class ProgMainOOP {
	public static void main(String[] args) {
		Period period = new Period(Utils.generateMins());
		
		period.showInfo();
		
		System.out.println("Cele mai putine minute: " + period.getLeastMins());
		System.out.print("in zilele: ");
		for(int i = 0; i < period.getLeastMinsDays().length; i++) {
			System.out.print(period.getLeastMinsDays()[i] + " ");
		}
		System.out.println("");
		System.out.println("Cele mai multe minute: " + period.getMostMins());
		System.out.print("in zilele: ");
		for(int i = 0; i < period.getMostMinsDays().length; i++) {
			System.out.print(period.getMostMinsDays()[i] + " ");
		}
		System.out.println("");
	}
}
