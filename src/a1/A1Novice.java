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
			
			//Gets the customers first name and adds it to the first name list
			String customerFirstName = scan.next();
			firstNames[i] = customerFirstName;
			
			//Gets the customers last name and adds its to the last name list
			String customerLastName = scan.next();
			lastNames[i] = customerLastName;
			
			//Gets the amount of unique items each customer buys and adds it to the array itemList
			int uniqueItems = scan.nextInt();
			itemList[i] = uniqueItems;
			
			//Creates an array that holds the total price of items for each person
			double[] itemTotal = new double[1];
			
			//Create a for loop to find the total prices for each persons items
			for (int k = 0; k < uniqueItems; k++) {
				
				//An array for the amount of each item bought
				double[] itemAmountArray = new double[uniqueItems];
				
				//An array for the price of each item bought
				double[] itemPriceArray = new double[uniqueItems];
				
				//Gets the amount of each item bought and adds it to the array
				double itemAmount = scan.nextDouble();
				itemAmountArray[k] = itemAmount;
				
				//Gets the name of each item
				String itemName = scan.next();
				
				//Gets the price of each item bought and adds it to the array
				double itemPrice = scan.nextDouble();
				itemPriceArray[k] = itemPrice;
								
				//Calculates the total costs for each person
				double totalChange = itemAmountArray[k] * itemPriceArray[k];
				itemTotal[0] = itemTotal[0] + totalChange;

			}
			
			//Gets the first letter of each person's name
			char firstChar = firstNames[i].charAt(0);
			
			//Prints the output
			System.out.println(firstChar + ". " + lastNames[i] + ": " + String.format("%.2f", itemTotal[0]));
						
			}
			
			
		}
	}

