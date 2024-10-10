// Custom / user-Defined Exception

/*

1. The class should be a type of Exception  -IS-A
2. Ensure that the Exception class object is explicitly created.
3. Delegate this excpetion when it has to be arised 



Design an Exception:

throw new Array("""
*/

class NoInteractionException extends Exception
{
NoInteractionException(String message)
{
super(message);

}


}



class Trainer 
{


public void askQuestion(String question,String answer)throws NoInteractionException
{

if(question!=null && answer==null)
{
throw new NoInteractionException("Caused due to no interaction");
}

}


}



class CustomException
{
public static  void main(String a[])throws NoInteractionException
{


Trainer tr=new Trainer ();

//try
//{
tr.askQuestion("What is ur Name",null);
//}catch(NoInteractionException ne)
//{
//System.out.println(ne);
//}


}
}
