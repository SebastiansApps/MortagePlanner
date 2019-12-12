/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MortagePlanPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MortagePlan {
	
    public static void main(String[] args) throws FileNotFoundException {
    	
    	int index = 1;
    	File file = new File("prospects.txt");
    	Calculations calc = new Calculations();
    	
		try (Scanner scan = new Scanner(file)) {
			while(scan.hasNextLine()) {
				
				String line = scan.nextLine();
				if (line != null) {
					//Split by ,
					String[] details = line.split(",");
					String name = details[0];
					float total = Float.parseFloat(details[1]);
					float interest = Float.parseFloat(details[2]);
					int years = Integer.parseInt(details[3]);
					
					float monthAmnt = calc.calcMortage(total, interest, years);
					
					//Print result
					System.out.println("Prospect " + index + ": " + name + 
					   " wants to borrow " + total + " \u20ac for a period of "
					   + years + " years and pay " + monthAmnt + " \u20ac each month ");
					
					index ++;
				}
			}
		}
    }
}