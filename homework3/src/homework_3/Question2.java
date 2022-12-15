package homework_3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		/*2-	Kullanıcıdan bir gün girmesini isteyelim.
         *  a .	Eger girilen gun hafta sonu ise tekrar kontrol edelim Cumartesi ise Cumartesi ve hafta sonu, Pazar ise Pazar ve hafta sonu yazdıralım.
         *  b.	Degil ise gün hafta ici yazdıralım.
         */
		 
		Scanner scan =new Scanner(System.in);
		
		System.out.println("please enter a day =");
		
		String gun = scan.nextLine() ;
		
		String durum = gun.equals ("cumartesi")  || gun.equals  ("pazar") ? (gun.equals("cumartesi") ?
				
				                   "cumartesi ve haftasonu" : "pazar ve haftasonu"):"hafta ici";
		
		System.out.println(durum);
		
		scan.close();

	}
	
	

}
