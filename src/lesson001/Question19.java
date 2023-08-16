package lesson001;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		
		int sayi =scanner.nextInt();
		
		String besinkatimi="5 in katı değildir";
		
		while (sayi !=1) {
			if (sayi%5!=0) {
				besinkatimi="5 in kuvveti değildir";
				sayi=1;
			} else { 
				besinkatimi = "Beşin katıdır";
				sayi/=5;
			}
		}
		System.out.println(besinkatimi);
		
	}

}
