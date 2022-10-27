import java.util.*;
public class PowerTable {

	public static void main(String[] args) {
		
		System.out.println("Learn your squares and cubes!\n");
		
		Scanner scan = new Scanner(System.in);
		String response; 
		String numbers = "";
		
		do {
			
			System.out.println("Enter an integer: \n");
			int num = scan.nextInt();
			String Title  = "Number  "+"Squared " + "Cubed  " + "\n" + "====== " + "====== " + "====== ";
			System.out.println(Title);
			
			for(int i = 1; i <= num; i++) {
				double squared = Math.pow(i, 2);
				double cubed = Math.pow(i, 3);
				
				numbers = i + "       " + squared + "       " + cubed;
				System.out.println(numbers);
				
			}
			System.out.println("Continue? (y/n): ");
			response = scan.next();
		} while (!response.equalsIgnoreCase("n"));
		System.out.println("I hope you learned your Squared and Cubed multipliers a test will be next week!");
	}

}
