package tc_pb4NonOOP;

public class ProgMainNonOOP {
	public static void main(String[] Args) {
		int n = 5; // nr masini
		int m = 7; // nr zile
		float kms[][] = new float[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				float rand = (float)Math.random();
				float km = rand * 50;
				kms[i][j] = km;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Masina " + (i + 1) + ":");
			float total = 0;
			float max = kms[i][0];
			float min = kms[i][0];
			
			for(int j = 0; j < m; j++) {
				System.out.print("ziua " + (j + 1) + ": " + kms[i][j] + ", ");
				
				total += kms[i][j];
				
				if(kms[i][j] < min) {
					min = kms[i][j];
				}
				
				if(kms[i][j] > max) {
					max = kms[i][j];
				}
			}
			
			float media = total / m;
			
			System.out.println("\nKm min: " + min);
			System.out.println("Km max: " + max);
			System.out.println("Media/zi km: " + media);
			System.out.println("Total km: " + total);
			
			System.out.println("\n");
		}
	}
}
