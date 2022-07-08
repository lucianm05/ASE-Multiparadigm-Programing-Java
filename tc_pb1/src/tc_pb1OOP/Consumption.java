package tc_pb1OOP;

public class Consumption {
	private float litres;
	private float moneyPerLitre;
	
	public Consumption() {
		this.litres = 0;
		this.moneyPerLitre = 0;
	}
	
	public Consumption(float litr, float mpl) {
		this.litres = litr;
		this.moneyPerLitre = mpl;
	}
	
	float getLitres() {
		return this.litres;
	}
	
	float getMoneyPerLitre() {
		return this.moneyPerLitre;
	}
}
