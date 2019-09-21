package domaci08082019;

import java.util.Scanner;

public class DomaciZadatak1 {

	static int[] minMax(int[][] a) {
		int min = a[0][0];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		int[] minmax = { min, max };
		return minmax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi broj nizova:  ");
		int n = sc.nextInt();
		int niz[][] = new int[n][n];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi elemente niza: " + (i + 1));
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Najmanji clan dvodimenzionalnog niza je: " + minMax(niz)[0]);
		System.out.println("Najveci clan dvodimenzionalnog niza je: " + minMax(niz)[1]);
	}

}
