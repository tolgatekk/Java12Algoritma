package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double vize;
		double final1;
	double ortalama;
		System.out.println("vize giriniz");
		 vize = scan.nextDouble();
		 
		 System.out.println("final giriniz");
		 final1 = scan.nextDouble();
		 if (vize < 0 || final1 <0|| vize > 100 || final1>100) {
			 System.out.println("doğru değer giriniz");
		 }
		 else { 
		 
		ortalama=(vize*0.4)+(final1*0.6);
		 if  (ortalama>=50) {
			 System.out.println("başarılı ortalamanız"+ ortalama);
		 }
		 else	  {
		 System.out.println("başarısız ortalamanız" + ortalama);
		 
		 }
		 }
	}
}


