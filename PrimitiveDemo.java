class PrimitiveDemo 
{
public static void main(String x[]) 
	{
		// Declaring a var of type int. It is assigned an int literal 5
		int i = 5;

		// Declaring a var of type boolean. It is assigned a boolean literal true
		boolean isValid = true;

		// Declaring a var of type double. It is assigned a double literal 45.78
		double d = 45.78;				// Compiler assumes 45.78d 

		// Declaring a var of type float. It is assigned a float literal 8.9f
		float f = 8.9f;						// without 'f' there results a compilation error

		// Declaring a var of type char. Character literals are enclosed in '', as in 'c'
		char c = 'a';

		// Displaying all the values
		System.out.println("Integer Value: " + i);
		System.out.println("Boolean Value : " + isValid);
		System.out.println("Double Value : " + d);
		System.out.println("Float Value : " + f);
		System.out.println("Character Value : " + c);
	}
}
