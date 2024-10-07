





//PS: Store the details of 10 Students


class Student
{
String name;
int rollno;
int marks;


}

class DemoApp
{


public static void main(String a[])
{

Student st[]=new Student[2]; // 2 objects of Student
st[0].name="Prathmesh";
st[0].rollno=101;
st[0].marks=90;



st[1].name="Yash";
st[1].rollno=201;
st[1].marks=190;


//


int rollno[]=new int[10]; // fixed size
rollno[0]=19;
rollno[1]=29;
rollno[2]=39;
System.out.println(rollno[2]);


int [] totamarks={900,800,770,777};
System.out.println(totamarks[1]);


// How to find the length of an array
// using a property called "length" of Array Class
System.out.println(totamarks.length);
}

}
















