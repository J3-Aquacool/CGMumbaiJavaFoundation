// Use Case

//Need to create one method which can take any type of data(ie //int,float,double,string)

// Generics

// to class,method,bounded generic types



import java.util.*;

class AnyData<T>
{

/*Object  acceptData(Object x)
{
return x;
}
*/
 void acceptData(T x)
{
System.out.println(x);

}





}



class genapp
{

public static void main(String a[])
{
AnyData <Integer>obj=new AnyData();
//obj.acceptData("Java");



List<Object> data=new ArrayList();


ArrayList<Object> data1=new ArrayList();
data.add("Yash");
data.add(new String("Venkatesh"));
data.add("Tejas");
data.add("Mohith");
data.add("Vinay");
data.add(1000);


System.out.println(data);
System.out.println(data.get(2));


// More Operations with ArrayList
ArrayList  list = new ArrayList();
		list.add("J2SE");
		list.add("J2ME");
		list.add("J2EE");
		System.out.println("Size of the arraylist : " +list.size());
		for(int i=0 ; i<list.size() ; ++i) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
		System.out.println("Adding one more element to the arraylist");
		list.add("The Java Platform");
		System.out.println("Element 4 : " + list.get(3));
		System.out.println("Size of arraylist now : " +list.size());


//**************************************
ArrayList al = new ArrayList ();
                System.out.println("Initial size of al: " + al.size());
	           al.add("C");
	           al.add("A");
	           al.add("E");
	           al.add("B");
	           al.add("D");
	           al.add("F");
	           al.add(1, "A2");
	           System.out.println("Size after additions:"+al.size());
	           System.out.println("Contents of al: " + al);
	           al.remove("F"); 
                al.remove(2);
	           System.out.println("Size after deletions: "+al.size());
	           System.out.println("Contents of al: " + al);
        

}


}


//Array[Yash, Venkatesh, Tejas, Mohith, Vinay]

