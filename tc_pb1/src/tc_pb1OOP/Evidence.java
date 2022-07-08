package tc_pb1OOP;

public class Evidence {
	private Consumption[] consumptions;
	
	public Evidence(Consumption[] cons) {
		this.consumptions = cons;
	}
	
	public float getTotalLitres() {
		float total = 0;
		
		for(int i = 0; i < this.consumptions.length; i++) {
			total += this.consumptions[i].getLitres();
		}
		
		return total;
	}
	
	public float getTotalMoney() {
		float total = 0;
		
		for(int i = 0; i < this.consumptions.length; i++) {
			total += this.consumptions[i].getLitres() * this.consumptions[i].getMoneyPerLitre();
		}
		
		return total;
	}
	
	public float getMedLitres() {
		return this.getTotalLitres() / this.consumptions.length;
	}
	
	public float getMedMoney() {
		return this.getTotalMoney() / this.consumptions.length;
	}
}
