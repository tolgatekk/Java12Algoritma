package Berkinhoca;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="Java,Spring,Postgre,React";
  

  	/*for (int i = 0; i <text.split(",").length ; i++) {
	System.out.println(text.split(",")[i]);
}
*/
for (int i = 0; i < text.length(); i++) {
	if(text.charAt(i)==',') {
		System.out.println();
		continue;
	}
	System.out.print(text.charAt(i));
}}}
/*
---çözüm1 substring---
String text = "Java,Spring,Postgre,React";
	
	int index = 0;
	for (int i = 0; i < text.length(); i++) {
		if (text.charAt(i) == ',') {
			System.out.println(text.substring(index, i));
			index = i + 1;
		}
	}
	System.out.println(text.substring(index));



----çözüm2 normal---
for (int i = 0; i < text.length(); i++) {
		if (text.charAt(i) == ',') {
			System.out.println();
		} else {
			System.out.print(text.charAt(i));
		
	}

}*/
