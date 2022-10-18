package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
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
			mesajVer("Sayi bulundu :" + aranacak);
		} else {
			mesajVer("Sayi bulunanamadı :" + aranacak);
		}
	}
	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}

}
