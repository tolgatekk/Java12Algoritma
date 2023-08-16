package lesson001;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi =scanner.nextInt();
	
		int toplam=0;
		
		while (sayi!=0) {
			if(sayi%2 !=0) {
				toplam=toplam+sayi;
			}
			sayi--;
		}
		
		System.out.println(toplam);
	}

}
