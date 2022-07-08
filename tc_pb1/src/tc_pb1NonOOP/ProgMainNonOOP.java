package tc_pb1NonOOP;

import tc_pb1Utils.Utils;

public class ProgMainNonOOP {
	public static void main(String[] args) {
		float[] consumedLitres = Utils.generateConsumedLitres();
		float[] consumedMoneyPerLitre = Utils.generateMoneyPerLitre();
		
		int noCons = consumedLitres.length;
		
		float totalConsLitr = 0;
		float totalConsMoney = 0;
		
		for(int i = 0; i < noCons; i++) {
			totalConsLitr += consumedLitres[i];
			totalConsMoney += (consumedMoneyPerLitre[i] * consumedLitres[i]);
		}
		
		float medConsLitr = totalConsLitr / noCons;
		float medConsMoney = totalConsMoney / noCons;
		
		System.out.println("Consumul total de litri: " + totalConsLitr);
		System.out.println("Consumul mediu de litri: " + medConsLitr);
		System.out.println("Consumul total de bani: " + totalConsMoney);
		System.out.println("Consumul mediu de bani: " + medConsMoney);
	}
}
