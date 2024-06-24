 import java.util.Scanner;
 class Tester {
	public static void main(String[] args) {
		int totalCost = 0;
	        String option ;
		int unitPrice = 10;
		int quantity = 1;
		Scanner sc=new Scanner(System.in);
		
 
		 
		do{
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add one more food item to the order? Y or N");
		           option=sc.nextLine();
			
		}while(option.equals("y"));
		System.out.println("Thank you for ordering the food! It will reach you shortly...");
	}
}