import java.util.Scanner;
import java.lang.Math;

public class Main {

	Scanner sc = new Scanner(System.in);

	 

    //function to checkPalindrome

public void checkPalindrome()  {
	
	System.out.println("Enter Number");
	int palin = sc.nextInt();
	int i = palin;
	int reverse = 0;
	while(i!=0) {
		reverse = reverse * 10 + (i % 10);
		i = i/10;
	}
	if(palin == reverse) System.out.println("Palindrom");
	else System.out.println("Not a Palindrom");
}



     //function to printPattern

public void printPattern() {
	System.out.println("Enter Number");
	int number = sc.nextInt();
	while(number > 0) {
		System.out.println();
		for(int i = number;i > 0;i--)System.out.print("*");
		number--;
	}
	System.out.println();
}



   //function to check no is prime or not

 public void checkPrimeNumber() {
	 System.out.println("Enter Number");
		int number = sc.nextInt();
		int factor=0;
		for(int i=1;i<Math.sqrt(number);i++) {
			if(number%i==0)factor++;
		}
		if(factor>1)System.out.println("not a Prime");
		else System.out.println("Prime");
 }

  

   // function to print Fibonacci Series

   public void printFibonacciSeries() {

         //initialize the first and second value as 0,1 respectively.

    int first = 0, second = 1;
    System.out.println("Enter Number");
	int number = sc.nextInt();
	System.out.print("0 ");
	while(number>1) {
		System.out.print(second + " ");
		int temp = second;
		second=second+first;
		first = temp;
		number--; 
		
	}

   }
	public static void main(String[] args) {
		
		 Main obj = new Main();

         int choice;

         Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();

}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

		
	}

}
