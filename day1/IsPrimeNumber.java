package HomeAssignments1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11; 
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if (n%i==0)
				count++;
		}
		
		if(count==2)
		{
			System.out.println("the number "+n+ " is prime number");
		}
		else
		{
			System.out.println("the number"+n+ " is not a prime number");
		}
		
			}
}