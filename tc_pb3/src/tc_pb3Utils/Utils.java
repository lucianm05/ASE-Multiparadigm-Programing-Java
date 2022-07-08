package tc_pb3Utils;

public class Utils {
	public static int g = 6; // nr grupe
	public static int m = 3; // nr studenti in grupa
	public static int n = 5; // nr note per student
	
	public static int[][][] generateStudents(int g, int m, int n) {
		int[][][] an = new int[g][m][n]; // grupa, student, nota
		
		for(int i = 0; i < g; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < n; k++) {
					float rand = (float)Math.random();
					int grade = (int)(rand * 10);
					
					an[i][j][k] = grade != 0 ? grade : 1;
				}
			}
		}
		
		return an;
	}
}
