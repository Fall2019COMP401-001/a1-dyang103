package a1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Create a HashMap that contains each item and its respective price
		HashMap<String, Double> itemMap = new HashMap<>();
		
		//The first integer scanned will tell us how many items will go into the HashMap
		double itemAmount = scan.nextDouble();
		
		//use a for loop to add itemAmount number of items to the HashMap 
		for( int i = 0; i < itemAmount; i++) {
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			
			itemMap.put(itemName, (double) itemPrice);
		}
		
		//The next number scanned will be the amount of customers
		int customerAmount = scan.nextInt();
		
		//Create and Array to store the customers shopping information
		String[][] customerInfo = new String[customerAmount][2];
		
		//Use a for loop to go through each customers shopping list
		for(int i = 0; i < customerAmount; i++) {
			
			//Gets each customers names and number of unique items bought
			String firstName = scan.next();
			String lastName = scan.next();
			int uniqueItems = scan.nextInt();
			double itemPrice = 0;
			
			//Use a for loop to determine the specific items and amounts bought
			for(int k = 0; k < uniqueItems; k++) {
				double item_num = scan.nextDouble();
				String item_name = scan.next();
				
				//Get the total price for each item bought by referencing price in HashMap
				itemPrice += (item_num * itemMap.get(item_name));
				
			}
			
			//Add each customers information to the Array
			customerInfo[i][0] = firstName + " " + lastName;
			customerInfo[i][1] = "" + itemPrice;
		}
		
		//Determine the maximum amount spent between all of the customers
		//Use a for loop to iterate through the Array and find the highest value
		double max = 0;
		int max_index = -1;
		for(int i = 0; i<customerInfo.length; i++) {
			if(Double.parseDouble(customerInfo[i][1]) > max) {
				max_index = i;
				max = Double.parseDouble(customerInfo[i][1]);
			}
		}
		
		//Determine the minimum amount spent between all of the customers
		//Use a for loop to iterate through the Array and find the lowest value
		double min = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i = 0; i<customerInfo.length; i++) {
			if(Double.parseDouble(customerInfo[i][1]) < min) {
				min_index = i;
				min = Double.parseDouble(customerInfo[i][1]);
			}
		}
		
		//Find the Average amount spent between all of the customers
		//Iterate through the Array to add up all of the totals and divide by length
		double average = 0;
		for(int i = 0; i<customerInfo.length; i++) {
			average += Double.parseDouble(customerInfo[i][1]);
		}
		average = average/customerInfo.length;
		
		
		//Print the output
		System.out.printf("Biggest: %s (%.2f)\n", customerInfo[max_index][0], Double.parseDouble(customerInfo[max_index][1]));
		System.out.printf("Smallest: %s (%.2f)\n", customerInfo[min_index][0], Double.parseDouble(customerInfo[min_index][1]));
		System.out.printf("Average: %.2f\n", average);
	}
}
