package homework_3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
//		  char ch = 'Z';
//        int ascii = ch;
//        System.out.println(ch + " 'nin ASCII değeri: " + ascii);
//		
		/*	Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin. 
		 * (D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu)
		 */ 
		 
		 
		
		
		Scanner scan = new Scanner (System.in);
     
        System.out.println("Please enter a character =");
      
        char karakter = scan.next().charAt(0);
    
        int ascii = (int)karakter ;
        
        if ( (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122 ) ) {
        	
        	System.out.println("it's a letter . ");
        	
       }                    
        	
        else {
        	
       	System.out.println( "the entered value is not a letter.");

        }
        
        scan.close();
        	
        }

	
	


// Character.isDigit (" karakter/letter /digit ") ;
	
// if (	Character.isDigit (" karakter/letter /digit ") {
	
//  system.out.println("letter/digit/karakter") 	
		
         
         
         
         
	}


