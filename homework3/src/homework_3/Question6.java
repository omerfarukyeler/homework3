package homework_3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		/*	Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.  
		 *  50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”.(If, else if, 
		 *  else kullanalim)
		 */
		 
		 
	
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Please enter your grade =");
	
	short not = scan.nextShort();
	
	if ( 100>=not    && not > 80) {
		
		System.out.println("your letter grade is A.") ; 
	}
	else if ( 80 >= not && not>60 ) {
		
		System.out.println("your letter grade is B");
	}
	else if ( 60>=not  && not>=50  ) { 
		
		System.out.println("your letter grade is C");
	}
	
	else if   (not<50 && not>=0) {
		
		System.out.println("your letter grade is D");
	}
	
	else {
		
		System.out.println("grading should be between 0-100.");
	}
	
	scan.close();
		
	}
		
		
	
	
	
	}


