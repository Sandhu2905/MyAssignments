package HomeAssignments1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
			int n = 8; 
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series: ");

	        for (int i = 0; i < n; i++) {
	            System.out.print(first + " ");

	            int next = first + second;
	            first = second;
	            second = next;
	        }

}
}