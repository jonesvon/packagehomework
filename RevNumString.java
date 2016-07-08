package homework;


	/*
	Vonnita Jones
	Pre Work
	*/

	import java.util.*;

	public class RevNumString 
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Please enter a number: ");
	        int num = scanner.nextInt();
	        
	      
	        RevNumString rns = new RevNumString();
	        int revNum = rns.reverse(num);
	        //String revStr = rns.reverse(str);
	        
	        System.out.printf("\n The reverse of number %d is %d ", num, revNum);
	       // System.out.printf("\n The reverse of string '%s' is '%s' ", str, revStr);
	    }
	    
	    // Formula to return the reverse of a number
	    public int reverse(int num) {
	        int revNum = 0;
	        while (num > 0) {
	            int rem = num % 10;
	            revNum = (revNum * 10) + rem;
	            num = num / 10;
	        }
	        return revNum;
	    }
	 
