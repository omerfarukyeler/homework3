package homework_3;

import java.util.Scanner;

public class Question3 {

	
	public static void main(String[] args) {
		
		
		/*-	Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin.                     
         *    Ornek ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
         *   ilkHarf=S output = “Sali”  (switch case default ile yapalim)
         */
		 
		 
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("please enter one of the days of the week: ");
		
		char days = scan.next().charAt(0);
		
		
		switch (days) {
		
		    case 'p'  :
		    	
		    	System.out.println("pazartesi ,persembe veya pazar");
		    	
		    	break ;
		    	
		    	
		    case 's'  :
		    	
		    	System.out.println("sali");
		    	 
		    	break ;
		    
		    
		    case 'ç'  :
		    	
		    	System.out.println("carsamba");
		        
		    	break ;
		    	
		    case 'c'  :
		    	
		    	System.out.println("cuma veya cumartesi ");
		    	
		    	break ;
		    	
		    default :
		    	
		    	
		    	System.out.println("hatali giris yapildi!!!");
		    	
		    	
		
		}
		
		
		scan.close();
		
	}
}
