package OperationsAndVariables;

public class Week1OperationsAndVariables {
	
	public static void main(String[] args) {
		int planeSeatsLeft = 5;
		double groceryCost =  10.01;
		char middleInitial = 'A';
		boolean trueIfHot = true;
		String customerFirstName = "Greg";
		String streetAddress = "123 Main Street";
		System.out.println("Seats left on plane: " + planeSeatsLeft);
		System.out.println("Cost of groceries: " + groceryCost);
		System.out.println("Middle initial: " + middleInitial);
		System.out.println("Is it hot outside? " + trueIfHot);
		System.out.println("Customer's first name is " + customerFirstName);
		System.out.println("Street address: " + streetAddress);
		planeSeatsLeft -= 2;
		System.out.println("Seats left on plane: " + planeSeatsLeft);
		groceryCost += 2.15;
		System.out.println("Cost of groceries: " + groceryCost);
		middleInitial = 'G';
		System.out.println("Middle initial: " + middleInitial);
		trueIfHot = !trueIfHot;
		System.out.println("Is it hot outside? " + trueIfHot);
		String fullName = customerFirstName + " " + middleInitial + " " + "Gregson";
		System.out.println("The customer is " + fullName + " and they live at " + streetAddress);
		System.out.println("The customer is " + fullName + " and they live at " + streetAddress);

	}
	
}
