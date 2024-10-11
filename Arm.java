class ReadFile implements AutoCloseable
{
public void readData()
{
String data[]={"Java","Unix","Oracle","Python"};
System.out.println("Reading Data"+data[4]);
}

public void close()throws Exception
{
closeFile();
}

public void closeFile()
{
System.out.println("Iam closing the file");
}


}

class Arm
{

public static void main(String a[])throws Exception
{



try(ReadFile rf=new ReadFile ())
{
rf.readData();

}catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("Problem:"+ae.getMessage());
}


System.out.println("Ending the application");


}


}

