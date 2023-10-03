package hit.Fibonacci;
public class Fibonacci {
	    // Function to print N Fibonacci Number
	    public static void Fibonacci(int N)
	    {
	        int num1 = 0, num2 = 1;
	 
	        int counter = 0;
	 
	        // Iterate till counter is N
	        while (counter < N) {
	 
	            // Print the number
	            System.out.println(num1 + " ");
	 
	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter = counter + 1;
	        }
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        // Given Number N
	        int N = 20;
	 
	        // Function Call
	        Fibonacci(N);
	    }
	}
