package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varmi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varmi =true;
				break;
			} 
		}
		if (varmi) {
			System.out.println("Sayı bulundu");
		} else {
			System.out.println("Sayı bulunamadı");
		}
		
	}

}
