package nthSmallest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] randomNumbers = new int[500];
		Random random = new Random();
		for (int i=0; i<500; i++) {
			randomNumbers[i]=random.nextInt(1000);
		}
		Arrays.sort(randomNumbers);
		System.out.println("Enter the vaule N to find the Nth smallest number");
		int n = scanner.nextInt();
		if (n<1) {
			System.out.println("Invalid vaule of N");
		}else if(n>randomNumbers.length){
			System.out.println("N is out of range");
			}else {
				int nthsmallestNumber = randomNumbers[n-1];
				System.out.println("The " + n + "th smallest number is:" + nthsmallestNumber);
			}
		
		scanner.close();
		}


}
