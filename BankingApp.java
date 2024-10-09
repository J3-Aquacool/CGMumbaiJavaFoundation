
/*: 

Outcome:
Inheritance
Polymorphism
Encapsulation
Abstraction
*/


// PS: Create a Banking Application  
//1. Different Types Accounts [Saving Account,Current Account,Corporate Account]
//2. All Accounts should be able to have the functionalities [open,close]
//3. Every Account can have thier own set of functionalities
	


// Loop Holes: openAccount logic is same for all Accounts which is not applicable
// Demand is that each account object wants to write their own implenetation,means we //have to allow them write their own implenenation



// Hey do we have anything such as Account in real-life



// abstract methods can be in abstract classes not in regular class
//abstract methods dont have a body
//
abstract class Account
{
abstract void openAccount();


//{
//System.out.println("Account Opened");
//}

abstract void closeAccount();
	//{
//System.out.println("Account Closed");
	//}
	
}

class SavingAccount extends Account
{
int minimum_balance=500;
float roi=7.5f;

void openAccount()
{
System.out.println("Saving Account Opened");
}

void closeAccount()
	{
System.out.println("Saving Account Closed");
	}



}
class CurrentAccount extends Account 
{
int minimum_balance=1000;
float roi=5.5f;
int gstno=122345;


void openAccount()
{
System.out.println("Cuurent Account Opened");
}

void closeAccount()
	{
System.out.println(" Current Account Closed");
	}
}
class CorporateAccount extends Account
{
float roi=8.5f;
int minimum_balance=0;
int empid;
String companyemail;

void openAccount()
{
System.out.println("Corporate Account Opened");
}

void closeAccount()
	{
System.out.println("Corporate Account Closed");
	}
}

class BankingApp
{
public static void main(String ap[])
{
CorporateAccount cop=new CorporateAccount();
cop.openAccount();

Account obj=new SavingAccount();
obj.openAccount();

obj=new CurrentAccount();
obj.openAccount();

}
}











