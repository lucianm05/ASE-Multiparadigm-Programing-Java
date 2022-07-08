package tc_pb3OOP;

public class Grupa {
	private Student[] studenti;
	
	public Grupa(int nrStud) {
		this.studenti = new Student[nrStud];
	}
	
	public Grupa(Student[] s) {
		this.studenti = s;
	}
	
	public Student getStudent(int i) {
		return this.studenti[i];
	}
	
	public void setStudent(Student s, int index) {
		this.studenti[index] = s;
	}
	
	public float getMedie() {
		float total = 0;
		
		for(int i = 0; i < this.studenti.length; i++) {
			total += this.studenti[i].getMedie();
		}
		
		return total / this.studenti.length;
	}

}
