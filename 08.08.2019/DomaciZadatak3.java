package domaci08082019;

import java.util.Scanner;

public class DomaciZadatak3 {

	static int brojKaraktera(String rec) {
		rec = rec.toLowerCase();
		int br = 0;
		for (int i = 0; i < rec.length(); i++) {
			if (rec.charAt(i) == 'c') {
				br = br + 1;
			}
		}
		return br;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec:");
		String rec = sc.next();
		int broj = brojKaraktera(rec);
		System.out.println("Karakter 'c' je ponovljen: " + broj + " puta!");

	}

}
