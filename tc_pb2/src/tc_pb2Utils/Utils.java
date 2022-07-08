package tc_pb2Utils;

public class Utils {
	public static int[][] generateMins() {
		int[][] minutesPerDay = new int[3][7];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 7 ; j++) {
				float rand = (float)Math.random();
				int minutes = (int)(rand * 1000);
				minutesPerDay[i][j] = minutes;
			}
		}
		
		return minutesPerDay;
	}
	
	public static int[] getNewArray(int[] srcArr, int newEl) {
		int[] newMostMinsDays = new int[srcArr.length + 1];
		
		for(int k = 0; k < srcArr.length; k++) {
			newMostMinsDays[k] = srcArr[k];
		}
		
		newMostMinsDays[newMostMinsDays.length - 1] = newEl;
		
		return newMostMinsDays;
	}
}
