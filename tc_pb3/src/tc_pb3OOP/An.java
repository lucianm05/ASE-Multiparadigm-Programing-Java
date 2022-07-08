package tc_pb3OOP;

public class An {
	private Grupa[] grupe;
	private int nrGrupe;
	private int nrStud;
	private int nrNote;
	
	public An(Grupa[] g) {
		this.grupe = g;
	}
	
	public An(int g, int m, int n) {
		this.nrGrupe = g;
		this.nrStud = m;
		this.nrNote = n;
		
		this.grupe = new Grupa[g];
		
		for(int i = 0; i < g; i++) {
			Grupa grupa = new Grupa(m);
			
			for(int j = 0; j < m; j++) {
				Student stud = new Student(n);
				
				for(int k = 0; k < n; k++) {
					float rand = (float)Math.random();
					int nota = (int)(rand * 10);
					stud.setNota(nota != 0 ? nota : 1, k);
				}
				
				grupa.setStudent(stud, j);
			}
			
			this.grupe[i] = grupa;
		}
	}
	
	public void showInfo() {
		for(int i = 0; i < this.nrGrupe; i++) {
			System.out.println("Grupa " + (i + 1));
			
			for(int j = 0; j < this.nrStud; j++) {
				System.out.print("Notele studentului " + (j + 1) + ": ");
				
				Student currStud = this.grupe[i].getStudent(j);
				
				for(int k = 0; k < this.nrNote; k++) {
					System.out.print(currStud.getNota(k) + " ");
				}
				
				System.out.print(", nota medie: " + currStud.getMedie());
				
				System.out.println("");
			}
			
			System.out.println("Nota medie grupa: " + this.grupe[i].getMedie() + "\n");
		}
	}
	
	public float getMedie() {
		float total = 0;
		
		for(int i = 0; i < this.grupe.length; i++) {
			total += this.grupe[i].getMedie();
		}
		
		return total / this.grupe.length;
	}
}
