package lesson001;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi =scanner.nextInt();
		int toplam = 0;
		
		
		while (sayi!=0)
		{
		toplam=(sayi%10) +toplam ;
		
		sayi=sayi/10;
		}
		System.out.println("rakamlar toplamı " + toplam);
		
		
	}

}
