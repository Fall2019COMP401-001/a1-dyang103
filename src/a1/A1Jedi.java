package a1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Gets the number of unique items that can be bought
		int itemAmount = scan.nextInt();
		
		//Create an array that will contain the names of the items
		String[] itemNames = new String[itemAmount];
		
		//Use a for loop to fill the array with the item names
		for(int i = 0; i<itemAmount; i++) {
			String item_name = scan.next();
			double item_cost = scan.nextDouble();
			
			itemNames[i] = item_name;
		}
		
		//Get the number of customers buying items
		int numberOfCustomers = scan.nextInt();
		
		//Create a HashMap that keeps track of the numbers of each item bought
		HashMap<String, Integer> number_item = new HashMap<>();
		
		//Create a HashMap that keeps count of how many people bought a certain item
		HashMap<String, Integer> peopleCount = new HashMap<>();
		
		
		//Use a for loop to iterate through each customers shopping list
		for(int i = 0; i<numberOfCustomers; i++) {
			
			//Gets each customers names and how many items bought
			String firstName = scan.next();
			String lastName = scan.next();
			int uniqueItems = scan.nextInt();
			
			//Create a HashSet that keeps track of items bought by each customer
			HashSet<String> items = new HashSet();
			
			//Use a for loop to go through each customers items 
			for(int k = 0; k<uniqueItems; k++) {
				
				//Gets the amount of each item bought and its name
				int item_num = scan.nextInt();
				String item_name = scan.next();
				
				//Add the names of the items bought to the HashSet
				items.add(item_name);
				
				//Add the item names and number of times bought per customer to HashMap
				number_item.put(item_name, number_item.getOrDefault(item_name, 0) + item_num);
				
			}
			//Use a for loop to count the amount of people that bought each item
			for(String item_name : items) {
				peopleCount.put(item_name, peopleCount.getOrDefault(item_name, 0) + 1);
			}
		}
		
		//Print out the output
		//Use a for loop to iterate through the Array of item names to find out how many items were bought and by how many customers
		for(int i = 0; i<itemNames.length; i++) {
			int num_customers = peopleCount.getOrDefault(itemNames[i], 0);
			int itemCount = number_item.getOrDefault(itemNames[i], 0);
			
			if(num_customers > 0) {
				System.out.println(num_customers + " customers bought " + itemCount + " " + itemNames[i]);
			} else {
				System.out.println("No customers bought " + itemNames[i]);
			}
			
		}
		
	}
}
