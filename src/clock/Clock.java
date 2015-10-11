package clock;

//Chayala Glazer

public class Clock {
	public static void main(String[] args) {
		for (int x = 1; x <= 12; x++) {
			for (int y = 1; y <= 59; y++) {
				for (int z = 1; z <= 59; z++) {
					System.out.printf("%2d:%02d:%02d\n", x, y, z);
				}
			}
		}
	}
}
