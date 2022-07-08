package tc_pb4OOP;

public class ProgMainOOP {
	public static void main(String[] args) {
		int n = 5; // nr masini
		int m = 7; // nr zile
		Fleet fleet = new Fleet(n, m);
		
		fleet.showInfo();
	}
}
