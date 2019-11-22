package convertbinary;

import java.util.Scanner;


public class ConvertBinary {
	
	//Method to check if number is a binary number
	public static boolean checkifNumisBinary (int binaryNum) {
		boolean isBinary = true;
		boolean a = true;
		int b = 0;
		
		while(a) {
			if(binaryNum == 0) {
				break;
			} else {
				b = binaryNum % 10;
				if (b > 1) {
					isBinary = false;
					return isBinary;
				}
				binaryNum /= 10;
			}
		}
		
		return isBinary;
	}
	
	//Method to convert binary number to an integer
	public static int binaryConverter(int binaryNum) {
		int result = 0;
		int counter = 0;
		int b = binaryNum;
		while(binaryNum > 0) {
			binaryNum /= 10;
			counter++;
		}
		
		int [] array = new int [counter];
		
		
		for (int i = 0; i < counter; i++) {
			
		int a = (int) Math.pow(2, i);
		if (i == 0) {
		array[i] = b % 2;
		} else {
		array[i] = (b % (2 * ((int) Math.pow(10, i))) / (int)Math.pow(10, i) ) * a;
		}
		}
		
		for (int i = 0; i < counter; i++) {
		result += array[i]; 
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myInt = 10;
		
		Scanner scnr = new Scanner(System.in);
		
		int b = 0;
		boolean isBinary = false;
		while(b != 1) {
		System.out.println("Please enter a binary number:");
		myInt = scnr.nextInt();
		isBinary = checkifNumisBinary(myInt);
		
		while(!isBinary) {
		
		System.out.println("Number is not binary, please try again: ");
		myInt = scnr.nextInt();
		isBinary = checkifNumisBinary(myInt);
		}
		
		System.out.println("the binary number is: " + binaryConverter(myInt));
		System.out.println("Would you like to continue? Press 1 to continue. Press any other number to escape.");
		b = scnr.nextInt();
		
		
	}
		System.out.println("Goodbye!");
		scnr.close();
		
	}
}
