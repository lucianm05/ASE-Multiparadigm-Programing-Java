package tc_pb4OOP;

public class Car {
	private float[] kms;
	
	public Car(int noDays) {
		this.kms = new float[noDays];
	}
	
	public void showInfo() {
		for(int i = 0; i < this.kms.length; i++) {
			System.out.print("ziua " + (i + 1) + ": " + this.kms[i] + " km, ");
		}
		System.out.println("");
		System.out.println("Min km: " + this.getMinKms());
		System.out.println("Max km: " + this.getMaxKms());
		System.out.println("Media/zi km: " + this.getAvgKms());
		System.out.println("Total km: " + this.getTotalKms());
	}
	
	public void setKms(int index, float value) {
		this.kms[index] = value;
	}
	
	public float getMaxKms() {
		float max = this.kms[0];
		
		for(int i = 0; i < this.kms.length; i++) {
			if(this.kms[i] > max) {
				max = this.kms[i];
			}
		}
		
		return max;
	}
	
	public float getMinKms() {
		float min = this.kms[0];
		
		for(int i = 0 ; i< this.kms.length; i++) {
			if(this.kms[i] < min) {
				min = this.kms[i];
			}
		}
		
		return min;
	}
	
	public float getTotalKms() {
		float total = 0;
		
		for(int i = 0; i < this.kms.length; i++) {
			total += this.kms[i];
		}
		
		return total;
	}
	
	public float getAvgKms() {
		float total = this.getTotalKms();
		
		return total / this.kms.length;
	}
}
