package basic.dev;

public class MainApp1 {

	public static void main(String[] args) {
		int tong = 0;

		for (int i = 1; i <= 100; i++) {
			tong += i;
		}
		System.out.println("Tong: " + tong);
	}

}