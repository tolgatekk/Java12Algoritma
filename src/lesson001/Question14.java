package lesson001;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
String sayisiralama;

		System.out.println("1. Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("2. Sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		System.out.println("3. Sayıyı giriniz: ");
		int sayi3 = scan.nextInt();
		
		if (sayi1>=sayi2 && sayi1>=sayi3) {
			if (sayi2>=sayi3) {
				sayisiralama = sayi1 +">" + sayi2 +">" + sayi3;
				}
			
			
		}
	}

}
