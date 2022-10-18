package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("Güzel geçtiniz");
			break;
		case 'C':
			System.out.println("Orta geçtiniz");
			break;
		case 'D':
			System.out.println("Düşük geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
			default:
				System.out.println("Geçersiz Not");

		}

	}

}
