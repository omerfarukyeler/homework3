package homework_3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		/* 	Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu yazalım.
      	 */ 

     	Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 1st number =");
		
	    int sayi1 =scan.nextInt();
		
		System.out.println("Please enter 2nd number = ");
		
		int sayi2 =scan.nextInt();
		
		System.out.println("Please enter 3rd number = ");
		
		int sayi3 =scan.nextInt();
		
		
		
				
		
		 if (sayi1 > sayi2 && sayi1 > sayi3) {
			
			
			System.out.println("largest entered number "+ sayi1);
		}
		
		else if (sayi2 > sayi1 && sayi2 > sayi3) {
			
			
			System.out.println("largest entered number "+ sayi2);
			
		}			
					
		else  { 
			
			System.out.println(" largest entered number " +sayi3);
			
		}
			
			
		
		
		scan.close();
			
         }



         }
		
	
	

	



