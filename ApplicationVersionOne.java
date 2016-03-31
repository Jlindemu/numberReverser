import java.util.Scanner;

public class ApplicationVersionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub and comment 1/4
		
		int x;
		int reverse = 0;
		
		System.out.println("What number can I reverse for you?");
		Scanner scanner1 = new Scanner(System.in);
		//x is the number that's going to be reversed! Neat!
		x = scanner1.nextInt();
		
		while( x != 0 ){
			// When it hits 0, you've run out of numbers to reverse
			
			reverse = reverse * 10;
			reverse = reverse + x%10;
			x = x/10;
			/* reverse starts as 0
			and each time you go through the while method
			you divide your working original number by 10 
			to move on to the next integer*/
			
			scanner1.close();

		}
		
		System.out.println("The reverse of your number is " + reverse + ".");

	}

}
