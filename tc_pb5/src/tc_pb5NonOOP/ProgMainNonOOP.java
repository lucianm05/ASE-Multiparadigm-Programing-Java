package tc_pb5NonOOP;

public class ProgMainNonOOP {
	public static void main(String[] args) {
		int n = 3; // nr locuri masini
		int zm = 5; // zile monitorizate
		int[][][] locuriParcare = new int[n][zm][];
		int[] min5Zile = new int[n];
		int[] max5Zile = new int[n];
		int minuteMonitorizate = 1440;
		int maxMinute = 720;
		
		for(int i = 0; i < n; i++) {
			locuriParcare[i] = new int[zm][];
			
			for(int j = 0; j < zm; j++) {
				int total = 0;
				locuriParcare[i][j] = new int[] {};
				
				while(total < minuteMonitorizate) {
					float rand = (float)Math.random();
					int randMinute = (int)(rand * maxMinute);
					int minute = randMinute > 0 ? randMinute : 1;
					int[] newOrePerLoc = new int[locuriParcare[i][j].length + 1];
					
					for(int k = 0; k < locuriParcare[i][j].length; k++) {
						newOrePerLoc[k] = locuriParcare[i][j][k];
					}
					
					int minuteRamase = minuteMonitorizate - (total + minute);
					
					if(minuteRamase > 0) {
						newOrePerLoc[newOrePerLoc.length - 1] = minute;
						locuriParcare[i][j] = newOrePerLoc;
						total += minute;
					} else {
						int diff = minuteMonitorizate - total;
						
						newOrePerLoc[newOrePerLoc.length - 1] = diff;
						locuriParcare[i][j] = newOrePerLoc;
						total += diff;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Loc parcare " + (i + 1));
			min5Zile[i] = locuriParcare[i][0][0];
			max5Zile[i] = locuriParcare[i][0][0];
			
			for(int j = 0; j < zm; j++) {
				System.out.println("Ziua " + (j + 1));
				int total = 0;
				int max = locuriParcare[i][j][0];
				int min = locuriParcare[i][j][0];
				
				for(int k = 0; k < locuriParcare[i][j].length; k++) {
					total += locuriParcare[i][j][k];
					
					if(locuriParcare[i][j][k] < min) {
						min = locuriParcare[i][j][k];
					}
					
					if(locuriParcare[i][j][k] > max) {
						max = locuriParcare[i][j][k];
					}
					
					System.out.println("Masina " + (k + 1) + " a stat " + locuriParcare[i][j][k] + " minute");
				}
				
				if(min < min5Zile[i]) {
					min5Zile[i] = min;
				}
				
				if(max > max5Zile[i]) {
					max5Zile[i] = max;
				}
				
				System.out.println("Minim: " + min + " minute");
				System.out.println("Maxim: " + max + " minute");
				System.out.println("Total: " + total);
				System.out.println("");
			}
			
			System.out.println("");;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Min pe 5 zile loc parcare " + (i + 1) + ": " + min5Zile[i] + " minute");
			System.out.println("Max pe 5 zile loc parcare " + (i + 1) + ": " + max5Zile[i] + " minute\n");
		}
		
	}
}
