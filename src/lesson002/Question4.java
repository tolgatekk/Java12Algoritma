package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("1. Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.print("2. Sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		int enbuyuk = sayi1;

		if (sayi2 > enbuyuk) {
			enbuyuk = sayi2;

		}

		System.out.println("Girilen sayılardan en büyüğü = " + enbuyuk);

	}

}
