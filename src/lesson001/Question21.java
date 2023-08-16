package lesson001;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi =scanner.nextInt();
		int basamak;
		int basamaksayisi=1;
		
		while(sayi!=0) {
			basamak=sayi%10;
			sayi=sayi/10;
			System.out.println(basamaksayisi+"ler basamağı"+basamak);
			basamaksayisi=basamaksayisi*10;
		}
	}

}
