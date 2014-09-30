import java.util.Scanner;
import org.junit.Test;

public class CheckDigit 
{
		@Test
		public static void main(String[] args) 
		{
			String creditCard;
			Scanner keyBoard = new Scanner(System.in);
			System.out.println("Please enter in your Credit Card Number: ");
			creditCard = keyBoard.next(); 
			
			validateCreditCardNumber(creditCard);
	        
	    }
	 
		@Test
	    public static void validateCreditCardNumber(String str) 
	    {
	         
	        int[] ints = new int[str.length()];
	        
	        
	        for(int i = 0; i < str.length(); i++)
	        {
	            ints[i] = Integer.parseInt(str.substring(i, i + 1));
	        }
	        
	        for(int i = ints.length - 2; i >= 0; i = i - 2)
	        {
	            int j = ints[i];
	            j = j * 2;
	            if(j > 9)
	            {
	                j = (j % 10) + 1;
	            }
	            ints[i] = j;
	        }
	        int sum = 0;
	        
	        for(int i = 0; i < ints.length; i++)
	        {
	            sum = sum + ints[i];
	        }
	        
	        int ele = 0;
	        int y = 0;
	        ele = ints.length - 4;
	        if(sum % 10 == 0)
	        {
	        	System.out.printf("*");
	        	for(int i = 0; i < 4; i++)
	            {
	            	System.out.print(ints[ele + y]);
	            	y++;
	            }
	        	System.out.printf(" is a valid Credit Card number.");
	        }
	        
	        else
	        {
	        	System.out.printf("*");
	        	for(int j = 0; j < 4; j++)
	            {
	            	System.out.print(ints[ele + y]);
	            	y++;
	            }
	        	System.out.println(" is an invalid Credit Card number.");
	        }
	        
	        
	    }

}
