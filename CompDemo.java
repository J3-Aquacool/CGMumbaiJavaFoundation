// Comparator : when multiple sorting
// Comparable: when single field sorting

import java.util.*;
class Product 
{
 int pid;
private String pname;

Product (int pid,String pname)
{
this.pid=pid;
this.pname=pname;
}
public String getPname()
{
return pname;
}

public String toString()
{
return pid +"  " +pname;
}

}



class sortbyname implements Comparator<Product>
{
 public  int compare(Product T1, Product T2)
{
return T1.getPname().compareTo(T2.getPname());
}

}

class sortbyid implements Comparator<Product>
{
 public  int compare(Product T1, Product T2)
{

if(T1.pid > T2.pid )
{

return -1;
}

else if(T1.pid < T2.pid )
{

return 1;
}

else

return 0;
}

}

class CompDemo
{

public static void main(String a[])
{
// Lets add the employee objects
Set<Product> tree=new TreeSet(new sortbyid());


tree.add(new Product(151,"Laptop"));
tree.add(new Product(1,"Mouse"));
tree.add(new Product(12,"KeyBoard"));
System.out.println("Sorted Set:"+tree);







}


}




