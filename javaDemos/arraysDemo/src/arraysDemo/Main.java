package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "FURKAN";
		ogrenciler[1] = "ALİ";
		ogrenciler[2] = "VELİ";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
