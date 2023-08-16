package lesson001;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
	switch (sayi) {
	case 1,2,3,4,5 -> System.out.println("Haftaici");
	case 6,7 ->System.out.println("Haftasonu");
	default ->
	System.out.println("Hatalı değer girdiniz");
	}
	}
		
		
	}


