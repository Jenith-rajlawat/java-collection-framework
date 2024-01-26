package logic_building_prog;

import java.util.Scanner;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		boolean more= true;
		
		while(more) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\nWanna find our factors of more numbers? ");
		more=scan.nextBoolean();
		}
	}
	
	
}
