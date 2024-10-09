
/*Interface ?
1.An interface is also termed has pure abstract class
2.We cannot create and object/instantiate this class
3.It can have only abstract methods
4.It cannot  have constrcutors
5.To create and interface we use a keyword "interface" and if we want to add
abstract methods in this class we can diretly create without using "abstract" keyword
6. By default all methods in interface are abstract,public
 Lets Demonstrate all these above points

7. When a class wants to use interface "implements" is a keyword to be used.
8. It can have datamembers but they should be initalized because
they are by default final and static  in interface
*/


interface  Tv
{

 String greetings="Welcome to OOP's";
abstract public void switchOn();
 void switchOff();
/*void switchChannel()
{
Not possible to have non-abstract methods
}
*/

}




interface  MusicStation extends Tv
{
void playMusic();



}




class SonyTv implements MusicStation
{
public void switchOn(){

}
 public void switchOff(){
System.out.println("Lets switch off the session ");
}

public void playMusic(){}
}


class UsingInterface
{

public static void main(String a[])
{
//Tv obj=new Tv();// compile error
Tv obj;// yes

System.out.println(Tv.greetings);


Tv ref=new SonyTv();
ref.switchOff();
SonyTv s=new SonyTv();
s.switchOff();


}

}


