package tc_pb3OOP;

public class Student {
	private int[] note;
	
	public Student(int nrNote) {
		this.note = new int[nrNote];
	}
	
	public Student(int[] n) {
		this.note = n;
	}
	
	public void setNota(int nota, int index) {
		this.note[index] = nota;
	}
	
	public int getNota(int index) {
		return this.note[index];
	}
	
	public float getMedie() {
		float total = 0;
		
		for(int i = 0; i < this.note.length; i++) {
			total += this.note[i];
		}
		
		return total / this.note.length;
	}
}
