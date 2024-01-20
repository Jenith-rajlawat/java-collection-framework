package logic_building_prog;

import java.util.Scanner;

//An Armstrong Number is a special positive number whose sum of cubes of its digit is equal to that number.



public class ArmstrongNumber {

	public static boolean isArmStrongNumber(int number) {
		
		int original=number;
		int sumOfCubes=0;
		
		while(number>0) {
		int temp= number%10; //get last digit
		number=number/10;// as we dont need last digit we remove it by dividing
		sumOfCubes=sumOfCubes +(temp*temp*temp);
		}
	
		if(sumOfCubes==original) 
		return true;
		else
		return false;
	}
	
	
	
	
	public static void main(String... args) {
	
		System.out.println("Enter a number to check if armstrong: ");
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		if(ArmstrongNumber.isArmStrongNumber(num)) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
		
		
	}
	
	
}
