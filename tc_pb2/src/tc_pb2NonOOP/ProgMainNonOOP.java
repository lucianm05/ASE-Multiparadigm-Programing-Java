package tc_pb2NonOOP;
import tc_pb2Utils.Utils;

public class ProgMainNonOOP {
	public static void main(String[] args) {
		int[][] minutesPerDay = Utils.generateMins();
	
		int leastMins = minutesPerDay[0][0];
		String leastMinsDays = "";
		int mostMins = minutesPerDay[0][0];
		String mostMinsDays = "";
		
		// To demonstrate that there can be more than one day with most/least mins
//		minutesPerDay[0][0] = 1;
//		minutesPerDay[0][1] = 1;
//		minutesPerDay[0][2] = 999;
//		minutesPerDay[0][3] = 999;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Saptamana " + (i + 1));
			for(int j = 0; j < 7; j++) {
				System.out.print("ziua " + (j + 1) + ": " + minutesPerDay[i][j] + " min, ");
				
				if(minutesPerDay[i][j] <= leastMins) {
					leastMins = minutesPerDay[i][j];
				}
				
				if(minutesPerDay[i][j] >= mostMins) {
					mostMins = minutesPerDay[i][j];
				}
			}
			System.out.println("");
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 7; j++) {
				if(minutesPerDay[i][j] == leastMins) {
					leastMinsDays = leastMinsDays + "saptamana " + (i + 1) + " - ziua " + (j + 1) + ", ";
				}
				
				if(minutesPerDay[i][j] == mostMins) {
					mostMinsDays = mostMinsDays + "saptamana " + (i + 1) + " - ziua " + (j + 1) + ", ";
				}
			}
		}
		
		System.out.println("\nCele mai putine minute: " + leastMins + "; in " + leastMinsDays);
	
		System.out.println("Cele mai multe minute: " + mostMins + "; in " + mostMinsDays);
	}
}
