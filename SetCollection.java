// Use Case
// Need to sort Objects in natural order(TreeSet),random sorting(Hashset)
// Remove duplicate
// Store custom objects inside the collection
// Lets store few employee objects
// Identify the flaws in this below code

// Filter by name,filter by id



// Comparator
import java.util.*;
class Employee implements Comparable<Employee>
{
private int eid;
private String ename;
Employee(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}

public String getEname()
{
return ename;
}


public String toString()
{
return eid +"  " +ename;
}



// 0 -ve,+ve

// Lexographical
public int compareTo(Employee e)
{
return ename.compareTo(e.ename);

}

}



//







//

class SetCollection
{

public static void main(String a[])
{

//Set<Integer> tree=new TreeSet();
/*tree.add("Prashanth");
tree.add("Rohan");
tree.add("Mohith");
*/
/*tree.add(100);
tree.add(3);
tree.add(1);
tree.add(100);
//tree.add(null); NPE


System.out.println(tree);

System.out.println("*****************************");


Set<String> hash=new HashSet();
hash.add("Prashanth");
hash.add("Rohan");
hash.add("Mohith");
hash.add("Rohan");
hash.add(null);
hash.add(null);
System.out.println(hash);
*/




// Lets add the employee objects
Set<Employee> tree=new TreeSet();


tree.add(new Employee(15,"Prashanth"));
tree.add(new Employee(1,"Mohith"));
tree.add(new Employee(12,"Rohan"));
System.out.println("Sorted Set:"+tree);






//How to retriev Individual objects from collection

//Iterator: interface,used to iterate over all collection,only forward direction
//ListIterator:interface,used to iterate over only list collection,forward and //backward direction


/*Iterator <Employee>it=data.iterator();
while(it.hasNext())
{
//Employee obj=(Employee)it.next();

Employee obj=it.next();
System.out.println(obj.getEname());
}


ListIterator <Employee>it=data.listIterator();


while(it.hasNext())
{
//Employee obj=(Employee)it.next();

Employee obj=it.next();

System.out.println(obj.getEname());
}

while(it.hasPrevious())
{

Employee obj=it.previous();
System.out.println(obj.getEname());
}
*/


}


}




