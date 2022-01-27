package forConcepts;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = s.nextInt();
		
		for(int i=1; i<=3;i++)
		{
			int loan =(amount*10)/100;
			amount = amount - loan;
		}
		System.out.println("Remaining amount: "+amount);
		
		s.close();	
	}

}
