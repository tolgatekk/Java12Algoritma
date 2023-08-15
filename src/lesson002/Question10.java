package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("2. Sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		System.out.println("3. Sayıyı giriniz: ");
		int sayi3 = scan.nextInt();
		
		int enbuyuk = sayi1;

	if (sayi2 > enbuyuk) {
			enbuyuk = sayi2;
	}	 if(sayi3 > enbuyuk){
			        enbuyuk = sayi3;
			}
		

		System.out.println("Girilen sayılardan en büyüğü = " + enbuyuk);

	}

}
