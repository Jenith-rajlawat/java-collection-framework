package recursion;

public class Factorial {
// Programming concept in which a function calls itself
// directly or indirectly to solve a smaller instance of same problem
	

//BASE CASE Last or the easiest condition if solved will end the recursion 
	
//Recursive case : Larger problem which continues calling itself 




public static int factorial(int n) {
	
	// 5! = 5 X 4! --> 5 X 4 X 3 X 2 X 1 which will be 120
	//Therefore it should end at 1! or 0! where 0! will be 1 by law. 
	//Base Case
	//if n=0! then it will be 0 1! will be 1 
	if(n==0 || n==1) {
		return 1;
	}
	
	
	//Recursive case
	// if n=5  5X4!
	return n*factorial(n-1);
}

	public static void main(String... args) {
		int n=5;
		int result= factorial(n);
		System.out.println("Factorial of "+ n+ ": "+ result);
	}


}
