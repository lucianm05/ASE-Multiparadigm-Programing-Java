package tc_pb3NonOOP;

import tc_pb3Utils.Utils;

public class ProgMainNonOOP {
	public static void main(String[] args) {
		int g = Utils.g; // nr grupe
		int m = Utils.m; // nr studenti in grupa
		int n = Utils.n; // nr note pentru fiecare student
		float notaTotalaAn = 0;
		float[] noteMediiGrupa = new float[g];
		int[][][] an = Utils.generateStudents(g, m, n); // grupa, student, note
		
		for(int i = 0; i < g; i++) {
			System.out.println("Grupa " + (i + 1));
			
			float notaTotalaGrupa = 0;
			float notaMedieGrupa = 0;
			
			for(int j = 0; j < m; j++) {
				System.out.print("Notele studentului " + (i + 1) + ": ");
				
				float notaTotalaStudent = 0;
				float notaMedieStudent = 0;
				
				for(int k = 0; k < n; k++) {
					System.out.print(an[i][j][k] + " ");
					notaTotalaStudent += an[i][j][k];
					notaTotalaGrupa += an[i][j][k];
					notaTotalaAn += an[i][j][k];
				}
				
				notaMedieStudent = notaTotalaStudent / n;
				System.out.print(", nota medie: " + notaMedieStudent);
				
				notaMedieGrupa = notaTotalaGrupa / (m * n);
				noteMediiGrupa[i] = notaMedieGrupa;
				
				System.out.println("");
			}
			
			System.out.println("");
		}
		
		for(int i = 0; i < g; i++) {
			System.out.println("Nota medie Grupa " + (i + 1) + ": " + noteMediiGrupa[i]);
		}
		
		float notaMedieAn = notaTotalaAn / (g * m * n);
		System.out.println("\nNota medie an: " + notaMedieAn);
	}
}
