
/*this: 

1.is used to point to the current instance of that class
2.is used to call the method of the same class
3. is used in constructor chaining(ie same class).
*/


// PS: 
//1.CREATE A STUDENT CLASS WITH CONSTRUCTOR WHICH TAKES STUDENT NAME,ID
//2. Create a method which will print the student details


	class Student
	{
		// instance variables
		int id;
		String name;

		Student()
		{

			System.out.println("Default Constrcutor");
		}



		Student(int id,String name)
		{
			this();
			this.id=id;
			this.name=name;

			

		}
		Student(char gender,String city,int id,String name)
		{
			this(id,name);
			System.out.println("Gender:"+ gender +" City:"+city);


		}


		void greetings()
		{
		System.out.println("Welcome All Particpants");
		}
		void print()		
		{
		//this.greetings();
		System.out.println("Id :"+id +"Name:"+name);

		}
	}


class ThisDemo
{

public static void main(String ap[])
{


Student studentObj=new Student('M',"Delhi",10,"Prashanth");

studentObj.print();
}


}











