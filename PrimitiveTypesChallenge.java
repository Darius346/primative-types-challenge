package CodingChallenges;

/*
 * Create an int variable and set it to any int number. Then
 * create a variable of type long and make it equal to 50000 
 * plus 10 times the sum of the byte plus the short plus
 * integer values.
 */
public class PrimitiveTypesChallenge 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte val1 = 20;
		short val2 = 4500;
		int val3 = 30000;
		
		long val4 = 50000L + 20L * (val1 + val2 + val3) ;
		System.out.println(val4);
		
		short val5 = (short) (1000 + 10 * (val1 + val2));
		System.out.println(val5);
	}
}
