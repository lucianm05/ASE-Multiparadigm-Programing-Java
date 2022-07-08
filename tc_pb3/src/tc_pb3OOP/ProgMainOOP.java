package tc_pb3OOP;

import tc_pb3Utils.Utils;

public class ProgMainOOP {
	public static void main(String[] args) {
		int g = Utils.g;
		int m = Utils.m;
		int n = Utils.n;
		
		An an = new An(g, m, n);
		
		an.showInfo();
		
		System.out.println("Nota medie an: " + an.getMedie());
	}
}
