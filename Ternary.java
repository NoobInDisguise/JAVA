import java.util.Scanner;

public class Ternary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Checking the Ternary operator");
		System.out.println("Enter the first number: ");
		int num1 = in.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = in.nextInt();

		int greaterNum =  num1 > num2 ? num1 : num2;  // int  greaterNum is the condition ; if this cond is true then the  first one(num1) will be printed otherwise num2 will be printed

		System.out.println("The greater number is: " + greaterNum);
	}
}
