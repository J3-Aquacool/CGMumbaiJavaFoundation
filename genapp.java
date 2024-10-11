// Use Case
// Store custom objects inside the collection
// ie Lets store few employee objects

import java.util.*;

class Employee
{

int eid;
String ename;

Employee(int eid,String ename)
{
this.eid=eid;
this.ename=ename;

}

public String toString()
{
return eid +"  " +ename;
}


}





class genapp
{

public static void main(String a[])
{

List<Employee> data=new ArrayList();




// Lets add the employee objects

data.add(new Employee(1,"Mohith"));
data.add(new Employee(12,"Rohan"));
data.add(new Employee(15,"Prashanth"));
System.out.println(data);




//How to retriev Individual objects from collection

//Iterator: interface,used to iterate over all collection,only forward direction
//ListIterator:interface,used to iterate over only list collection,forward and //backward direction


/*Iterator <Employee>it=data.iterator();
while(it.hasNext())
{
//Employee obj=(Employee)it.next();

Employee obj=it.next();
System.out.println(obj.ename);
}
*/

ListIterator <Employee>it=data.listIterator();
while(it.hasNext())
{
//Employee obj=(Employee)it.next();

Employee obj=it.next();
System.out.println(obj.ename);
}

while(it.hasPrevious())
{

Employee obj=it.previous();
System.out.println(obj.ename);
}


}


}




