
/*Abstract class?
1.These classes are also termed has virtual classes
2.We cannot create and object/instantiate this class
3.It can have abstract and non-abstract methods
4.It can also have constrcutors
5.To create and abstract class we use a keyword abstract and if we want to add
abstract methods in this class we should use "abstract" keyword

 Lets Demonstrate all these above points
*/


abstract class Tv
{
Tv()
{
System.out.println("Constructor of abstract class");
}

Tv(String name)
{
System.out.println("Tv Name is:"+name);
}

void playMovie()
{
System.out.println("Non- Abstract method");
}

abstract public void switchOn();


}

class SonyTv extends Tv
{
SonyTv()
{


super("Onida");// which will call the constructor of base class


System.out.println("Inside the SOny Constrcutor");
}

public void switchOn()
{
super.playMovie();
System.out.println("Sony Makers should write their implementatiom");

}

}

class Absdemo
{

public static void main(String a[])
{
//Tv obj=new Tv();// compilation error
Tv obj;// yes

SonyTv sony=new SonyTv();
sony.playMovie();
sony.switchOn();

}

}


// What is super?
// super is used to invoke /call the constrcutor/methods/datamember
// of base class

// super should be the first statement in the block





