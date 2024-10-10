class Excepdemo
{
public static  void main(String a[])
{
String name=null;
int age=0;
try
{
name=a[0];
age=Integer.parseInt(a[1]);
}catch(ArrayIndexOutOfBoundsException|NumberFormatException exp)
{
System.out.println("What is the problem:?"+ exp.getMessage());
}
/*catch(NumberFormatException nfe)
{
System.out.println("What is the problem:?"+ nfe.getMessage());
}
*/
finally
{
System.out.println("Inside Finally");
}
System.out.println("Name:"+name +"Age:"+age);
}
}



String getMessage();
void printStackTrace();



