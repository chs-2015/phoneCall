/**
 * Author: Brandon B.
 * Date: 9-14-15
 * Description: Determine the cost for someone calling Lexington, Virginia
 */

import java.util.Scanner;
public class phoneCall {
    public static void main(String[] args) {
    	// Declare our variables
    	Scanner kbReader = new Scanner(System.in);
    	final double initialCharge = 1.15, initialMinutes = 2, overtime = 0.5; 
    	double callTime, totalCost;

		System.out.print("Enter your time spent on the phone in minutes: ");
		callTime = kbReader.nextDouble();

		// Subtract the call time by two. If we have something above 0, they spent more than 2 minutes on the phone!
		callTime -= initialMinutes;
		if (callTime <= 0) {
			// The person spent 2 minutes or less on the telephone.
			totalCost = initialCharge;
		}
		else {
			// We need to calculate the cost of the extra time spent, and add the initial charge.
			totalCost = (callTime * overtime) + initialCharge;
		}

		System.out.println("Your total call cost is: $" + totalCost);
    }
}
