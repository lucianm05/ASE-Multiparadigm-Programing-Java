package tc_pb1OOP;

import tc_pb1Utils.Utils;

public class ProgMainOOP {
	public static void main(String[] args) {
		float[] consumedLitres = Utils.generateConsumedLitres();
		float[] consumedMoneyPerLitre = Utils.generateMoneyPerLitre();
		
		int noCons = consumedLitres.length;
		
		Consumption[] cons = new Consumption[noCons];
		
		for(int i = 0; i < noCons; i++) {
			Consumption c = new Consumption(consumedLitres[i], consumedMoneyPerLitre[i]);
			
			cons[i] = c;
		}
		
		Evidence evidence = new Evidence(cons);
		
		System.out.println("Consumul total de litri: " + evidence.getTotalLitres());
		System.out.println("Consumul mediu de litri: " + evidence.getMedLitres());
		System.out.println("Consumul total de bani: " + evidence.getTotalMoney());
		System.out.println("Consumul mediu de bani: " + evidence.getMedMoney());
	}
}
