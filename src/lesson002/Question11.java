package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double pi=3.14;
		double alan,cevre;
		

		System.out.println("dairenin yaricapini giriniz ");
		int cap = scan.nextInt();
		
		if(cap<=0) {
			System.out.println("Lütfen pozitif sayı giriniz :");
		}
		else  {
	 alan=pi*cap*cap;
	 cevre= 2*pi*cap;
		System.out.println("Alan  "+ alan );
		System.out.println("Cevre  "+  cevre );
	
		}
	}

}
