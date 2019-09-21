package domaci08082019;

import java.util.Scanner;

public class DomaciZadatak2 {
	
	static int sumaReda(int[][] a, int n) {
		int suma = 0;
		for (int i = n; i <= n; i++) {
			for (int j = 0; j < a.length; j++) {
				suma += a[i][j];
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();
		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();
		int niz[][] = new int[r][k];

		System.out.println("Unesi clanove ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				int unos = sc.nextInt();
				niz[i][j] = unos;
			}
		}
		System.out.println("Unesite broj reda izmedju 0 i " + (r-1) +" :");
		int n = sc.nextInt();

		System.out.println("Suma " + n + " reda dvodimenzionalnog niza iznosi: " + sumaReda(niz, n));

	}

}
