package lesson002;

import java.util.Scanner;

public class Questiob8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kenar1, kenar2, kenar3;

		System.out.println("1. kenarı giriniz");
		kenar1 = scan.nextInt();
		System.out.println("2. kenarı giriniz");
		kenar2 = scan.nextInt();
		System.out.println("3. kenarı giriniz");
		kenar3 = scan.nextInt();

		if ((kenar1 == kenar2) && (kenar2 == kenar3)) {
			System.out.println("eşit kenar üçgen");
		} else if ((kenar1 == kenar2) || (kenar1 == kenar3) || (kenar2 == kenar3)) {
			System.out.println("ikizkenar üçgen");
		} else {
			System.out.println("çeşitkenar üçgen");
		}
	}

}
