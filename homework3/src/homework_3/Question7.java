package homework_3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		
		/*	Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 5’e bölünüyorsa son
		 *  rakamını control edin. Sonrakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. Sonrakamı
		 *  0 değilise “5’e bölünen tek sayı” yazdırın. Girdiği password 5’e bölünmüyorsa ekrana 
		 *  “Tekrar deneyin” yazdırın. (Nested Ternary kullanalim)
		 */
		 
		 		
		Scanner scan =new Scanner (System.in);
		
		
		System.out.println("Please enter a 4 digit number= ");
		
		
		long sayi = scan.nextLong();
		
		String sonuc = (( sayi>=(-9999) && sayi<=9999) && (sayi%10==0 || sayi%10==5 || sayi%10==-5))? (sayi%10==0 
				       
				         ? "5 e bolunen cift sayi":"5 e bolunen tek sayi"):"tekrar deneyin" ;
		
        System.out.println(sonuc);
        
        
        
        scan.close();
	}
	
	
	

}
