package homework_3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
		/*	Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
         *  gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar” 
         *  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin. (switch case default ile yapalim)
         */ 
		  
				
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Please enter a day= ");
		
		String days = scan.nextLine();
		
				
		switch (days) {
		
			 case "cuma" :
				
				System.out.println("Muslumanlar icin kutsal gun");
				
				break ;
				
			 case "cumartesi":
				
				System.out.println("yahudiler icin kutsal gun");
				
				break;
								
			 case "pazar" :
				System.out.println("hristiyanlar icin kutsal gun");
				
				break ;
				
			 default :
				
				System.out.println("bugun herhangi bir kutsal gun degildir!!!");
 		
		
		}
		
		scan.close();
 
	}

}
