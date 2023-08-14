package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Urunun fiyatini giriniz ");
        int fiyat = scanner.nextInt();
        
        double hamfiyat = fiyat /(1.18*1.15);
        System.out.println("Urunun Ham Fiyati : " + hamfiyat);
	}

}
