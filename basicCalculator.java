import java.text.Collator;

public class basicCalculator {
	 public basicCalculator() {
	        // constructor does not need to do anything
	    }
	public static void main(String[]args) 
    {
		basicCalculator myCalculator = new basicCalculator();
		System.out.println(myCalculator.add(5, 6));
		System.out.println(myCalculator.subtract(5, 6));

    }
	
	public int add(int a, int b) 
    {
	  return a + b;
    }
	public int subtract(int a, int b) 
	{
		return a - b;
	}
    public int multiply(int a, int b) 
    {
    	return a*b;
    }
    public int divide(int a, int b)
    {
    	return a/b;
    }
    public int modulo(int a, int b) 
    {
		return a%b;
    	
    }
  }
