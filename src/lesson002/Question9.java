package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ortalama;

		System.out.println("ortalamayı giriniz");
		ortalama = scan.nextInt();
		
if (ortalama>100 || ortalama<0) {
	System.out.println("lütfen geçerli bir değer giriniz");
}if (ortalama>=90 && ortalama<101) {
			System.out.println("AA ortalama ile geçtiniz");
		}else if (ortalama>=80 ) {
				System.out.println("BB ortalama ile geçtiniz");
			}else if (ortalama>=70) {
					System.out.println("CC ortalama ile geçtiniz");
			}else if (ortalama>=60) {
						System.out.println("DD ortalama ile geçtiniz");
			}	 else {
								System.out.println("FF ile kaldınız");
			}
}
}