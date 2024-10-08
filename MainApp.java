class Account
{
//data members

int balance=100;
int acid=101;
final float roi=3.14f;  // constatnt
static String banner="Welcome";

 

// Member function
void deposit()
{
System.out.println("Deposit Method");
}
void withdraw()
{
System.out.println("Withdraw Method");
}

int  balance()
{



return balance;
}


}// end of Account class


class MainApp
{

public static void main(String ap[])
{


System.out.println(Account.banner);


Account ref=new Account();// creating and object ,memory allocation

ref.withdraw();
ref.acid=102;
System.out.println(ref.acid);
//ref.roi=3.45f;
System.out.println(ref.roi);


int cashback=20;


int bal=ref.balance();
if(bal >50)
{
bal=bal+30;
System.out.println("Ur total balance is:"+bal);
}




//new Account().deposit();


}

}


// special modifiers
// final,static,transient,volatile,synchronized

