package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//First input is used to determine the total number of customers
		int totalCustomers = scan.nextInt();
		
		//Create an array of strings with length totalCustomers that holds their first and last names
		String[] firstNames = new String[totalCustomers];
		String[] lastNames = new String[totalCustomers];
		
		//Create an array of integers with the amount of unique items each customer buys
		int[] itemList = new int[totalCustomers];

		
		//Create a for loop to fill in the names of the customers and their shopping lists
		for (int i = 0; i < totalCustomers; i++) {
			
			String customerFirstName = scan.next();
			firstNames[i] = customerFirstName;
			
			String customerLastName = scan.next();
			lastNames[i] = customerLastName;
			
			int uniqueItems = scan.nextInt();
			itemList[i] = uniqueItems;
			
			double[] itemTotal = new double[1];
			
			for (int k = 0; k < uniqueItems; k++) {
				double[] itemAmountArray = new double[uniqueItems];
				
				double[] itemPriceArray = new double[uniqueItems];
				
				double itemAmount = scan.nextDouble();
				itemAmountArray[k] = itemAmount;
				
				String itemName = scan.next();
				
				double itemPrice = scan.nextDouble();
				itemPriceArray[k] = itemPrice;
								
				double totalChange = itemAmountArray[k] * itemPriceArray[k];
				
				itemTotal[0] = itemTotal[0] + totalChange;

			}
						
			char firstChar = firstNames[i].charAt(0);
			
			
			System.out.println(firstChar + ". " + lastNames[i] + ": " + String.format("%.2f", itemTotal[0]));
						
			}
			
			
		}
	}

