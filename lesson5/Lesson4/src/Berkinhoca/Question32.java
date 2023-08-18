package Berkinhoca;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("kelime giriniz");
		String kelime=scanner.next();
		System.out.println("aramak istediğiniz harf");
		String harf=scanner.next();
		
		int toplam=0;
	for (int i = 0; i < kelime.length(); i++) {
		if (kelime.charAt(i)==harf.charAt(0)) {
			toplam+=1;
		}
		
	}
	System.out.println(toplam + " Tane "+  harf +"  vardır");
	}

}
