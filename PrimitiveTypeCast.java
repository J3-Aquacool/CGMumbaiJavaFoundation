class PrimitiveTypeCast 
{	public static void main(String x[]) 
	{
		int intVal  = 111;
		short shortVal = 222;
		double doubleVal = 111.11;
		char charVal = 'c';
		boolean booleanVal = true;

		//implicit type casting - destination type is larger than source type.
		//short to int  
		intVal = shortVal;
		//int to double
		doubleVal = intVal;
		//char to int
		intVal = charVal;
	
//explicit type casting - destination type is smaller than source type.
			
		
4-bytes

double -16:

	
		//double to int
		int num = (int )1000.11;
		//int to char
		char ch1 = (char)65;
		
		// Incompatible types
		//booleanVal = (boolean)100;			
		//booleanVal = 'c';
		//error boolean cannot be cast
	}
}


// To avoid use Wrapper class

// Every data type is associted with a class in Java


int-----gets derived from ----------->Integer
float-------------->Float
double------------->Double
short-------------->Short----------------------------->Number-------->Object
byte--------------->Byte
long---------------->Long



char--------------->Character
boolean---------------->Boolean















