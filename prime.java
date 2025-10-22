package day1;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
	int count = 0;
	int fact = 1;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your number: ");
    int num = sc.nextInt();
    
    sc.close();
    
	for (int i=2; i<num; i++) {
		if (num%i == 0) {
			count++;
			}
	}	
	if (count == 0) {
		System.out.println("Prime No");
		
	}
	else {
		System.out.println("NOT PRIME");
		
	}
	for (int count1 = 1; count1<=num;count1++ ) {
		fact=fact*count1;
		
	} 
	System.out.println(fact);	
	}
	

}

