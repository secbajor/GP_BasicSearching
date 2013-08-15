import java.util.Scanner;


public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userquery; 
		int[] numbers = {23, 45, 756, 12, 43}; 
		

		
		int min = 0; 
		int max = numbers.length; 
		int index = -1; 
		
		System.out.println("Enter the number you would like to search for: "); 
		userquery = input.nextInt();
		
		while(max >= min)
		{
			System.out.println("max: "+max+" min: "+min+"index: "+ index);
			int mid = (min + max)/2; 
			
			if(numbers[mid] > userquery)
			{
				max = mid + 1; 
			}//end if 
			
			else if(numbers[mid] < userquery)
			{
				max = mid - 1; 
			}//end else if 
			else 
			{
				index = mid; 
				max = -1; 
			}//end else 
		}//end while 
		
		if(index != -1)
		{
			System.out.println("Found "+ userquery + " at position "+ index); 
		}//end if 
		
		else
		{
			System.out.println(userquery + " was not found!");
		}//end else 
		
	}//end main 

}//end class 
