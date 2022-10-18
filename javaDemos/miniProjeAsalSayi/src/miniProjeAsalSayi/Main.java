package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		int sayac = 0;

		if (number == 1) {
			System.out.println("Asal Değil");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sayac++;
			}
		}
		if (sayac != 0) {
			System.out.println("Asal Değil");
		}
		else {
			System.out.println("Asal");
		}

	}

}
